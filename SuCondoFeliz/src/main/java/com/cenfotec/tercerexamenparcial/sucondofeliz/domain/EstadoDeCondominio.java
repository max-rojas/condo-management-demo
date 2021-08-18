package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum EstadoDeCondominio {

    @JsonProperty("ACTIVO") ACTIVO,
    @JsonProperty("INACTIVO") INACTIVO;
}
