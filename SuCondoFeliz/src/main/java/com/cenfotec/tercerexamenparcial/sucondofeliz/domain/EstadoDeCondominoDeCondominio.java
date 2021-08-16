package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EstadoDeCondominoDeCondominio {

    CONDOMINO("condomino"),
    EX_CONDOMINO("ex-condomino");

    private String codigo;
}
