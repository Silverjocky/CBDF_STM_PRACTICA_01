package com.upiiz.usuario.services;


import com.upiiz.usuario.models.Mascotas;
import com.upiiz.usuario.models.Mascotas;
import com.upiiz.usuario.repository.MascotasRepository;
import com.upiiz.usuario.repository.MascotasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotasServices {
    // Requerimos el REPO (Datos - Listado) - Mascotas

    MascotasRepository mascotasRepository;
    // Constructor - Cuando crea la instancia le pasa el repositorio
    public MascotasServices(MascotasRepository mascotasRepository){
        this.mascotasRepository = mascotasRepository;
    }

    // GET - Todas las mascotas
    public List<Mascotas> getAllMascotas(){
        return  mascotasRepository.obtenerTodas();
    }
    // GET - Mascotas por id
    public Mascotas getMascotasById(Long id){
        return mascotasRepository.obtenerPorId(id);
    }

    // POST - Crear mascota
    public Mascotas createMascotas(Mascotas mascota){
        return mascotasRepository.guardar(mascota);
    }

    // PUT - Axtualizar mascota
    public Mascotas updateMascotas(Mascotas mascota){
        return mascotasRepository.actualizar(mascota);
    }

    // DELETE - Eliminar mascota
    public void deleteMascotas(Long id){
        mascotasRepository.eliminar(id);
    }


    public List<Mascotas> getAllId_usuario(Long id_usuario){
        return mascotasRepository.getAllMascotasByUsuarioId(id_usuario);
    }



}