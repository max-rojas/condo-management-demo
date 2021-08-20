package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Amenidad;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeAmenidad;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request.AmenidadRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicioDeAmenidadImpl implements ServicioDeAmenidad {

    private final RepositorioDeAmenidad repositorioDeAmenidad;
    private final RepositorioDeCondominio repositorioDeCondominio;

    @Override
    public Amenidad salvarAmenidad(AmenidadRequest amenidadRequest) {
        Condominio condominio = repositorioDeCondominio.findCondominioById(amenidadRequest.getIdCondominio());
        Amenidad amenidad = amenidadRequest.getAmenidad();
        condominio.agregarAmenidad(amenidad);
        amenidad.agregarComdominio(condominio);
        return repositorioDeAmenidad.save(amenidad);
    }

    @Override
    public List<Amenidad> obtenerTodasLasAmenidades() {
        return repositorioDeAmenidad.findAll();
    }


}
