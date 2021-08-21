package com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CuotacondominalRequest {

    private Long condominoDeCondominioId;
    private Long condominioId;
    private Double montoDeCuota;
}
