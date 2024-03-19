package com.School.Small_School.Servicio;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.School.Small_School.dto.UsuarioRegistroDto;
import com.School.Small_School.repositorio.UsuarioRepositorio;

import modelo.ROL;
import modelo.usuario;

@Service
public class UsuarioServicioImp  implements UsuarioServicio{

    private UsuarioRepositorio usuarioRepositorio;


    public UsuarioServicioImp(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }


    @Override
    public usuario guardar(UsuarioRegistroDto registroDto){
        usuario Usuario = new usuario(registroDto.getNombre(),
         registroDto.getApellido(),registroDto.getEmail(), registroDto.getPassword(), Arrays.asList(new ROL("ROLE_USER")));

         return usuarioRepositorio.save((Usuario));
    }
}
