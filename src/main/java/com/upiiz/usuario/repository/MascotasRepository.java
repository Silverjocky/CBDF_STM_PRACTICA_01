package com.upiiz.usuario.repository;

import com.upiiz.usuario.models.Mascotas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class MascotasRepository {
    //Alamacenar en un listado las mascota: salvar, listas, eliminar
    //Generar de manera unida el id para cada mascota
    private List<Mascotas> mascotas = new ArrayList<Mascotas>();
    private AtomicLong id = new AtomicLong();

    //Agregamos la mascota al listado y la regresamos
    //POST
    public Mascotas guardar(Mascotas mascota){
        mascota.setId_mascota(id.incrementAndGet());
        mascotas.add(mascota);
        return mascota;
    }

    //GET - Todas las mascotas
    public List<Mascotas> obtenerTodas(){
        return mascotas;
    }

    //GET - Una mascota
    public Mascotas obtenerPorId(Long id){

        //Funcional
        return mascotas.stream().filter(mascota -> mascota.getId_mascota().equals(id)).findFirst().orElse(null);
    }

    //DELETE
    public void eliminar(Long id){
        mascotas.removeIf(Mascotas -> Mascotas.getId_mascota().equals(id));
    }

    //PUT
    public Mascotas actualizar(Mascotas mascota){
        eliminar(mascota.getId_mascota());
        mascotas.add(mascota);
        return mascota;
    }

    public List<Mascotas> getAllMascotasByUsuarioId(Long id_usuario) {
        return mascotas.stream().filter(mascota -> mascota.getId_usuario().equals(id_usuario)).toList();
    }



}