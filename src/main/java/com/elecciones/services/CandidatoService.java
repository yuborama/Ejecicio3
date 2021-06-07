package com.elecciones.services;

import com.elecciones.repositories.CandidatoRepository;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {
    private final CandidatoRepository candidatoRepository;

    CandidatoService(CandidatoRepository candidatoRepository){
        this.candidatoRepository = candidatoRepository;
    }


}
