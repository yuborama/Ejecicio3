package com.elecciones.controllers;

import com.elecciones.services.CandidatoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {

    private final CandidatoService candidatoService;

    CandidatoController(CandidatoService candidatoService){
        this.candidatoService = candidatoService;
    }

}
