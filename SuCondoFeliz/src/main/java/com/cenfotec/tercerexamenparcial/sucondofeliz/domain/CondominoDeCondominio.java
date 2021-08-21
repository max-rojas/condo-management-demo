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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    @Builder
    public CondominoDeCondominio(Long id, String nombre, String apellido, String telefono, String correo,
                                 Condominio condominio, List<CuotaCondominal> listaDeCuotasCondominales,
                                 EstadoDeCondominoDeCondominio estadoDeCondominoDeCondominio, String numeroDeResidencia) {
        super(id, nombre, apellido, telefono, correo);
        this.condominio = condominio;
        this.listaDeCuotasCondominales = listaDeCuotasCondominales;
        this.estadoDeCondominoDeCondominio = estadoDeCondominoDeCondominio;
        this.numeroDeResidencia = numeroDeResidencia;
    }

    public void agregarCuotaCondominal(CuotaCondominal cuotaCondominal) {
        if(this.listaDeCuotasCondominales == null) {
            this.listaDeCuotasCondominales = new ArrayList<>();
            this.listaDeCuotasCondominales.add(cuotaCondominal);
            return;
        }
        this.listaDeCuotasCondominales.add(cuotaCondominal);
    }
}
