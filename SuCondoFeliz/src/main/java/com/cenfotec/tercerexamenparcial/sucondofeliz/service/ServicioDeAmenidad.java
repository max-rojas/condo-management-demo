package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Amenidad;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request.AmenidadRequest;

import java.util.List;

public interface ServicioDeAmenidad {

    Amenidad salvarAmenidad(AmenidadRequest amenidadRequest);
    List<Amenidad> obtenerTodasLasAmenidades();
}
