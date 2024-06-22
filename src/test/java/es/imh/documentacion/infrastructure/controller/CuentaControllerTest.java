package es.imh.documentacion.infrastructure.controller;

import es.statplans.economia.Application;
import es.statplans.economia.domain.model.Cuenta;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.skyscreamer.jsonassert.JSONAssert;
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
class CuentaControllerTest {
    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Test
    void testSaveCuenta() throws JSONException {

        Cuenta cuenta = Cuenta.builder()
                .codigo("CUENTA12345")
                .nombre("Cuenta1")
                .iban("ES000000000000")
                .build();

        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Cuenta> entity = new HttpEntity<>(cuenta, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/cuentas"),
                HttpMethod.POST, entity, String.class);

        assertEquals("{\"codigo\":\"CUENTA12345\",\"nombre\":\"Cuenta1\",\"iban\":\"ES000000000000\"}", response.getBody());
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}