package com.upiiz.usuario.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mascotas {
    private Long id_mascota;
    private String nombre_mascota;
    private String color_mascota;
    private String raza_mazcota;
    private String padecimientos_mascota;
    private String especie_mascota;
    private LocalDateTime fecha_nacimiento_mascota;
    private byte[] foto_mascota;
    private Boolean baja_mascota;
    private String sexo_mascota;
    private Long id_usuario;

    public Mascotas(Long id_mascota, String nombre_mascota, String color_mascota, String raza_mazcota, String padecimientos_mascota, String especie_mascota, LocalDateTime fecha_nacimiento_mascota, byte[] foto_mascota, Boolean baja_mascota, String sexo_mascota, Long id_usuario) {
        this.id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.color_mascota = color_mascota;
        this.raza_mazcota = raza_mazcota;
        this.padecimientos_mascota = padecimientos_mascota;
        this.especie_mascota = especie_mascota;
        this.fecha_nacimiento_mascota = fecha_nacimiento_mascota;
        this.foto_mascota = foto_mascota;
        this.baja_mascota = baja_mascota;
        this.sexo_mascota = sexo_mascota;
        this.id_usuario = id_usuario;
    }

    public Mascotas(){}

    public Long getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(Long id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getColor_mascota() {
        return color_mascota;
    }

    public void setColor_mascota(String color_mascota) {
        this.color_mascota = color_mascota;
    }

    public String getRaza_mazcota() {
        return raza_mazcota;
    }

    public void setRaza_mazcota(String raza_mazcota) {
        this.raza_mazcota = raza_mazcota;
    }

    public String getPadecimientos_mascota() {
        return padecimientos_mascota;
    }

    public void setPadecimientos_mascota(String padecimientos_mascota) {
        this.padecimientos_mascota = padecimientos_mascota;
    }

    public String getEspecie_mascota() {
        return especie_mascota;
    }

    public void setEspecie_mascota(String especie_mascota) {
        this.especie_mascota = especie_mascota;
    }

    public LocalDateTime getFecha_nacimiento_mascota() {
        return fecha_nacimiento_mascota;
    }

    public void setFecha_nacimiento_mascota(LocalDateTime fecha_nacimiento_mascota) {
        this.fecha_nacimiento_mascota = fecha_nacimiento_mascota;
    }

    public byte[] getFoto_mascota() {
        return foto_mascota;
    }

    public void setFoto_mascota(byte[] foto_mascota) {
        this.foto_mascota = foto_mascota;
    }

    public Boolean getBaja_mascota() {
        return baja_mascota;
    }

    public void setBaja_mascota(Boolean baja_mascota) {
        this.baja_mascota = baja_mascota;
    }

    public String getSexo_mascota() {
        return sexo_mascota;
    }

    public void setSexo_mascota(String sexo_mascota) {
        this.sexo_mascota = sexo_mascota;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }
}
