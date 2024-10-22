package com.upiiz.usuario.services;

import com.upiiz.usuario.models.Veterinario;
import com.upiiz.usuario.repository.VeterinarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioServices {
    // Requerimos el REPO (Datos - Listado) - Veterinario

    VeterinarioRepository veterinariosRepository;
    // Constructor - Cuando crea la instancia le pasa el repositorio
    public VeterinarioServices(VeterinarioRepository veterinariosRepository){
        this.veterinariosRepository = veterinariosRepository;
    }

    // GET - Todas las veterinarios
    public List<Veterinario> getAllVeterinario(){
        return  veterinariosRepository.obtenerTodas();
    }
    // GET - Veterinario por id
    public Veterinario getVeterinarioById(Long id){
        return veterinariosRepository.obtenerPorId(id);
    }

    // POST - Crear veterinario
    public Veterinario createVeterinario(Veterinario veterinario){
        return veterinariosRepository.guardar(veterinario);
    }

    // PUT - Axtualizar veterinario
    public Veterinario updateVeterinario(Veterinario veterinario){
        return veterinariosRepository.actualizar(veterinario);
    }

    // DELETE - Eliminar veterinario
    public void deleteVeterinario(Long id){
        veterinariosRepository.eliminar(id);
    }


}