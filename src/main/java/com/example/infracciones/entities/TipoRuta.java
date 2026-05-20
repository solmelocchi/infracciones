package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_ruta")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class TipoRuta extends Base {

    @Column(name = "nombre_tipo_ruta", nullable = false)
    private String nombreTipoRuta;

    @Column(name = "descripcion_tipo_ruta")
    private String descripcionTipoRuta;
}