package com.upiiz.usuario.repository;


import com.upiiz.usuario.models.Cita;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class CitaRepository {
    //Alamacenar en un listado las cita: salvar, listas, eliminar
    //Generar de manera unida el id para cada cita
    private List<Cita> citas = new ArrayList<Cita>();
    private AtomicLong id = new AtomicLong();

    //Agregamos la cita al listado y la regresamos
    //POST
    public Cita guardar(Cita cita){
        cita.setId_cita(id.incrementAndGet());
        citas.add(cita);
        return cita;
    }

    //GET - Todas las citas
    public List<Cita> obtenerTodas(){
        return citas;
    }

    //GET - Una cita
    public Cita obtenerPorId(Long id){

        //Funcional
        return citas.stream().filter(cita -> cita.getId_cita().equals(id)).findFirst().orElse(null);
    }

    //DELETE
    public void eliminar(Long id){
        citas.removeIf(Cita -> Cita.getId_cita().equals(id));
    }

    //PUT
    public Cita actualizar(Cita cita){
        eliminar(cita.getId_cita());
        citas.add(cita);
        return cita;
    }
    // Obtener PedidosProductos con pediodo_id
    public List<Cita> getAllCitaByMascotaId(Long id_mascota) {
        return citas.stream().filter(cita -> cita.getId_mascota().equals(id_mascota)).toList();
    }
    // Obtener PedidosProductos con pediodo_id
    public List<Cita> getAllCitaByUsuarioId(Long id_usuario) {
        return citas.stream().filter(cita -> cita.getId_usuario().equals(id_usuario)).toList();
    }
    // Obtener PedidosProductos con pediodo_id
    public List<Cita> getAllCitaByVeterinarioId(Long id_veterinario) {
        return citas.stream().filter(cita -> cita.getId_veterinario().equals(id_veterinario)).toList();
    }

}