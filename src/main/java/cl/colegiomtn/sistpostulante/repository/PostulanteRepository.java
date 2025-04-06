package cl.colegiomtn.sistpostulante.repository;

import cl.colegiomtn.sistpostulante.model.Postulante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostulanteRepository extends JpaRepository<Postulante, Long> {
}
