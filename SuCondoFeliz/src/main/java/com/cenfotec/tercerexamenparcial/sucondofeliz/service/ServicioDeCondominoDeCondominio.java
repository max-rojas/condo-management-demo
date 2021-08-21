package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.EstadoDeCondominoDeCondominio;

import java.util.List;

public interface ServicioDeCondominoDeCondominio {

    List<CondominoDeCondominio> obtenerTodosLosCondominosDeCondominios(Long id);
    CondominoDeCondominio salvarCondominoDeCondominio(CondominoDeCondominio condominio);
    void desactivarCondominoDeCondominio(Long id);}
