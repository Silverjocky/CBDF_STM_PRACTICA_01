package com.upiiz.usuario.controllers;


import com.upiiz.usuario.models.Cita;
import com.upiiz.usuario.services.CitaServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/citas")
public class CitaControllers {
    // Requiero INYECTAR una dependencia del servicio
    CitaServices citasService;

    public CitaControllers(CitaServices citasService){
        this.citasService = citasService;
    }

    // GET - Todas las citas
    @GetMapping
    public ResponseEntity<List<Cita>> getCita(){
        return ResponseEntity.ok(citasService.getAllCita());
    }

    // GET- Solo una cita
    @GetMapping("/{id}")
    public ResponseEntity<Cita> getCitaid(@PathVariable Long id){
        return ResponseEntity.ok(citasService.getCitaById(id));
    }

    // POST - Creamos una cita
    @PostMapping
    public ResponseEntity<Cita> addCita(@RequestBody Cita cita){
        return ResponseEntity.ok(citasService.createCita(cita));
    }

    // PUT - Actualizar una cita
    @PutMapping("/{id}")
    public ResponseEntity<Cita> updateCita(@RequestBody Cita cita, @PathVariable Long id){
        //Que se requiere antes de actualizarla
        cita.setId_cita(id);
        return ResponseEntity.ok(citasService.updateCita(cita));
    }

    // DELETE - Eliminar una cita por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCita(@PathVariable Long id){
        citasService.deleteCita(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/mascota/{id_mascota}")
    public ResponseEntity<List<Cita>> getId_Mascota(@PathVariable Long id_mascota){
        return ResponseEntity.ok(citasService.getAllId_mascota(id_mascota));
    }
    @GetMapping("/usuario/{id_usuario}")
    public ResponseEntity<List<Cita>> getId_usuario(@PathVariable Long id_usuario){
        return ResponseEntity.ok(citasService.getAllId_usuario(id_usuario));
    }
    @GetMapping("/veterinario/{id_veterinario}")
    public ResponseEntity<List<Cita>> getId_Veterinario(@PathVariable Long id_veterinario){
        return ResponseEntity.ok(citasService.getAllId_veterinario(id_veterinario));
    }

}