package com.example.infracciones.services;

import com.example.infracciones.entities.Conductor;
import com.example.infracciones.repositories.ConductorRepository;
import org.springframework.stereotype.Service;

@Service
public class ConductorServiceImpl extends BaseServiceImpl<Conductor, Long> implements ConductorService{


    public ConductorServiceImpl(ConductorRepository repository) {
        super(repository);
    }


}
