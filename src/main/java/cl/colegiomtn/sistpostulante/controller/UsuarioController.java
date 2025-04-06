package cl.colegiomtn.sistpostulante.controller;

import cl.colegiomtn.sistpostulante.model.Usuario;
import cl.colegiomtn.sistpostulante.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/{id}")
    public Usuario getById(@PathVariable Long id) {
        return usuarioRepository.findById(id).orElseThrow();
    }
}
