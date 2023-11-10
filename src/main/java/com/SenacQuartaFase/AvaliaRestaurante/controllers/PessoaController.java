package com.SenacQuartaFase.AvaliaRestaurante.controllers;

import com.SenacQuartaFase.AvaliaRestaurante.entities.Pessoa;
import com.SenacQuartaFase.AvaliaRestaurante.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/visitante")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa novoVisitante){
        return service.salvar(novoVisitante);
    }
}