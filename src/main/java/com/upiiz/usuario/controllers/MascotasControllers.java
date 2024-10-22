package com.upiiz.usuario.controllers;


import com.upiiz.usuario.models.Mascotas;
import com.upiiz.usuario.services.MascotasServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/mascotas")
public class MascotasControllers {
    // Requiero INYECTAR una dependencia del servicio
    MascotasServices mascotasService;

    public MascotasControllers(MascotasServices mascotasService){
        this.mascotasService = mascotasService;
    }

    // GET - Todas las mascotas
    @GetMapping
    public ResponseEntity<List<Mascotas>> getMascotas(){
        return ResponseEntity.ok(mascotasService.getAllMascotas());
    }

    // GET- Solo una mascota
    @GetMapping("/{id}")
    public ResponseEntity<Mascotas> getMascotasid(@PathVariable Long id){
        return ResponseEntity.ok(mascotasService.getMascotasById(id));
    }

    // POST - Creamos una mascota
    @PostMapping
    public ResponseEntity<Mascotas> addMascotas(@RequestBody Mascotas mascota){
        return ResponseEntity.ok(mascotasService.createMascotas(mascota));
    }

    // PUT - Actualizar una mascota
    @PutMapping("/{id}")
    public ResponseEntity<Mascotas> updateMascotas(@RequestBody Mascotas mascota, @PathVariable Long id){
        //Que se requiere antes de actualizarla
        mascota.setId_mascota(id);
        return ResponseEntity.ok(mascotasService.updateMascotas(mascota));
    }

    // DELETE - Eliminar una mascota por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMascotas(@PathVariable Long id){
        mascotasService.deleteMascotas(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/usuario/{id_usuario}")
    public ResponseEntity<Mascotas> getId_usuario(@PathVariable Long id_usuario){
        return ResponseEntity.ok((Mascotas) mascotasService.getAllId_usuario(id_usuario));
    }


}