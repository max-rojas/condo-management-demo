package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class CuotaCondominal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne(fetch = FetchType.LAZY)
    private CondominoDeCondominio condominoDeCondominio;

    private Double montoDeCuota;
    private LocalDate fechaDeCuota;
}
