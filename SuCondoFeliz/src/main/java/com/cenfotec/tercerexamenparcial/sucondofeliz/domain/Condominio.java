package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Condominio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    @ManyToOne(fetch = FetchType.LAZY)
    private RepresentanteDeCondominio representatneDelCondominio;
    @Embedded
    private Direccion direccion;
    @OneToMany
    private Set<CondominoDeCondominio> condominoDeCondominio;

    private String nombreDeCondominio;
    private String cedulaJuridicaDeAsociacion;
    private Integer cantidadDeUnidades;
    private Double cuotaCondominal;
    private EstadoDeCondominio estado;



}
