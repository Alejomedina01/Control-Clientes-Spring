package com.uptc.edu.ControlClientesHJ.service;

import com.uptc.edu.ControlClientesHJ.domain.Persona;

import java.util.List;

public interface ServiceCC<T> {

    public List<T> listar();

    public void guardar(T data);

    public void eliminar(T data);

    public T encontrar(T data);

}
