package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "organizacion_estatal")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class OrganizacionEstatal extends Base {

    @Column(name = "nombre_organizacion", nullable = false)
    private String nombreOrganizacion;

    @Column(name = "localidad")
    private String localidad;
}