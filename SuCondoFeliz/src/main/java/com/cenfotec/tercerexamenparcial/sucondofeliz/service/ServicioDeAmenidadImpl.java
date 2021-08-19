package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Amenidad;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeAmenidad;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicioDeAmenidadImpl implements ServicioDeAmenidad {

    private final RepositorioDeAmenidad repositorioDeAmenidad;

    @Override
    public Amenidad salvarAmenidad(Amenidad amenidad) {
        return repositorioDeAmenidad.save(amenidad);
    }

    @Override
    public List<Amenidad> obtenerTodasLasAmenidades() {
        return repositorioDeAmenidad.findAll();
    }


}
