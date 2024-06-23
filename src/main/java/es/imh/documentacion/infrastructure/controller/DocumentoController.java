package es.imh.documentacion.infrastructure.controller;

import es.imh.documentacion.api.DocumentosApi;
import es.imh.documentacion.api.dto.CreaDocumentoRequest;
import es.imh.documentacion.api.dto.CreaDocumento201Response;
import es.imh.documentacion.application.port.CreateDocumentoUseCase;
import es.imh.documentacion.infrastructure.controller.adapter.DocumentoControllerAdapter;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DocumentoController implements DocumentosApi {

    CreateDocumentoUseCase createDocumentoUseCase;
    DocumentoControllerAdapter documentoControllerAdapter;
    @Override
    public ResponseEntity<CreaDocumento201Response> creaDocumento(CreaDocumentoRequest creaDocumentoRequest) {
        return ResponseEntity.ok(
                documentoControllerAdapter.toResponse(
                        createDocumentoUseCase.createDocumento(
                                documentoControllerAdapter.toDomain(creaDocumentoRequest)
                )));
    }

}
