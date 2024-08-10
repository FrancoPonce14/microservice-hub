package com.grpc.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grpc.Entity.Persona;
import com.grpc.Repository.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

     public Persona create(Persona persona) {
        return personaRepository.save(persona);
    }

    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }
    
}
