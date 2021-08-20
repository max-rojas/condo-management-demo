package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CuotaCondominal;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CuotaCondominalResponse;

import java.util.List;

public interface ServicioDeCuotaCondominal {

    CuotaCondominal salvarCuotaCondominal(CuotaCondominal cuotaCondominal);
    List<CuotaCondominalResponse> obtenerCuotasDeCondominio(Long id);
}
