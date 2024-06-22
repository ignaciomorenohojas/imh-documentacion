package es.imh.documentacion.infrastructure.controller;

import es.statplans.economia.api.CuentasApi;
import es.statplans.economia.api.dto.PostCuentaRequest;
import es.statplans.economia.api.dto.PostCuentaResponse;
import es.statplans.economia.application.port.CreateCuentaUseCase;
import es.statplans.economia.infrastructure.controller.adapter.CuentaControllerAdapter;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CuentaController implements CuentasApi {

    CreateCuentaUseCase createCuentaUseCase;
    CuentaControllerAdapter cuentaControllerAdapter;
    @Override
    public ResponseEntity<PostCuentaResponse> createCuenta(PostCuentaRequest postCuentaRequest) {
        return ResponseEntity.ok(
                cuentaControllerAdapter.toResponse(
                        createCuentaUseCase.createCuenta(
                                cuentaControllerAdapter.toDomain(postCuentaRequest)
                )));
    }
}
