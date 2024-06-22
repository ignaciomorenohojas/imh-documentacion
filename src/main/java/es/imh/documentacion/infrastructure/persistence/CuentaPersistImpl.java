package es.imh.documentacion.infrastructure.persistence;

import es.statplans.core.enums.CommonError;
import es.statplans.core.exception.ErrorCode;
import es.statplans.core.exception.ServiceException;
import es.statplans.economia.domain.model.Cuenta;
import es.statplans.economia.domain.port.CuentaPersist;
import es.statplans.economia.infrastructure.persistence.adapter.CuentaAdapter;
import es.statplans.economia.infrastructure.persistence.repository.CuentasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CuentaPersistImpl implements CuentaPersist {

    @Autowired
    CuentasRepository cuentasRepository;
    @Autowired
    CuentaAdapter cuentaAdapter;


    @Override
    public Cuenta save(Cuenta cuenta) throws ServiceException {
        try {
            return cuentaAdapter.toDomain(cuentasRepository.save(cuentaAdapter.toEntity(cuenta)));
        } catch (Exception e) {
            throw new ServiceException("Error al guardar la cuenta", e, ErrorCode.ERROR_DB_CALL);
        }
    }
}
