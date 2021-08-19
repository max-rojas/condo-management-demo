package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Amenidad;

import java.util.List;

public interface ServicioDeAmenidad {

    Amenidad salvarAmenidad(Amenidad amenidad);
    List<Amenidad> obtenerTodasLasAmenidades();
}
