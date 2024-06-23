package es.imh.documentacion.application.port;

import es.imh.core.exception.ServiceException;
import es.imh.documentacion.domain.model.Documento;

public interface CreateDocumentoUseCase {
    Documento createDocumento(Documento documento) throws ServiceException;
}
