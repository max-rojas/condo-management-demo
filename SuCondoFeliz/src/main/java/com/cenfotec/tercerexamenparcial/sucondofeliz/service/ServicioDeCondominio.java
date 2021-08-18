package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;

import java.util.List;

public interface ServicioDeCondominio {

    List<Condominio> obtenerTodosLosCondominios();
    Condominio salvarCondominio(Condominio condominio);
    void desactivarCondominio(Long id);
}
