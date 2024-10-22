package com.upiiz.usuario.repository;

import com.upiiz.usuario.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UsuarioRepository {
    //Alamacenar en un listado las usuario: salvar, listas, eliminar
    //Generar de manera unida el id para cada usuario
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private AtomicLong id = new AtomicLong();

    //Agregamos la usuario al listado y la regresamos
    //POST
    public Usuario guardar(Usuario usuario){
        usuario.setId_usuario(id.incrementAndGet());
        usuarios.add(usuario);
        return usuario;
    }

    //GET - Todas las usuarios
    public List<Usuario> obtenerTodas(){
        return usuarios;
    }

    //GET - Una usuario
    public Usuario obtenerPorId(Long id){

        //Funcional
        return usuarios.stream().filter(usuario -> usuario.getId_usuario().equals(id)).findFirst().orElse(null);
    }

    //DELETE
    public void eliminar(Long id){
        usuarios.removeIf(Usuario -> Usuario.getId_usuario().equals(id));
    }

    //PUT
    public Usuario actualizar(Usuario usuario){
        eliminar(usuario.getId_usuario());
        usuarios.add(usuario);
        return usuario;
    }
    // Obtener PedidosProductos con pediodo_id
    public List<Usuario> getAllUsuarioByVeterinarioId(Long id_veterinario) {
        return usuarios.stream().filter(usuario -> usuario.getId_veterinario().equals(id_veterinario)).toList();
    }

}