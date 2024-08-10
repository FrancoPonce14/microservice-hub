package com.grpc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grpc.Entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
