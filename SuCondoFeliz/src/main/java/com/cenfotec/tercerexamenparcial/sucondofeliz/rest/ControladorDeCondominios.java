package com.cenfotec.tercerexamenparcial.sucondofeliz.rest;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.service.ServicioDeCondominio;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("condominios")
public class ControladorDeCondominios {

    private final ServicioDeCondominio servicioDeCondominio;

    @GetMapping(produces = "application/json")
    public List<Condominio> obtenerTodosLosCondominios() {
        return servicioDeCondominio.obtenerTodosLosCondominios();
    }
}
