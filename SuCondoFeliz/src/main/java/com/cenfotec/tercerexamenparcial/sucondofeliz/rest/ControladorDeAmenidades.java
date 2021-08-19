package com.cenfotec.tercerexamenparcial.sucondofeliz.rest;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Amenidad;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.service.ServicioDeAmenidad;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("amenidades")
public class ControladorDeAmenidades {

    private final ServicioDeAmenidad servicioDeAmenidad;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Amenidad salvarAmenidad(@RequestBody Amenidad amenidad) {
        return servicioDeAmenidad.salvarAmenidad(amenidad);
    }

    @GetMapping("/condominio/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Amenidad> obtenerTodasLasAmenidades(@PathVariable(name = "id") Long idCondominio) {
        return servicioDeAmenidad.obtenerTodasLasAmenidades();
    }
}
