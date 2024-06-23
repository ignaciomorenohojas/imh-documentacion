package es.imh.documentacion.domain.port;

import es.imh.documentacion.domain.model.Documento;

public interface DocumentoPersist {

    Documento save(Documento documento);
}
