package com.elecciones.controllers;

import com.elecciones.services.CandidatoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidato")
public class CandidatoController {

    private final CandidatoService candidatoService;

    CandidatoController(CandidatoService candidatoService){
        this.candidatoService = candidatoService;
    }

    @GetMapping("/")
    //metodo recuerda en la web solo hay gets, para los parametros un ejemplo /candidato/id se escribe /{id} para conseguir esta id haces en el parametro del metodo debajo del decorador @PathVariable Integer id por ejemplo
    // puedes revisar aqui para eso https://github.com/StacklyCode/stacklyCode-team-backend/blob/dev/src/main/java/com/example/stacklyteam/web/resources/SkillResources.java
    // para pedir un objeto @RequestBody y el tipo por ejemplo aqui en el create yo haria un @RequestBody Candidato candidato

}
