package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.EstadoDeCondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominoDeCondominio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class ServicioDeCondominoDeCondominioImpl implements ServicioDeCondominoDeCondominio{

    private final RepositorioDeCondominoDeCondominio repositorioDeCondominoDeCondominio;

    @Override
    public List<CondominoDeCondominio> obtenerTodosLosCondominosDeCondominios(Long id) {
        return repositorioDeCondominoDeCondominio.findAllByCondominio_Id(id);
    }

    @Override
    public CondominoDeCondominio salvarCondominoDeCondominio(CondominoDeCondominio condominio) {
        return null;
    }

    @Override
    public void desactivarCondominoDeCondominio(Long id) {

    }
}
