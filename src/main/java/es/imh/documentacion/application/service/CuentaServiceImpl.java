package es.imh.documentacion.application.service;

import es.statplans.core.exception.ServiceException;
import es.statplans.economia.application.port.CreateCuentaUseCase;
import es.statplans.economia.domain.model.Cuenta;
import es.statplans.economia.domain.port.CuentaPersist;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class CuentaServiceImpl implements CreateCuentaUseCase {

    CuentaPersist cuentaPersist;

    public CuentaServiceImpl(CuentaPersist cuentaPersist) {
        this.cuentaPersist = cuentaPersist;
    }

    @Override
    public Cuenta createCuenta(Cuenta cuenta) throws ServiceException {
        return cuentaPersist.save(cuenta);
    }
}
