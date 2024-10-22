package com.upiiz.usuario.models;

import java.sql.Time;
import java.time.LocalDateTime;

public class Cita {
    private Long id_cita;
    private String tipo_cita;
    private String descripcion_cita;
    private String observaciones_cota;
    private LocalDateTime fecha_cita;
    private Time hora_cita;
    private Long id_mascota;
    private Long id_usuario;
    private Long id_veterinario;
    private Boolean estatus_cita;

    public Cita(Long id_cita, String tipo_cita, String descripcion_cita, String observaciones_cota, LocalDateTime fecha_cita, Time hora_cita, Long id_mascota, Long id_usuario, Long id_veterinario, Boolean estatus_cita) {
        this.id_cita = id_cita;
        this.tipo_cita = tipo_cita;
        this.descripcion_cita = descripcion_cita;
        this.observaciones_cota = observaciones_cota;
        this.fecha_cita = fecha_cita;
        this.hora_cita = hora_cita;
        this.id_mascota = id_mascota;
        this.id_usuario = id_usuario;
        this.id_veterinario = id_veterinario;
        this.estatus_cita = estatus_cita;
    }

    public Cita() {}

    public Long getId_cita() {
        return id_cita;
    }

    public void setId_cita(Long id_cita) {
        this.id_cita = id_cita;
    }

    public String getTipo_cita() {
        return tipo_cita;
    }

    public void setTipo_cita(String tipo_cita) {
        this.tipo_cita = tipo_cita;
    }

    public String getDescripcion_cita() {
        return descripcion_cita;
    }

    public void setDescripcion_cita(String descripcion_cita) {
        this.descripcion_cita = descripcion_cita;
    }

    public String getObservaciones_cota() {
        return observaciones_cota;
    }

    public void setObservaciones_cota(String observaciones_cota) {
        this.observaciones_cota = observaciones_cota;
    }

    public LocalDateTime getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(LocalDateTime fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public Time getHora_cita() {
        return hora_cita;
    }

    public void setHora_cita(Time hora_cita) {
        this.hora_cita = hora_cita;
    }

    public Long getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(Long id_mascota) {
        this.id_mascota = id_mascota;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(Long id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public Boolean getEstatus_cita() {
        return estatus_cita;
    }

    public void setEstatus_cita(Boolean estatus_cita) {
        this.estatus_cita = estatus_cita;
    }
}
