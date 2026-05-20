package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estado_acta")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class EstadoActa extends Base {

    @Column(name = "nombre_estado", nullable = false)
    private String nombreEstado;

    @Column(name = "descripcion_estado")
    private String descripcionEstado;
}