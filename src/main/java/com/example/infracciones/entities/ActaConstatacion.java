package com.example.infracciones.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "acta_constatacion")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ActaConstatacion extends Base {

    @Column(name = "fecha_labrado")
    private LocalDate fechaLabrado;

    @Column(name = "fecha_vto_pago")
    private LocalDate fechaVtoPago;

    @Column(name = "hora_labrado")
    private LocalTime horaLabrado;

    @Column(name = "lugar_constatacion")
    private String lugarConstatacion;

    @Column(name = "observaciones")
    private String observaciones;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_conductor")
    private Conductor conductor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_vehiculo")
    private Vehiculo vehiculo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_licencia")
    private Licencia licencia;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_ruta")
    private Ruta ruta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_organizacion")
    private OrganizacionEstatal organizacionEstatal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_autoridad")
    private AutoridadConstatacion autoridad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_estado")
    private EstadoActa estadoActa;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "acta_infraccion",
            joinColumns = @JoinColumn(name = "fk_acta"),
            inverseJoinColumns = @JoinColumn(name = "fk_infraccion")
    )
    private List<Infraccion> infracciones;
}