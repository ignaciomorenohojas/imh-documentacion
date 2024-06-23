package es.imh.documentacion.infrastructure.persistence.repository;

import es.imh.documentacion.infrastructure.persistence.entity.DocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentosRepository extends JpaRepository<DocumentoEntity, String> {
}
