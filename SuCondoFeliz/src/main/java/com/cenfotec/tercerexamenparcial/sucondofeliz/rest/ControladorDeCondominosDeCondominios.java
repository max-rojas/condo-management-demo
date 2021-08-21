package com.cenfotec.tercerexamenparcial.sucondofeliz.rest;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request.CondominoDeCondominioRequest;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CondominoDeCondominioResponse;
import com.cenfotec.tercerexamenparcial.sucondofeliz.service.ServicioDeCondominoDeCondominio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("condominos-de-condominio")
public class ControladorDeCondominosDeCondominios {

    private final ServicioDeCondominoDeCondominio servicioDeCondominoDeCondominio;

    @GetMapping("/condominio/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<CondominoDeCondominioResponse> obtenerTodosLosCondominosDeCondominio(
            @PathVariable(name = "id") Long idCondominio) {
        try {
            return servicioDeCondominoDeCondominio.obtenerTodosLosCondominosDeCondominios(idCondominio);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "No se pudieron obtener los condominos de condominios", e);        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CondominoDeCondominioResponse salvarCondominoDeCondominio(@RequestBody CondominoDeCondominioRequest condominoDeCondominioRequest) {
        try {
            return servicioDeCondominoDeCondominio.salvarCondominoDeCondominio(condominoDeCondominioRequest);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.EXPECTATION_FAILED, "El condominio no pudo ser salvado", e);
        }
    }

    @GetMapping(path = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public void desactivarCondominoDeCondominio(@PathVariable(required = true, name = "id") Long id) {
        try {
            servicioDeCondominoDeCondominio.desactivarCondominoDeCondominio(id);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "El ID no pertenece a ningun condomino de condominio", e);
        }
    }
}
