package es.imh.documentacion.infrastructure.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "cuentas")
public class CuentaEntity {

        @Id
        @Column(name = "cod_cuenta",unique=true, nullable = false)
        String codigo;
        String nombre;
        String iban;

}
