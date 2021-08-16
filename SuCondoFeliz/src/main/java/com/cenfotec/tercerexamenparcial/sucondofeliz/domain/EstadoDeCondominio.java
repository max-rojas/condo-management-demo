package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EstadoDeCondominio {
    ACTIVO("A"),
    INACTIVO("I");

    private String codigo;
}
