package es.imh.documentacion.infrastructure.persistence.repository;

import es.statplans.economia.infrastructure.persistence.entity.CuentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentasRepository extends JpaRepository<CuentaEntity, String> {
}
