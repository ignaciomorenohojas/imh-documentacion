package es.imh.documentacion.domain.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class Cuenta {

        String codigo;
        String nombre;
        String iban;
}
