package com.School.Small_School.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.School.Small_School.Servicio.UsuarioServicio;
import com.School.Small_School.dto.UsuarioRegistroDto;

@Controller
@RequestMapping("/login")
public class RegistroUsuarioControlador {


        private UsuarioServicio usuarioServicio;

        public RegistroUsuarioControlador(UsuarioServicio usuarioServicio){
            super();
            this.usuarioServicio= usuarioServicio;
        }

         @ModelAttribute("usuario")
         public UsuarioRegistroDto RetornarNuevoUsuarioRegistroDto(){
            return new UsuarioRegistroDto();
         }

         @GetMapping
         public String mostrarFormularioDeRegistro(){
            return "login";
         }

         @PostMapping
         public String RegistrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDto registroDto){
            usuarioServicio.guardar(registroDto);
            return "redirect:/login?exito";
         }
}
