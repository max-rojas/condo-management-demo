package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.EstadoDeCondominio;

import java.util.List;

public interface ServicioDeCondominio {

    List<Condominio> obtenerTodosLosCondominios(EstadoDeCondominio estadoDeCondominio);
    Condominio salvarCondominio(Condominio condominio);
    void desactivarCondominio(Long id);
}
