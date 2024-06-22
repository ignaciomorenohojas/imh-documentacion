package es.imh.documentacion.infrastructure.persistence.adapter;

import es.statplans.core.exception.ServiceException;
import es.statplans.economia.domain.model.Cuenta;
import es.statplans.economia.infrastructure.persistence.entity.CuentaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", unexpectedValueMappingException = ServiceException.class)
public interface CuentaAdapter {

    Cuenta toDomain(CuentaEntity entity);
    CuentaEntity toEntity(Cuenta cuenta);

}
