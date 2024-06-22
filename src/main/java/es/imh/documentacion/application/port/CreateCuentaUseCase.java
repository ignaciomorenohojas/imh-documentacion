package es.imh.documentacion.application.port;

import es.statplans.core.exception.ServiceException;
import es.statplans.economia.domain.model.Cuenta;

public interface CreateCuentaUseCase {
    Cuenta createCuenta(Cuenta cuenta) throws ServiceException;
}
