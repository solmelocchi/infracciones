package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "licencia")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Licencia extends Base {

    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimiento;

    @Column(name = "puntos_iniciales")
    private Integer puntosIniciales;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_conductor")
    private Conductor conductor;
}