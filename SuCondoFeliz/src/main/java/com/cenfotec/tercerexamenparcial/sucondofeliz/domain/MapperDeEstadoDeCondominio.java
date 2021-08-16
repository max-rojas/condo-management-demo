package com.cenfotec.tercerexamenparcial.sucondofeliz.domain;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class MapperDeEstadoDeCondominio implements AttributeConverter<EstadoDeCondominio, String> {

    @Override
    public String convertToDatabaseColumn(EstadoDeCondominio estadoDeCondominio) {
        if (estadoDeCondominio == null) {
            return null;
        }
        return estadoDeCondominio.getCodigo();
    }

    @Override
    public EstadoDeCondominio convertToEntityAttribute(String code) {
        if (code == null) {
            return null;
        }

        return Stream.of(EstadoDeCondominio.values())
                .filter(c -> c.getCodigo().equals(code))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
