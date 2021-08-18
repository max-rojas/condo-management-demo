package com.cenfotec.tercerexamenparcial.sucondofeliz.rest;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.service.ServicioDeCondominio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("condominios")
public class ControladorDeCondominios {

    private final ServicioDeCondominio servicioDeCondominio;

    @GetMapping(produces = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public List<Condominio> obtenerTodosLosCondominios() {
        return servicioDeCondominio.obtenerTodosLosCondominios();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Condominio salvarCondominio(Condominio condominio) {
        return servicioDeCondominio.salvarCondominio(condominio);
    }

    @GetMapping(path = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public void desactivarCondominio(@PathVariable(required = true, name = "id") Long id) {
        try {
            servicioDeCondominio.desactivarCondominio(id);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "El ID no pertenece a ningun condominio", ex);
        }
    }
}
