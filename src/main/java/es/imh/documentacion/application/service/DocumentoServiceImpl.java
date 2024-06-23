package es.imh.documentacion.application.service;

import es.imh.core.exception.ServiceException;
import es.imh.documentacion.application.port.CreateDocumentoUseCase;
import es.imh.documentacion.domain.model.Documento;
import es.imh.documentacion.domain.port.DocumentoPersist;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class DocumentoServiceImpl implements CreateDocumentoUseCase {

    DocumentoPersist documentoPersist;

    public DocumentoServiceImpl(DocumentoPersist documentoPersist) {
        this.documentoPersist = documentoPersist;
    }

    @Override
    public Documento createDocumento(Documento documento) throws ServiceException {
        return documentoPersist.save(documento);
    }
}
