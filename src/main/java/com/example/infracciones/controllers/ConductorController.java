package com.example.infracciones.controllers;


import com.example.infracciones.entities.Conductor;
import com.example.infracciones.services.ConductorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/conductores")
public class ConductorController  extends BaseControllerImpl<Conductor, ConductorServiceImpl> {
}
