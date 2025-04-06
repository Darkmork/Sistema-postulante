package cl.colegiomtn.sistpostulante.controller;

import cl.colegiomtn.sistpostulante.model.Postulante;
import cl.colegiomtn.sistpostulante.repository.PostulanteRepository;
import cl.colegiomtn.sistpostulante.util.RutValidador;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postulantes")
public class PostulanteController {

    private final PostulanteRepository postulanteRepository;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Postulante postulante) {
        if (!RutValidador.esRutValido(postulante.getRut())) {
            return ResponseEntity.badRequest().body("RUT inválido");
        }

        return ResponseEntity.ok(postulanteRepository.save(postulante));
    }
    public PostulanteController(PostulanteRepository postulanteRepository) {
        this.postulanteRepository = postulanteRepository;
    }

    @GetMapping
    public List<Postulante> getAll() {
        return postulanteRepository.findAll();
    }

    @PostMapping("/raw")
    public Postulante createRaw(@RequestBody Postulante postulante) {
        return postulanteRepository.save(postulante);
    }

    @GetMapping("/{id}")
    public Postulante getById(@PathVariable Long id) {
        return postulanteRepository.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        postulanteRepository.deleteById(id);
    }

    @GetMapping("/ping")
    public ResponseEntity<?> ping() {
        return ResponseEntity.ok("Funciona");
    }

}
