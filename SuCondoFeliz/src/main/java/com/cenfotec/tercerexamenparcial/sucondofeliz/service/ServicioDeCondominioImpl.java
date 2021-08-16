package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicioDeCondominioImpl implements ServicioDeCondominio{

    @Autowired
    private final RepositorioDeCondominio repositorioDeCondominio;

    @Override
    public List<Condominio> obtenerTodosLosCondominios() {
        return repositorioDeCondominio.findAll();
    }
}
