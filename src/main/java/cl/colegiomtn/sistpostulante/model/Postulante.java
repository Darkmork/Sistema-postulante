package cl.colegiomtn.sistpostulante.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Postulante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String nombre;
    private String rut;
    private LocalDate fechaNacimiento;
    private String nivelPostula;
    private LocalDate fechaPostulacion;

    @Enumerated(EnumType.STRING)
    private EstadoPostulacion estado;

    @OneToMany(mappedBy = "postulante", cascade = CascadeType.ALL)
    private List<Documento> documentos;

    @OneToMany(mappedBy = "postulante", cascade = CascadeType.ALL)
    private List<Evaluacion> evaluaciones;


    // Getters y setters
}
