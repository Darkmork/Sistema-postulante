package cl.colegiomtn.sistpostulante.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreArchivo;
    private String tipo;
    private String url;

    @ManyToOne
    @JoinColumn(name = "postulante_id")
    private Postulante postulante;

    // Getters y setters
}
