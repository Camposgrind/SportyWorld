package com.iespablopicasso.sportyworld;

import java.io.Serializable;
import java.util.Date;

public class Actividad implements Serializable {
    //ESTADO
    String hora;
    String fecha;
    String miUsuario;
    String ejercicio;
    float minutos;
    float kCal;


    //CONSTRUCTOR
    public Actividad(String miHora,String miFecha,String miUsuario,String miEjercicio,float misMinutos,float miKCal){
        hora=miHora;
        fecha=miFecha;
        this.miUsuario=miUsuario;
        this.ejercicio=miEjercicio;
        minutos= misMinutos;
        kCal = miKCal;
    }

    //COMPORTAMIENTOS

    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMiUsuario() {
        return miUsuario;
    }

    public String getEjercicio() {
        return ejercicio;
    }
    public float getMinutos(){
        return minutos;
    }
    public float getkCal(){
        return kCal;
    }
    public String ponerTexto() {
        return ejercicio+" el "+fecha+", a las "+hora+" Duración: "+minutos+". "+kCal;
    }
}
