package com.example.infracciones.controllers;

import com.example.infracciones.entities.Infraccion;
import com.example.infracciones.services.InfraccionServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/infracciones")
public class InfraccionController extends BaseControllerImpl<Infraccion, InfraccionServiceImpl> {

    // Filtrar por tipo (Grave/Media/Leve)
    @GetMapping("/tipo/{tipo}")
    public ResponseEntity<?> getByTipo(@PathVariable String tipo) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(servicio.findByTipo(tipo));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("{\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }

    // Filtrar por conductor
    @GetMapping("/conductor/{id}")
    public ResponseEntity<?> getByConductor(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(servicio.findByConductorId(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("{\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }
}
