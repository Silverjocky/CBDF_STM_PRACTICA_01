package com.upiiz.usuario.controllers;


import com.upiiz.usuario.models.Usuario;
import com.upiiz.usuario.services.UsuarioServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioControllers {
    // Requiero INYECTAR una dependencia del servicio
    UsuarioServices usuariosService;

    public UsuarioControllers(UsuarioServices usuariosService){
        this.usuariosService = usuariosService;
    }

    // GET - Todas las usuarios
    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuario(){
        return ResponseEntity.ok(usuariosService.getAllUsuario());
    }

    // GET- Solo una usuario
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioid(@PathVariable Long id){
        return ResponseEntity.ok(usuariosService.getUsuarioById(id));
    }

    // POST - Creamos una usuario
    @PostMapping
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok(usuariosService.createUsuario(usuario));
    }

    // PUT - Actualizar una usuario
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario, @PathVariable Long id){
        //Que se requiere antes de actualizarla
        usuario.setId_usuario(id);
        return ResponseEntity.ok(usuariosService.updateUsuario(usuario));
    }

    // DELETE - Eliminar una usuario por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id){
        usuariosService.deleteUsuario(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/veterinario/{id_veterinario}")
    public ResponseEntity<Usuario> getId_Veterinario(@PathVariable Long id_veterinario){
        return ResponseEntity.ok((Usuario) usuariosService.getAllId_veterinario(id_veterinario));
    }

}