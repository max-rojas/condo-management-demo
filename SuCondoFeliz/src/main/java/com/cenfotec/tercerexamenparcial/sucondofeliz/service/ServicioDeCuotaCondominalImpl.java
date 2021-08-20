package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CuotaCondominal;
import com.cenfotec.tercerexamenparcial.sucondofeliz.mapper.CuotaCondominalToCuotaCondominalResponseMapper;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCuotaCondominal;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CuotaCondominalResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicioDeCuotaCondominalImpl implements ServicioDeCuotaCondominal {

    private final RepositorioDeCuotaCondominal repositorioDeCuotaCondominal;
    private final RepositorioDeCondominio repositorioDeCondominio;
    private final CuotaCondominalToCuotaCondominalResponseMapper cuotaCondominalToCuotaCondominalResponseMapper;


    @Override
    public CuotaCondominal salvarCuotaCondominal(CuotaCondominal cuotaCondominal) {
        return repositorioDeCuotaCondominal.save(cuotaCondominal);
    }

    @Override
    public List<CuotaCondominalResponse> obtenerCuotasDeCondominio(Long id) {
        return cuotaCondominalToCuotaCondominalResponseMapper
                .mapToCuotaCondominalResponseList(repositorioDeCuotaCondominal.findAllByCondominio_Id(id));
    }
}
