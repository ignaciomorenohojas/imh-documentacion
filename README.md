# imh-documentacion

Gestión de la documentación de imh.

## Tabla de Contenidos

- [Descripción](#descripción)
- [Características](#características)
- [Tecnologías](#tecnologías)
- [Requisitos Previos](#requisitos-previos)
- [Instalación](#instalación)
- [Configuración](#configuración)
- [Ejecución](#ejecución)
- [Pruebas](#pruebas)
- [Contribuir](#contribuir)
- [Licencia](#licencia)

## Descripción

Aplicación rest en arquitectura hexagonal () para la gestión de documentación de Ignacio Moreno Hojas.

## Características

- CRUD de documentos

## Tecnologías

- imh-lib-base:
  - Java 21
  - Maven 3.8
  - Lombok
  - MapStruct
- imh-lib-core:
  - Apache Commons Lang
- imh-lib-microservices:
  - OpenApi
  - Swagger Annotations
- imh-lib-test:
  - H2
  - JUnit
- JPA

## Requisitos Previos

Lista de software y herramientas que deben estar instaladas en tu sistema:

- JDK 21 o superior
- Maven 3.8.0 o superior
- MySQL

## Instalación

Pasos para clonar el repositorio e instalar las dependencias:

```sh
git clone https://github.com/ignaciomorenohojas/imh-documentacion.git
cd imh-documentacion
mvn clean install
```

## Configuración

Instrucciones para configurar la base de datos y otros ajustes necesarios:

1. Crea una base de datos en MySQL:
    ```sql
    CREATE DATABASE documentacion;
    ```
2. Actualiza las credenciales de la base de datos en el archivo `application.properties`:
    ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/documentacion
   spring.datasource.username=tuusuario
   spring.datasource.password=tucontraseña
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
    ``` 
## Ejecución
Instrucciones para ejecutar la aplicación localmente:

    ```sh
    mvn spring-boot:run
    ```
La aplicación estará disponible en http://localhost:8080.

## Pruebas
Instrucciones para ejecutar las pruebas unitarias:

    ```sh
    mvn test
    ```
## Contribuir
Instrucciones para contribuir al proyecto:

1. Haz un fork del repositorio.
2. Crea una nueva rama (git checkout -b feature/nueva-feature).
3. Realiza los cambios necesarios y realiza commits (git commit -m 'Añadir nueva feature').
4. Sube tus cambios a GitHub (git push origin feature/nueva-feature).
5. Abre un Pull Request.

## Licencia
Información sobre la licencia del proyecto.

