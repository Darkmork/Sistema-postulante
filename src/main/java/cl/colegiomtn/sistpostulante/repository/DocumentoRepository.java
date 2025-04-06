package cl.colegiomtn.sistpostulante.repository;

import cl.colegiomtn.sistpostulante.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {
}
