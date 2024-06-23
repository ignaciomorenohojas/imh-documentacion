package es.imh.documentacion.infrastructure.persistence;

import es.imh.core.enums.CommonError;
import es.imh.core.exception.ErrorCode;
import es.imh.core.exception.ServiceException;
import es.imh.documentacion.domain.model.Documento;
import es.imh.documentacion.domain.port.DocumentoPersist;
import es.imh.documentacion.infrastructure.persistence.adapter.DocumentoAdapter;
import es.imh.documentacion.infrastructure.persistence.repository.DocumentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DocumentoPersistImpl implements DocumentoPersist {

    @Autowired
    DocumentosRepository documentosRepository;
    @Autowired
    DocumentoAdapter documentoAdapter;


    @Override
    public Documento save(Documento documento) throws ServiceException {
        try {
            return documentoAdapter.toDomain(documentosRepository.save(documentoAdapter.toEntity(documento)));
        } catch (Exception e) {
            throw new ServiceException("Error al guardar el documento", e, ErrorCode.ERROR_DB_CALL);
        }
    }
}
