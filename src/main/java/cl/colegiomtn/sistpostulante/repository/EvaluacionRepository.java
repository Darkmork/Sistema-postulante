package cl.colegiomtn.sistpostulante.repository;

import cl.colegiomtn.sistpostulante.model.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluacionRepository extends JpaRepository<Evaluacion, Long> {
}
