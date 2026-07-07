package com.javanauta.usuario.infrastructure.repository;

import com.javanauta.usuario.infrastructure.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);
// Optional<> serve para evitar o erro no retorno de informações nulas, evitando que o código quebre (null p exception)
    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);

}
