package com.cenfotec.tercerexamenparcial.sucondofeliz.service;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.Condominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.EstadoDeCondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.mapper.CondominoDeCondominioMapper;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.repository.RepositorioDeCondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.request.CondominoDeCondominioRequest;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CondominoDeCondominioResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ServicioDeCondominoDeCondominioImpl implements ServicioDeCondominoDeCondominio{

    private final RepositorioDeCondominoDeCondominio repositorioDeCondominoDeCondominio;
    private final RepositorioDeCondominio repositorioDeCondominio;
    private final CondominoDeCondominioMapper condominoDeCondominioMapper;

    @Override
    public List<CondominoDeCondominioResponse> obtenerTodosLosCondominosDeCondominios(Long id) {
        return condominoDeCondominioMapper
                .mapListToCondominoDeCondominioRequestList(repositorioDeCondominoDeCondominio.findAllByCondominio_Id(id));
    }

    @Override
    public CondominoDeCondominioResponse salvarCondominoDeCondominio(CondominoDeCondominioRequest condominoDeCondominioRequest) {
        CondominoDeCondominio condominoDeCondominio = CondominoDeCondominio.builder()
                .nombre(condominoDeCondominioRequest.getNombre())
                .apellido(condominoDeCondominioRequest.getApellido())
                .correo(condominoDeCondominioRequest.getCorreo())
                .telefono(condominoDeCondominioRequest.getTelefono())
                .listaDeCuotasCondominales(new ArrayList<>())
                .numeroDeResidencia(condominoDeCondominioRequest.getNumeroDeResidencia())
                .estadoDeCondominoDeCondominio(EstadoDeCondominoDeCondominio.valueOf(condominoDeCondominioRequest.getEstado()))
                .build();
        Condominio condominio = repositorioDeCondominio.findCondominioById(condominoDeCondominioRequest.getIdCondominio());
        condominio.getListaDeCondominosDeCondominio().add(condominoDeCondominio);
        repositorioDeCondominio.save(condominio);
        condominoDeCondominio.setCondominio(condominio);
        return condominoDeCondominioMapper
                .mapToCondominoDeCondominioRequest(repositorioDeCondominoDeCondominio.save(condominoDeCondominio));
    }

    @Override
    public void desactivarCondominoDeCondominio(Long id) {
        CondominoDeCondominio condominoDeCondominio = repositorioDeCondominoDeCondominio.getById(id);
        condominoDeCondominio.setEstadoDeCondominoDeCondominio(EstadoDeCondominoDeCondominio.EX_CONDOMINO);
        repositorioDeCondominoDeCondominio.save(condominoDeCondominio);
    }
}
