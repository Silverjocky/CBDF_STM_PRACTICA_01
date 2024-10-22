package com.upiiz.usuario.models;

public class Usuario {

    private Long id_usuario;
    private String nombre_usuario;
    private String apellido_usuario;
    private String telefono_usuario;
    private String email_usuario;
    private String estado_usuario;
    private String ciudad_usuario;
    private String colonia_usuario;
    private Integer cp_usuario;
    private String calle_usuario;
    private String num_ext_usuario;
    private String password_usuario;
    private Boolean estatus_usuario;
    private Boolean baja_usuario;
    private byte[] foto_usuario;
    private Long id_veterinario;

    public Usuario(Long id_usuario, String nombre_usuario, String apellido_usuario, String telefono_usuario, String email_usuario, String estado_usuario, String ciudad_usuario, String colonia_usuario, Integer cp_usuario, String calle_usuario, String num_ext_usuario, String password_usuario, Boolean estatus_usuario, Boolean baja_usuario, byte[] foto_usuario, Long id_veterinario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.telefono_usuario = telefono_usuario;
        this.email_usuario = email_usuario;
        this.estado_usuario = estado_usuario;
        this.ciudad_usuario = ciudad_usuario;
        this.colonia_usuario = colonia_usuario;
        this.cp_usuario = cp_usuario;
        this.calle_usuario = calle_usuario;
        this.num_ext_usuario = num_ext_usuario;
        this.password_usuario = password_usuario;
        this.estatus_usuario = estatus_usuario;
        this.baja_usuario = baja_usuario;
        this.foto_usuario = foto_usuario;
        this.id_veterinario = id_veterinario;
    }

    public Usuario(){}

    public Long getId_usuario() {
        return id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public String getEstado_usuario() {
        return estado_usuario;
    }

    public String getCiudad_usuario() {
        return ciudad_usuario;
    }

    public String getColonia_usuario() {
        return colonia_usuario;
    }

    public Integer getCp_usuario() {
        return cp_usuario;
    }

    public String getCalle_usuario() {
        return calle_usuario;
    }

    public String getNum_ext_usuario() {
        return num_ext_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public Boolean getEstatus_usuario() {
        return estatus_usuario;
    }

    public Boolean getBaja_usuario() {
        return baja_usuario;
    }

    public byte[] getFoto_usuario() {
        return foto_usuario;
    }

    public Long getId_veterinario() {
        return id_veterinario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    public void setCiudad_usuario(String ciudad_usuario) {
        this.ciudad_usuario = ciudad_usuario;
    }

    public void setColonia_usuario(String colonia_usuario) {
        this.colonia_usuario = colonia_usuario;
    }

    public void setCp_usuario(Integer cp_usuario) {
        this.cp_usuario = cp_usuario;
    }

    public void setCalle_usuario(String calle_usuario) {
        this.calle_usuario = calle_usuario;
    }

    public void setNum_ext_usuario(String num_ext_usuario) {
        this.num_ext_usuario = num_ext_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }

    public void setEstatus_usuario(Boolean estatus_usuario) {
        this.estatus_usuario = estatus_usuario;
    }

    public void setBaja_usuario(Boolean baja_usuario) {
        this.baja_usuario = baja_usuario;
    }

    public void setFoto_usuario(byte[] foto_usuario) {
        this.foto_usuario = foto_usuario;
    }

    public void setId_veterinario(Long id_veterinario) {
        this.id_veterinario = id_veterinario;
    }



}
