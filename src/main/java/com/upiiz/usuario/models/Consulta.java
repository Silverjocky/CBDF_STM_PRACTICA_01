package com.upiiz.usuario.models;

import java.time.LocalDateTime;

public class Consulta {

    private Long id_consulta;
    private String tipo_consulta;
    private LocalDateTime proxima_cita_consulta;
    private Long peso_consulta;
    private String producto_consulta;
    private String aplico_consulta;
    private String descripcion_consulta;
    private String observaciones_consulta;
    private Long id_mascota;
    private Long id_veterinario;
    private Long id_cita;

    public Consulta(Long id_consulta, String tipo_consulta, LocalDateTime proxima_cita_consulta, Long peso_consulta, String producto_consulta, String aplico_consulta, String descripcion_consulta, String observaciones_consulta, Long id_mascota, Long id_veterinario, Long id_cita) {
        this.id_consulta = id_consulta;
        this.tipo_consulta = tipo_consulta;
        this.proxima_cita_consulta = proxima_cita_consulta;
        this.peso_consulta = peso_consulta;
        this.producto_consulta = producto_consulta;
        this.aplico_consulta = aplico_consulta;
        this.descripcion_consulta = descripcion_consulta;
        this.observaciones_consulta = observaciones_consulta;
        this.id_mascota = id_mascota;
        this.id_veterinario = id_veterinario;
        this.id_cita = id_cita;
    }

    public Consulta() {}

    public Long getId_consulta() {
        return id_consulta;
    }

    public void setId_consulta(Long id_consulta) {
        this.id_consulta = id_consulta;
    }

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

    public LocalDateTime getProxima_cita_consulta() {
        return proxima_cita_consulta;
    }

    public void setProxima_cita_consulta(LocalDateTime proxima_cita_consulta) {
        this.proxima_cita_consulta = proxima_cita_consulta;
    }

    public Long getPeso_consulta() {
        return peso_consulta;
    }

    public void setPeso_consulta(Long peso_consulta) {
        this.peso_consulta = peso_consulta;
    }

    public String getProducto_consulta() {
        return producto_consulta;
    }

    public void setProducto_consulta(String producto_consulta) {
        this.producto_consulta = producto_consulta;
    }

    public String getAplico_consulta() {
        return aplico_consulta;
    }

    public void setAplico_consulta(String aplico_consulta) {
        this.aplico_consulta = aplico_consulta;
    }

    public String getDescripcion_consulta() {
        return descripcion_consulta;
    }

    public void setDescripcion_consulta(String descripcion_consulta) {
        this.descripcion_consulta = descripcion_consulta;
    }

    public String getObservaciones_consulta() {
        return observaciones_consulta;
    }

    public void setObservaciones_consulta(String observaciones_consulta) {
        this.observaciones_consulta = observaciones_consulta;
    }

    public Long getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(Long id_mascota) {
        this.id_mascota = id_mascota;
    }

    public Long getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(Long id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public Long getId_cita() {
        return id_cita;
    }

    public void setId_cita(Long id_cita) {
        this.id_cita = id_cita;
    }
}
