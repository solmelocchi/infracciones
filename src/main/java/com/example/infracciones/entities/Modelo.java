package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "modelo")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Modelo extends Base {

    @Column(name = "nombre_modelo", nullable = false)
    private String nombreModelo;
}