package es.imh.documentacion.infrastructure.controller;

import es.imh.documentacion.Application;
import es.imh.documentacion.domain.model.Documento;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DocumentoControllerTest {
    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Test
    void testSaveDocumento() throws JSONException {

        Documento documento = Documento.builder()
                .nombre("Documento1")
                .descripcion("Descripción del documento 1")
                .build();

        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Documento> entity = new HttpEntity<>(documento, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/documentacion/documentos"),
                HttpMethod.POST, entity, String.class);

        assertEquals("{\"id\":\"1\",\"nombre\":\"Documento1\",\"iban\":\"Descripción del documento 1\"}", response.getBody());
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}