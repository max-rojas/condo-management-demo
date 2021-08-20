package com.cenfotec.tercerexamenparcial.sucondofeliz.mapper;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CuotaCondominal;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CuotaCondominalResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class CuotaCondominalToCuotaCondominalResponseMapper {

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
}
