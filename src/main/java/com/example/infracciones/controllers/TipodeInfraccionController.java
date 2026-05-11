package com.example.infracciones.controllers;


import com.example.infracciones.entities.TipodeInfraccion;
import com.example.infracciones.services.TipodeInfraccionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/tipos")
public class TipodeInfraccionController extends BaseControllerImpl<TipodeInfraccion, TipodeInfraccionServiceImpl>{
}
