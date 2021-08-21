package com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CondominoDeCondominioRequest {
    	private String nombre;
        private String apellido;
        private String telefono;
        private String correo;
        private Long idCondominio;
        private String estado;
        private String numeroDeResidencia;
}
