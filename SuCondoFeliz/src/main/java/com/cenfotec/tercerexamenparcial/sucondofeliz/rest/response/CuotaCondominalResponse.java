package com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CuotaCondominalResponse {
    private Long cuotaId;
    private String nombreDeCondomino;
    private String ApellidoDeCondomino;
    private LocalDate fechaDeCuota;
    private Double montoDeCuota;
}
