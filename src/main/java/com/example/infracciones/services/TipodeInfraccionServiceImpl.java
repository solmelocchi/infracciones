package com.example.infracciones.services;


import com.example.infracciones.entities.TipodeInfraccion;
import com.example.infracciones.repositories.TipodeInfraccionRepository;
import org.springframework.stereotype.Service;

@Service
public class TipodeInfraccionServiceImpl extends BaseServiceImpl<TipodeInfraccion, Long> implements TipodeInfraccionService {

    public TipodeInfraccionServiceImpl(TipodeInfraccionRepository repository) {
        super(repository);
    }
}
