package cl.colegiomtn.sistpostulante.controller;

import cl.colegiomtn.sistpostulante.model.Documento;
import cl.colegiomtn.sistpostulante.repository.DocumentoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documentos")
public class DocumentoController {

    private final DocumentoRepository documentoRepository;

    public DocumentoController(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }

    @GetMapping
    public List<Documento> getAll() {
        return documentoRepository.findAll();
    }

    @PostMapping
    public Documento create(@RequestBody Documento documento) {
        return documentoRepository.save(documento);
    }

    @GetMapping("/{id}")
    public Documento getById(@PathVariable Long id) {
        return documentoRepository.findById(id).orElseThrow();
    }
}
