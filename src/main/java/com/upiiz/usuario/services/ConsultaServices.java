package com.upiiz.usuario.services;

import com.upiiz.usuario.models.Consulta;
import com.upiiz.usuario.repository.ConsultaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaServices {
    // Requerimos el REPO (Datos - Listado) - Consulta

    ConsultaRepository consultasRepository;
    // Constructor - Cuando crea la instancia le pasa el repositorio
    public ConsultaServices(ConsultaRepository consultasRepository){
        this.consultasRepository = consultasRepository;
    }

    // GET - Todas las consultas
    public List<Consulta> getAllConsulta(){
        return  consultasRepository.obtenerTodas();
    }
    // GET - Consulta por id
    public Consulta getConsultaById(Long id){
        return consultasRepository.obtenerPorId(id);
    }

    // POST - Crear consulta
    public Consulta createConsulta(Consulta consulta){
        return consultasRepository.guardar(consulta);
    }

    // PUT - Axtualizar consulta
    public Consulta updateConsulta(Consulta consulta){
        return consultasRepository.actualizar(consulta);
    }

    // DELETE - Eliminar consulta
    public void deleteConsulta(Long id){
        consultasRepository.eliminar(id);
    }

    public List<Consulta> getAllId_mascota(Long id_mascota){
        return consultasRepository.getAllConsultaByMascotaId(id_mascota);
    }
    public List<Consulta> getAllId_cita(Long id_cita){
        return consultasRepository.getAllConsultaByCitaId(id_cita);
    }
    public List<Consulta> getAllId_veterinario(Long id_veterinario){
        return consultasRepository.getAllConsultaByVeterinarioId(id_veterinario);
    }




}