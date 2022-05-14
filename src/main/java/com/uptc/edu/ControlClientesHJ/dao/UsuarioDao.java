package com.uptc.edu.ControlClientesHJ.dao;

import com.uptc.edu.ControlClientesHJ.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
