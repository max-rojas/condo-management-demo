package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
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
    @ManyToOne
    private RepresentanteDeCondominio representatneDelCondominio;
    @Embedded
    private Direccion direccion;
    @OneToMany(mappedBy = "condominio")
    @JsonIgnore
    private Set<CondominoDeCondominio> condominoDeCondominio = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "CONDOMINIO_AMENIDAD",
    joinColumns = @JoinColumn(name = "CONDOMINIO_ID"),
    inverseJoinColumns = @JoinColumn(name = "AMENIDAD_ID"))
    @JsonIgnore
    private Set<Amenidad> amenidades;

    @Enumerated(EnumType.STRING)
    private EstadoDeCondominio estado;

    private String nombreDeCondominio;
    private String cedulaJuridicaDeAsociacion;
    private Integer cantidadDeUnidades;
    private Double cuotaCondominal;




}
