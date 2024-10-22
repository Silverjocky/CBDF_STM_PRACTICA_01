package com.upiiz.usuario.models;

public class Veterinario
{

    private Long id_veterinario;
    private String nombre_veterinario;
    private String apellido_veterinario;
    private String telefono_veterinario;
    private String email_veterinario;
    private String estado_veterinario;
    private String ciudad_veterinario;
    private String colonia_veterinario;
    private Integer cp_veterinario;
    private String calle_veterinario;
    private String num_ext_veterinario;
    private String password_veterinario;
    private byte[] foto_veterinario;

    public Veterinario(Long id_veterinario, String nombre_veterinario, String apellido_veterinario, String telefono_veterinario, String email_veterinario, String estado_veterinario, String ciudad_veterinario, String colonia_veterinario, Integer cp_veterinario, String calle_veterinario, String num_ext_veterinario, String password_veterinario, byte[] foto_veterinario) {
        this.id_veterinario = id_veterinario;
        this.nombre_veterinario = nombre_veterinario;
        this.apellido_veterinario = apellido_veterinario;
        this.telefono_veterinario = telefono_veterinario;
        this.email_veterinario = email_veterinario;
        this.estado_veterinario = estado_veterinario;
        this.ciudad_veterinario = ciudad_veterinario;
        this.colonia_veterinario = colonia_veterinario;
        this.cp_veterinario = cp_veterinario;
        this.calle_veterinario = calle_veterinario;
        this.num_ext_veterinario = num_ext_veterinario;
        this.password_veterinario = password_veterinario;
        this.foto_veterinario = foto_veterinario;
    }

    public Veterinario() {
    }

    public Long getId_veterinario() {
        return id_veterinario;
    }

    public void setId_veterinario(Long id_veterinario) {
        this.id_veterinario = id_veterinario;
    }

    public String getNombre_veterinario() {
        return nombre_veterinario;
    }

    public void setNombre_veterinario(String nombre_veterinario) {
        this.nombre_veterinario = nombre_veterinario;
    }

    public String getApellido_veterinario() {
        return apellido_veterinario;
    }

    public void setApellido_veterinario(String apellido_veterinario) {
        this.apellido_veterinario = apellido_veterinario;
    }

    public String getTelefono_veterinario() {
        return telefono_veterinario;
    }

    public void setTelefono_veterinario(String telefono_veterinario) {
        this.telefono_veterinario = telefono_veterinario;
    }

    public String getEmail_veterinario() {
        return email_veterinario;
    }

    public void setEmail_veterinario(String email_veterinario) {
        this.email_veterinario = email_veterinario;
    }

    public String getEstado_veterinario() {
        return estado_veterinario;
    }

    public void setEstado_veterinario(String estado_veterinario) {
        this.estado_veterinario = estado_veterinario;
    }

    public String getCiudad_veterinario() {
        return ciudad_veterinario;
    }

    public void setCiudad_veterinario(String ciudad_veterinario) {
        this.ciudad_veterinario = ciudad_veterinario;
    }

    public String getColonia_veterinario() {
        return colonia_veterinario;
    }

    public void setColonia_veterinario(String colonia_veterinario) {
        this.colonia_veterinario = colonia_veterinario;
    }

    public Integer getCp_veterinario() {
        return cp_veterinario;
    }

    public void setCp_veterinario(Integer cp_veterinario) {
        this.cp_veterinario = cp_veterinario;
    }

    public String getCalle_veterinario() {
        return calle_veterinario;
    }

    public void setCalle_veterinario(String calle_veterinario) {
        this.calle_veterinario = calle_veterinario;
    }

    public String getNum_ext_veterinario() {
        return num_ext_veterinario;
    }

    public void setNum_ext_veterinario(String num_ext_veterinario) {
        this.num_ext_veterinario = num_ext_veterinario;
    }

    public String getPassword_veterinario() {
        return password_veterinario;
    }

    public void setPassword_veterinario(String password_veterinario) {
        this.password_veterinario = password_veterinario;
    }

    public byte[] getFoto_veterinario() {
        return foto_veterinario;
    }

    public void setFoto_veterinario(byte[] foto_veterinario) {
        this.foto_veterinario = foto_veterinario;
    }
}
