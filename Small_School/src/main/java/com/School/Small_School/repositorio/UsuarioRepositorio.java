package com.School.Small_School.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import modelo.usuario;






@Repository
public interface UsuarioRepositorio extends JpaRepository< usuario , Long> {

}
