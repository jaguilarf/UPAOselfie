package com.example.upao.upaoselfie.model;
import  java.util.Date;

/**
 * Created by Upao on 23/08/2017.
 */

//POJO'S
public class Alumno {

    private String nombre;
    private long numero_cuenta;
    private Date fechaNacimiento;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
