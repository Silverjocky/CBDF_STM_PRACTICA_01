package com.upiiz.usuario.repository;

import com.upiiz.usuario.models.Consulta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ConsultaRepository {
    //Alamacenar en un listado las consulta: salvar, listas, eliminar
    //Generar de manera unida el id para cada consulta
    private List<Consulta> consultas = new ArrayList<Consulta>();
    private AtomicLong id = new AtomicLong();

    //Agregamos la consulta al listado y la regresamos
    //POST
    public Consulta guardar(Consulta consulta){
        consulta.setId_consulta(id.incrementAndGet());
        consultas.add(consulta);
        return consulta;
    }

    //GET - Todas las consultas
    public List<Consulta> obtenerTodas(){
        return consultas;
    }

    //GET - Una consulta
    public Consulta obtenerPorId(Long id){

        //Funcional
        return consultas.stream().filter(consulta -> consulta.getId_consulta().equals(id)).findFirst().orElse(null);
    }

    //DELETE
    public void eliminar(Long id){
        consultas.removeIf(Consulta -> Consulta.getId_consulta().equals(id));
    }

    //PUT
    public Consulta actualizar(Consulta consulta){
        eliminar(consulta.getId_consulta());
        consultas.add(consulta);
        return consulta;
    }
    // Obtener PedidosProductos con pediodo_id
    public List<Consulta> getAllConsultaByMascotaId(Long id_mascota) {
        return consultas.stream().filter(consulta -> consulta.getId_mascota().equals(id_mascota)).toList();
    }
    // Obtener PedidosProductos con pediodo_id
    public List<Consulta> getAllConsultaByCitaId(Long id_cita) {
        return consultas.stream().filter(consulta -> consulta.getId_cita().equals(id_cita)).toList();
    }
    // Obtener PedidosProductos con pediodo_id
    public List<Consulta> getAllConsultaByVeterinarioId(Long id_veterinario) {
        return consultas.stream().filter(consulta -> consulta.getId_veterinario().equals(id_veterinario)).toList();
    }

}