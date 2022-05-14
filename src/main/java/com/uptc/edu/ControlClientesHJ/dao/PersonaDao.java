package com.uptc.edu.ControlClientesHJ.dao;

import com.uptc.edu.ControlClientesHJ.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends JpaRepository<Persona, Long> {
    
}
