package com.cenfotec.tercerexamenparcial.sucondofeliz.mapper;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CuotaCondominal;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request.CuotacondominalRequest;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CuotaCondominalResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class CuotaCondominalMapper {

    public List<CuotaCondominalResponse> mapToCuotaCondominalResponseList(List<CuotaCondominal> cuotaCondominalList) {
        return cuotaCondominalList.stream().filter(cuota -> Objects.nonNull(cuota))
                .map(this::mapToCuotaCondominalResponse).collect(Collectors.toList());
    }

    private CuotaCondominalResponse mapToCuotaCondominalResponse(CuotaCondominal cuotaCondominal) {
        return CuotaCondominalResponse.builder()
                .cuotaId(cuotaCondominal.getId())
                .nombreDeCondomino(cuotaCondominal.getCondominoDeCondominio().getNombre())
                .ApellidoDeCondomino(cuotaCondominal.getCondominoDeCondominio().getApellido())
                .fechaDeCuota(cuotaCondominal.getFechaDeCuota())
                .montoDeCuota(cuotaCondominal.getMontoDeCuota())
                .build();
    }

    public CuotaCondominal mapToCuotaCondominal(CuotacondominalRequest cuotacondominalRequest,
                                                 Condominio condominio, CondominoDeCondominio condominoDeCondominio) {
        return CuotaCondominal.builder()
                .condominio(condominio)
                .condominoDeCondominio(condominoDeCondominio)
                .montoDeCuota(cuotacondominalRequest.getMontoDeCuota())
                .fechaDeCuota(LocalDate.now())
                .build();
    }
}
