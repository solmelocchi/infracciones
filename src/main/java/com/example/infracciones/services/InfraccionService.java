package com.example.infracciones.services;

import com.example.infracciones.entities.Infraccion;

import java.util.List;

public interface InfraccionService  extends BaseService<Infraccion, Long> {


    List<Infraccion> findByTipo(String tipo) throws Exception;

    List<Infraccion> findByConductorId(Long conductorId) throws Exception;
}


