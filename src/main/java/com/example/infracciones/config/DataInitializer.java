package com.example.infracciones.config;

import com.example.infracciones.entities.TipodeInfraccion;
import com.example.infracciones.repositories.TipodeInfraccionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TipodeInfraccionRepository tipoRepository;

    public DataInitializer(TipodeInfraccionRepository tipoRepository) {
        this.tipoRepository = tipoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (tipoRepository.count() == 0) {
            tipoRepository.save(new TipodeInfraccion("Alcoholemia positiva", "Grave", 80000.0, 0.0));
            tipoRepository.save(new TipodeInfraccion("Exceso de velocidad", "Grave", 60000.0, 10.0));
            tipoRepository.save(new TipodeInfraccion("Semáforo en rojo", "Grave", 50000.0, 10.0));
            tipoRepository.save(new TipodeInfraccion("Sin cinturón de seguridad", "Media", 30000.0, 15.0));
            tipoRepository.save(new TipodeInfraccion("Uso de celular al conducir", "Media", 25000.0, 15.0));
            tipoRepository.save(new TipodeInfraccion("Estacionamiento indebido", "Leve", 10000.0, 20.0));
            tipoRepository.save(new TipodeInfraccion("Luces apagadas", "Leve", 8000.0, 20.0));
            tipoRepository.save(new TipodeInfraccion("Documentación incompleta", "Leve", 5000.0, 20.0));
            tipoRepository.save(new TipodeInfraccion("Sin licencia de conducir", "Grave", 70000.0, 0.0));
            tipoRepository.save(new TipodeInfraccion("Vehículo sin VTV", "Media", 20000.0, 15.0));

            System.out.println(" Tipos de infracción cargados correctamente.");
        } else {
            System.out.println("ℹLos tipos de infracción ya estaban cargados.");
        }
    }
}