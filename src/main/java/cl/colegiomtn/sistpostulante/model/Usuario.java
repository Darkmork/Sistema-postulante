package cl.colegiomtn.sistpostulante.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreUsuario;
    private String contraseña;

    @Enumerated(EnumType.STRING)
    private Rol rol;

    private boolean activo;

    @OneToMany(mappedBy = "evaluador")
    private List<Evaluacion> evaluaciones;

}
