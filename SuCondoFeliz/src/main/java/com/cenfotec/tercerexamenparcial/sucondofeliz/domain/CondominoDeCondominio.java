package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class CondominoDeCondominio extends Persona{

    @ManyToOne
    private Condominio condominio;
    @OneToMany(mappedBy = "condominoDeCondominio")
    @JsonIgnore
    private List<CuotaCondominal> listaDeCuotasCondominales = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private EstadoDeCondominoDeCondominio estadoDeCondominoDeCondominio;
    private String numeroDeResidencia;
}
