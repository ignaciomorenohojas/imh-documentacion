package es.imh.documentacion.domain.port;

import es.statplans.economia.domain.model.Cuenta;

public interface CuentaPersist {

    Cuenta save(Cuenta cuenta);
}
