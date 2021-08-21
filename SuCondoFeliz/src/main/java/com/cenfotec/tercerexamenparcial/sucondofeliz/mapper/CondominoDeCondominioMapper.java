package com.cenfotec.tercerexamenparcial.sucondofeliz.mapper;

import com.cenfotec.tercerexamenparcial.sucondofeliz.domain.CondominoDeCondominio;
import com.cenfotec.tercerexamenparcial.sucondofeliz.rest.response.CondominoDeCondominioResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CondominoDeCondominioMapper {

    public CondominoDeCondominioResponse mapToCondominoDeCondominioRequest(CondominoDeCondominio condominoDeCondominio) {
        return mapCondominoDeCondominioToCondominoDeCondominioRequest(condominoDeCondominio);
    }


    public List<CondominoDeCondominioResponse> mapListToCondominoDeCondominioRequestList(
            List<CondominoDeCondominio> condominoDeCondominioList) {
        return condominoDeCondominioList.stream()
                .map(this::mapToCondominoDeCondominioRequest).collect(Collectors.toList());
    }


    private CondominoDeCondominioResponse mapCondominoDeCondominioToCondominoDeCondominioRequest(CondominoDeCondominio condominoDeCondominio) {
        return CondominoDeCondominioResponse.builder()
                .idCondominio(condominoDeCondominio.getId())
                .nombre(condominoDeCondominio.getNombre())
                .apellido(condominoDeCondominio.getApellido())
                .correo(condominoDeCondominio.getCorreo())
                .telefono(condominoDeCondominio.getTelefono())
                .estado(condominoDeCondominio.getEstadoDeCondominoDeCondominio().name())
                .numeroDeResidencia(condominoDeCondominio.getNumeroDeResidencia())
                .build();
    }
}
