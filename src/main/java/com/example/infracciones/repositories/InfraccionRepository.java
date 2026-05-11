package com.example.infracciones.repositories;

import com.example.infracciones.entities.Infraccion;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InfraccionRepository extends BaseRepository<Infraccion, Long>  {

    // Buscar por tipo (Grave, Media, Leve)
    @Query("SELECT i FROM Infraccion i JOIN i.tipos t WHERE t.tipo = ?1")
    List<Infraccion> findByTipo(String tipo);

    // Buscar por conductor
    @Query("SELECT i FROM Infraccion i WHERE i.conductor.id = ?1")
    List<Infraccion> findByConductorId(Long conductorId);



}
