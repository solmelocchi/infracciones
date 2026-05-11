package com.example.infracciones.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipo_infraccion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TipodeInfraccion extends Base {

    @Column(name = "denominacion", nullable = false)
    private String denominacion;

    @Column(name = "tipo", nullable = false)
    private String tipo; // "Grave", "Media", "Leve"

    @Column(name = "importe_base", nullable = false)
    private Double importeBase;

    @Column(name = "porcentaje_descuento")
    private Double porcentajeDescuento;


}
