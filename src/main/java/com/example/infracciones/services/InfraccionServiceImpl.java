package com.example.infracciones.services;

import com.example.infracciones.entities.Infraccion;
import com.example.infracciones.entities.TipodeInfraccion;
import com.example.infracciones.repositories.InfraccionRepository;
import com.example.infracciones.repositories.TipodeInfraccionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfraccionServiceImpl extends BaseServiceImpl<Infraccion, Long>
        implements InfraccionService {

    private final InfraccionRepository infraccionRepository;
    private final TipodeInfraccionRepository tipoRepository;

    public InfraccionServiceImpl(InfraccionRepository infraccionRepository,
                                 TipodeInfraccionRepository tipoRepository) {
        super(infraccionRepository);
        this.infraccionRepository = infraccionRepository;
        this.tipoRepository = tipoRepository;
    }

    @Transactional
    @Override
    public Infraccion save(Infraccion infraccion) throws Exception {
        try {
            // Resolver tipos desde la base para evitar entidad detached
            if (infraccion.getTipos() != null && !infraccion.getTipos().isEmpty()) {
                List<TipodeInfraccion> tiposResueltos = new ArrayList<>();
                for (TipodeInfraccion tipo : infraccion.getTipos()) {
                    TipodeInfraccion tipoReal = tipoRepository.findById(tipo.getId())
                            .orElseThrow(() -> new Exception(
                                    "Tipo no encontrado: " + tipo.getId()));
                    tiposResueltos.add(tipoReal);
                }
                infraccion.setTipos(tiposResueltos);
            }
            return infraccionRepository.save(infraccion);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
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