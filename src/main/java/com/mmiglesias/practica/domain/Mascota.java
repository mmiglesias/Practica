package com.mmiglesias.practica.domain;

import java.util.Date;

/**
 * Reporesenta una mascota.
 * 
 * @author Maite
 */
public class Mascota {
    
    private int codigo;
    private String nombre;
    private Especie especie;
    private Estado estado;
    private Date fechaNacimiento;
    private short numeroVisitas;
    private Propietario propietario;

    public Mascota(int codigo, String nombre, Especie especie, Estado estado, Date fechaNacimiento, short numeroVisitas, Propietario propietario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroVisitas = numeroVisitas;
        this.propietario = propietario;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public short getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(short numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
