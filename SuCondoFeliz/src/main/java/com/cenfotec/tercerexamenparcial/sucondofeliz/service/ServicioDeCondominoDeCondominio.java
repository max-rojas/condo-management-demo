package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request.CondominoDeCondominioRequest;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CondominoDeCondominioResponse;

import java.util.List;

public interface ServicioDeCondominoDeCondominio {

    List<CondominoDeCondominioResponse> obtenerTodosLosCondominosDeCondominios(Long id);
    CondominoDeCondominioResponse salvarCondominoDeCondominio(CondominoDeCondominioRequest condominoDeCondominioRequest);
    void desactivarCondominoDeCondominio(Long id);}
