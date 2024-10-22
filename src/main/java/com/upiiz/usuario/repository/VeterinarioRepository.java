package com.upiiz.usuario.repository;

import com.upiiz.usuario.models.Veterinario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class VeterinarioRepository {
    //Alamacenar en un listado las veterinario: salvar, listas, eliminar
    //Generar de manera unida el id para cada veterinario
    private List<Veterinario> veterinarios = new ArrayList<Veterinario>();
    private AtomicLong id = new AtomicLong();

    //Agregamos la veterinario al listado y la regresamos
    //POST
    public Veterinario guardar(Veterinario veterinario){
        veterinario.setId_veterinario(id.incrementAndGet());
        veterinarios.add(veterinario);
        return veterinario;
    }

    //GET - Todas las veterinarios
    public List<Veterinario> obtenerTodas(){
        return veterinarios;
    }

    //GET - Una veterinario
    public Veterinario obtenerPorId(Long id){

        //Funcional
        return veterinarios.stream().filter(veterinario -> veterinario.getId_veterinario().equals(id)).findFirst().orElse(null);
    }

    //DELETE
    public void eliminar(Long id){
        veterinarios.removeIf(Veterinario -> Veterinario.getId_veterinario().equals(id));
    }

    //PUT
    public Veterinario actualizar(Veterinario veterinario){
        eliminar(veterinario.getId_veterinario());
        veterinarios.add(veterinario);
        return veterinario;
    }
    // Obtener PedidosProductos con pediodo_id


}