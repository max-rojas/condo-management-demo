package com.cenfotec.tercerexamenparcial.sucondofeliz.rest;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CuotaCondominal;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CuotaCondominalResponse;
import com.cenfotec.tercerexamenparcial.sucondofeliz.service.ServicioDeCuotaCondominal;
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
@RequestMapping("cuotas-condominales")
public class ControldadorDeCuotasCondominales {

    private final ServicioDeCuotaCondominal servicioDeCuotaCondominal;


    @GetMapping(path = "condominio/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<CuotaCondominalResponse> obtenerCuotasDeCondominio(@PathVariable(required = true, name = "id") Long id) {
        try {
            return servicioDeCuotaCondominal.obtenerCuotasDeCondominio(id);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "El ID no pertenece a ningun condominio", e);
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CuotaCondominal salvarCuotaCondominal(@RequestBody CuotaCondominal cuotaCondominal) {
        try {
            return servicioDeCuotaCondominal.salvarCuotaCondominal(cuotaCondominal);
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.EXPECTATION_FAILED, "La cuota condominal no pudo ser salvada", e);
        }
    }
}
