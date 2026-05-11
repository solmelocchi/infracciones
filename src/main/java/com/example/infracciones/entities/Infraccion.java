package com.example.infracciones.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "infraccion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Infraccion extends Base{

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "importe", nullable = false)
    private Double importe;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;


// Relación con Conductor: muchas infracciones puede tener un conductor
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_conductor")
    private Conductor conductor;

    // Relación con TipodeInfraccion: una infraccion puede tener varios tipos
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "infraccion_tipo",
            joinColumns = @JoinColumn(name = "infraccion_id"),
            inverseJoinColumns = @JoinColumn(name = "tipo_id")
    )
    private List<TipodeInfraccion> tipos = new ArrayList<>();
}
