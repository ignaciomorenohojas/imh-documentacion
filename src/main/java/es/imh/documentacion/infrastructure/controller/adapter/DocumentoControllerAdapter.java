package es.imh.documentacion.infrastructure.controller.adapter;

import es.imh.documentacion.api.dto.CreaDocumentoRequest;
import es.imh.documentacion.api.dto.CreaDocumento201Response;
import es.imh.core.exception.ServiceException;
import es.imh.documentacion.domain.model.Documento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", unexpectedValueMappingException = ServiceException.class)
public interface DocumentoControllerAdapter {

    Documento toDomain(CreaDocumentoRequest request);
    CreaDocumento201Response toResponse(Documento documento);

}
