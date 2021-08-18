package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.EstadoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominio;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class ServicioDeCondominioImpl implements ServicioDeCondominio{

    @Autowired
    private final RepositorioDeCondominio repositorioDeCondominio;

    @Override
    public List<Condominio> obtenerTodosLosCondominios() {
        return repositorioDeCondominio.findAll();
    }

    @Override
    public Condominio salvarCondominio(Condominio condominio) {
        return repositorioDeCondominio.save(condominio);
    }

    @Override
    public void desactivarCondominio(Long id) {
        repositorioDeCondominio.save(
                Condominio.builder()
                        .Id(id)
                        .estado(EstadoDeCondominio.INACTIVO)
                        .build()
        );
    }
}
