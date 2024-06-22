package es.imh.documentacion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Slf4j
@SpringBootApplication
@Configuration
@ComponentScan(
    basePackages = {
      "es.statplans.core",
      "es.statplans.economia"
    })
public class Application {

  protected Application() {
    LOGGER.info("Starting sp-economia microservice");
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
