package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum EstadoDeCondominoDeCondominio {

    @JsonProperty("CONDOMINO") CONDOMINO,
    @JsonProperty("EX_CONDOMINO") EX_CONDOMINO;
}
