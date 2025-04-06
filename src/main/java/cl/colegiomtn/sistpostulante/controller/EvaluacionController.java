package cl.colegiomtn.sistpostulante.controller;

import cl.colegiomtn.sistpostulante.model.Evaluacion;
import cl.colegiomtn.sistpostulante.repository.EvaluacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evaluaciones")
public class EvaluacionController {

    private final EvaluacionRepository evaluacionRepository;

    public EvaluacionController(EvaluacionRepository evaluacionRepository) {
        this.evaluacionRepository = evaluacionRepository;
    }

    @GetMapping
    public List<Evaluacion> getAll() {
        return evaluacionRepository.findAll();
    }

    @PostMapping
    public Evaluacion create(@RequestBody Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    @GetMapping("/{id}")
    public Evaluacion getById(@PathVariable Long id) {
        return evaluacionRepository.findById(id).orElseThrow();
    }
}
