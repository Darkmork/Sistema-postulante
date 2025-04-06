package cl.colegiomtn.sistpostulante.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private Integer puntaje;
    private String observaciones;
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "postulante_id")
    private Postulante postulante;

    @ManyToOne
    @JoinColumn(name = "evaluador_id")
    private Usuario evaluador;

    // Getters y setters
}

