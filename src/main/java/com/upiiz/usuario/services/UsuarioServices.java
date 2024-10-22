package com.upiiz.usuario.services;


import com.upiiz.usuario.models.Usuario;
import com.upiiz.usuario.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServices {
    // Requerimos el REPO (Datos - Listado) - Usuario

    UsuarioRepository usuariosRepository;
    // Constructor - Cuando crea la instancia le pasa el repositorio
    public UsuarioServices(UsuarioRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository;
    }

    // GET - Todas las usuarios
    public List<Usuario> getAllUsuario(){
        return  usuariosRepository.obtenerTodas();
    }
    // GET - Usuario por id
    public Usuario getUsuarioById(Long id){
        return usuariosRepository.obtenerPorId(id);
    }

    // POST - Crear usuario
    public Usuario createUsuario(Usuario usuario){
        return usuariosRepository.guardar(usuario);
    }

    // PUT - Axtualizar usuario
    public Usuario updateUsuario(Usuario usuario){
        return usuariosRepository.actualizar(usuario);
    }

    // DELETE - Eliminar usuario
    public void deleteUsuario(Long id){
        usuariosRepository.eliminar(id);
    }

    public List<Usuario> getAllId_veterinario(Long id_veterinario){
        return usuariosRepository.getAllUsuarioByVeterinarioId(id_veterinario);
    }



}