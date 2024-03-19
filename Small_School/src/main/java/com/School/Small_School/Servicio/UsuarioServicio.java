package com.School.Small_School.Servicio;

import com.School.Small_School.dto.UsuarioRegistroDto;
import modelo.usuario;

public interface UsuarioServicio {

        public usuario guardar(UsuarioRegistroDto registroDto);
}
