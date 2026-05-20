package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "marca")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Marca extends Base {

    @Column(name = "nombre_marca", nullable = false)
    private String nombreMarca;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_modelo")
    private Modelo modelo;
}