package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "autoridad_constatacion")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class AutoridadConstatacion extends Base {

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "dni", nullable = false)
    private Long dni;

    @Column(name = "genero")
    private String genero;

    @Column(name = "id_placa")
    private Integer idPlaca;

    @Column(name = "id_legajo")
    private Integer idLegajo;
}