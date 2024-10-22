package com.upiiz.usuario.services;

import com.upiiz.usuario.models.Cita;
import com.upiiz.usuario.repository.CitaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServices {
    // Requerimos el REPO (Datos - Listado) - Cita

    CitaRepository citasRepository;
    // Constructor - Cuando crea la instancia le pasa el repositorio
    public CitaServices(CitaRepository citasRepository){
        this.citasRepository = citasRepository;
    }

    // GET - Todas las citas
    public List<Cita> getAllCita(){
        return  citasRepository.obtenerTodas();
    }
    // GET - Cita por id
    public Cita getCitaById(Long id){
        return citasRepository.obtenerPorId(id);
    }

    // POST - Crear cita
    public Cita createCita(Cita cita){
        return citasRepository.guardar(cita);
    }

    // PUT - Axtualizar cita
    public Cita updateCita(Cita cita){
        return citasRepository.actualizar(cita);
    }

    // DELETE - Eliminar cita
    public void deleteCita(Long id){
        citasRepository.eliminar(id);
    }

    public List<Cita> getAllId_mascota(Long id_mascota){
        return citasRepository.getAllCitaByMascotaId(id_mascota);
    }
    public List<Cita> getAllId_usuario(Long id_usuario){
        return citasRepository.getAllCitaByUsuarioId(id_usuario);
    }
    public List<Cita> getAllId_veterinario(Long id_veterinario){
        return citasRepository.getAllCitaByVeterinarioId(id_veterinario);
    }




}