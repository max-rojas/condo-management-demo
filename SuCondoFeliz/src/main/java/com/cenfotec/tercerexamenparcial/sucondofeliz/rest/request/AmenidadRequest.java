package com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Amenidad;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AmenidadRequest {

    private Long IdCondominio;
    private Amenidad amenidad;
}
