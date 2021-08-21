package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CuotaCondominal;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request.CuotacondominalRequest;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CuotaCondominalResponse;

import java.util.List;

public interface ServicioDeCuotaCondominal {

    CuotaCondominalResponse salvarCuotaCondominal(CuotacondominalRequest cuotacondominalRequest);
    List<CuotaCondominalResponse> obtenerCuotasDeCondominio(Long id);
}
