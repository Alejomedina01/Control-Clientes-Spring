package com.uptc.edu.ControlClientesHJ.service;

import com.uptc.edu.ControlClientesHJ.dao.PersonaDao;
import com.uptc.edu.ControlClientesHJ.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImp implements ServiceCC<Persona> {

    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> listar() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrar(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
}
