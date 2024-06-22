package es.imh.documentacion.infrastructure.controller.adapter;

import es.statplans.economia.api.dto.PostCuentaRequest;
import es.statplans.economia.api.dto.PostCuentaResponse;
import es.statplans.core.exception.ServiceException;
import es.statplans.economia.domain.model.Cuenta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", unexpectedValueMappingException = ServiceException.class)
public interface CuentaControllerAdapter {

    Cuenta toDomain(PostCuentaRequest request);
    PostCuentaResponse toResponse(Cuenta cuenta);

}
