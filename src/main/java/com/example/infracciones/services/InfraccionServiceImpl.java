package com.example.infracciones.services;

import com.example.infracciones.entities.Infraccion;
import com.example.infracciones.repositories.InfraccionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InfraccionServiceImpl extends BaseServiceImpl<Infraccion, Long> implements InfraccionService  {

    private final InfraccionRepository infraccionRepository;

    public InfraccionServiceImpl(InfraccionRepository infraccionRepository) {
        super(infraccionRepository);
        this.infraccionRepository = infraccionRepository;
    }

    @Transactional
    @Override
    public List<Infraccion> findByTipo(String tipo) throws Exception {
        try {
            return infraccionRepository.findByTipo(tipo);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    @Override
    public List<Infraccion> findByConductorId(Long conductorId) throws Exception {
        try {
            return infraccionRepository.findByConductorId(conductorId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}
