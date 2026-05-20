package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo extends Base {

    @Column(name = "color")
    private String color;

    @Column(name = "dominio", unique = true)
    private String dominio;

    @Column(name = "anio_patentamiento")
    private Integer anioPatentamiento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_marca")
    private Marca marca;
}