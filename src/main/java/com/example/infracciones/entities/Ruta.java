package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ruta")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Ruta extends Base {

    @Column(name = "nombre_ruta", nullable = false)
    private String nombreRuta;

    @Column(name = "km_ruta")
    private String kmRuta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_tipo_ruta")
    private TipoRuta tipoRuta;
}