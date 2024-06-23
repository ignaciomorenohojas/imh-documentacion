package es.imh.documentacion.infrastructure.persistence.adapter;

import es.imh.core.exception.ServiceException;
import es.imh.documentacion.domain.model.Documento;
import es.imh.documentacion.infrastructure.persistence.entity.DocumentoEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", unexpectedValueMappingException = ServiceException.class)
public interface DocumentoAdapter {

    Documento toDomain(DocumentoEntity entity);
    DocumentoEntity toEntity(Documento documento);

}
