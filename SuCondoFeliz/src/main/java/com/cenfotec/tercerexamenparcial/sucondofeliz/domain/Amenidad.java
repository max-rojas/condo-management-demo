package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.yaml.snakeyaml.util.ArrayUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Amenidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(mappedBy = "amenidades")
    @JsonIgnore
    private List<Condominio> condominios;

    private String nombre;
    private String descripcion;

    public void agregarComdominio(Condominio condominio) {
        if(this.condominios == null) {
            this.condominios = new ArrayList<>();
            this.condominios.add(condominio);
            return;
        }
        this.condominios.add(condominio);
    }
}
