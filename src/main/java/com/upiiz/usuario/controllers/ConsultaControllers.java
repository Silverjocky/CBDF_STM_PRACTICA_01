package com.upiiz.usuario.controllers;

import com.upiiz.usuario.models.Consulta;
import com.upiiz.usuario.services.ConsultaServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/consultas")
public class ConsultaControllers {
    // Requiero INYECTAR una dependencia del servicio
    ConsultaServices consultasService;

    public ConsultaControllers(ConsultaServices consultasService){
        this.consultasService = consultasService;
    }

    // GET - Todas las consultas
    @GetMapping
    public ResponseEntity<List<Consulta>> getConsulta(){
        return ResponseEntity.ok(consultasService.getAllConsulta());
    }

    // GET- Solo una consulta
    @GetMapping("/{id}")
    public ResponseEntity<Consulta> getConsultaid(@PathVariable Long id){
        return ResponseEntity.ok(consultasService.getConsultaById(id));
    }

    // POST - Creamos una consulta
    @PostMapping
    public ResponseEntity<Consulta> addConsulta(@RequestBody Consulta consulta){
        return ResponseEntity.ok(consultasService.createConsulta(consulta));
    }

    // PUT - Actualizar una consulta
    @PutMapping("/{id}")
    public ResponseEntity<Consulta> updateConsulta(@RequestBody Consulta consulta, @PathVariable Long id){
        //Que se requiere antes de actualizarla
        consulta.setId_consulta(id);
        return ResponseEntity.ok(consultasService.updateConsulta(consulta));
    }

    // DELETE - Eliminar una consulta por Id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConsulta(@PathVariable Long id){
        consultasService.deleteConsulta(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/mascota/{id_mascota}")
    public ResponseEntity<List<Consulta>> getId_Mascota(@PathVariable Long id_mascota){
        return ResponseEntity.ok(consultasService.getAllId_mascota(id_mascota));
    }
    @GetMapping("/usuario/{id_cita}")
    public ResponseEntity<List<Consulta>> getId_cita(@PathVariable Long id_cita){
        return ResponseEntity.ok(consultasService.getAllId_cita(id_cita));
    }
    @GetMapping("/veterinario/{id_veterinario}")
    public ResponseEntity<List<Consulta>> getId_Veterinario(@PathVariable Long id_veterinario){
        return ResponseEntity.ok(consultasService.getAllId_veterinario(id_veterinario));
    }

}