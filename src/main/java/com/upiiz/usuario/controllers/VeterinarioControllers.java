package com.upiiz.usuario.controllers;

import com.upiiz.usuario.models.Veterinario;
import com.upiiz.usuario.services.VeterinarioServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/veterinarios")
public class VeterinarioControllers {
    // Requiero INYECTAR una dependencia del servicio
    VeterinarioServices veterinariosService;

    public VeterinarioControllers(VeterinarioServices veterinariosService){
        this.veterinariosService = veterinariosService;
    }

    // GET - Todas las veterinarios
    @GetMapping
    public ResponseEntity<List<Veterinario>> getVeterinario(){
        return ResponseEntity.ok(veterinariosService.getAllVeterinario());
    }

    // GET- Solo una veterinario
    @GetMapping("/{id}")
    public ResponseEntity<Veterinario> getVeterinarioid(@PathVariable Long id){
        return ResponseEntity.ok(veterinariosService.getVeterinarioById(id));
    }

    // POST - Creamos una veterinario
    @PostMapping
    public ResponseEntity<Veterinario> addVeterinario(@RequestBody Veterinario veterinario){
        return ResponseEntity.ok(veterinariosService.createVeterinario(veterinario));
    }

    // PUT - Actualizar una veterinario
    @PutMapping("/{id}")
    public ResponseEntity<Veterinario> updateVeterinario(@RequestBody Veterinario veterinario, @PathVariable Long id){
        //Que se requiere antes de actualizarla
        veterinario.setId_veterinario(id);
        return ResponseEntity.ok(veterinariosService.updateVeterinario(veterinario));
    }

    // DELETE - Eliminar una veterinario por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeterinario(@PathVariable Long id){
        veterinariosService.deleteVeterinario(id);
        return ResponseEntity.noContent().build();
    }




}