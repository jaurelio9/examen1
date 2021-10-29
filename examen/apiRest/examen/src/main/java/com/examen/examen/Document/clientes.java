package com.examen.examen.Document;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "clientes")
public class clientes implements Serializable {
    @Id
    @NotNull
    private String CLiente_id;

    public String getNombre_usuario() {
        return Nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        Nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public String getCorreo_electronico() {
        return Correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        Correo_electronico = correo_electronico;
    }

    public Double getEstatura() {
        return Estatura;
    }

    public void setEstatura(Double estatura) {
        Estatura = estatura;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public double getGEB() {
        return GEB;
    }

    public void setGEB(double GEB) {
        this.GEB = GEB;
    }

    public double getETA() {
        return ETA;
    }

    public void setETA(double ETA) {
        this.ETA = ETA;
    }

    public Date getFecha_Creacion() {
        return Fecha_Creacion;
    }

    public void setFecha_Creacion(Date fecha_Creacion) {
        Fecha_Creacion = fecha_Creacion;
    }

    public Date getFecha_Actualizacion() {
        return Fecha_Actualizacion;
    }

    public void setFecha_Actualizacion(Date fecha_Actualizacion) {
        Fecha_Actualizacion = fecha_Actualizacion;
    }

    private String Nombre_usuario;

    private String  Contrasena;

    private String Correo_electronico;

    private Double Estatura;

    private Double Peso;

    private double IMC;

    private  double GEB;

    private double ETA;
    private Date Fecha_Creacion;

    private  Date Fecha_Actualizacion;


    @NotNull
    private String nombre;

    private String apellido;

    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCLiente_id() {
        return CLiente_id;
    }

    public void setCLiente_id(String id) {
        this.CLiente_id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}