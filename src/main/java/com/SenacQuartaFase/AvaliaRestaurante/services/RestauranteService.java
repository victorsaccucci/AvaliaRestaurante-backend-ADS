package com.SenacQuartaFase.AvaliaRestaurante.services;

import com.SenacQuartaFase.AvaliaRestaurante.entities.Restaurante;
import com.SenacQuartaFase.AvaliaRestaurante.repositories.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository repository;

    public Restaurante save(Restaurante novoRestaurante){
        return repository.save(novoRestaurante);
    }

    public List<Restaurante> buscarTodos(){
        return repository.findAll();
    }
}
