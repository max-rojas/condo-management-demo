package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CuotaCondominal;
import com.cenfotec.tercerexamenparcial.sucondofeliz.mapper.CuotaCondominalMapper;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCuotaCondominal;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request.CuotacondominalRequest;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CuotaCondominalResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicioDeCuotaCondominalImpl implements ServicioDeCuotaCondominal {

    private final RepositorioDeCuotaCondominal repositorioDeCuotaCondominal;
    private final CuotaCondominalMapper cuotaCondominalMapper;
    private final RepositorioDeCondominio repositorioDeCondominio;
    private final RepositorioDeCondominoDeCondominio repositorioDeCondominoDeCondominio;


    @Override
    public CuotaCondominalResponse salvarCuotaCondominal(CuotacondominalRequest cuotacondominalRequest) {

        Condominio condominio = repositorioDeCondominio.findCondominioById(cuotacondominalRequest.getCondominioId());
        CondominoDeCondominio condominoDeCondominio =
                repositorioDeCondominoDeCondominio.getById(cuotacondominalRequest.getCondominoDeCondominioId());
        CuotaCondominal cuotaCondominal = cuotaCondominalMapper.mapToCuotaCondominal(cuotacondominalRequest,
                condominio, condominoDeCondominio);
        condominio.getListaDeCuotasCondominales().add(cuotaCondominal);
        condominoDeCondominio.getListaDeCuotasCondominales().add(cuotaCondominal);

        return prepareCuotaCondominalResponse(repositorioDeCuotaCondominal.save(cuotaCondominal));
    }

    @Override
    public List<CuotaCondominalResponse> obtenerCuotasDeCondominio(Long id) {
        return cuotaCondominalMapper
                .mapToCuotaCondominalResponseList(repositorioDeCuotaCondominal.findAllByCondominio_Id(id));
    }

    private CuotaCondominalResponse prepareCuotaCondominalResponse(CuotaCondominal cuotaCondominal) {
        return cuotaCondominalMapper
                .mapToCuotaCondominalResponseList(Arrays.asList(cuotaCondominal)).stream().findFirst().get();
    }
}
