package com.iespablopicasso.sportyworld;

import java.util.ArrayList;

public class ListaActividades {

    //ESTADO
    protected ArrayList<Actividad> listaActividades;


    //CONSTRUCTOR
    public ListaActividades(){
        listaActividades= new ArrayList<>();
    }
    //COMPORTAMIENTOS
    public void addActividad(Actividad nuevaAc) {listaActividades.add(nuevaAc);
    }

    //¿Cuántos hay?
    public int size() {
        return listaActividades.size();
    }

    //Dar el ejercicio de la posición i
    public Actividad getActividadByIndex(int index) {
        return listaActividades.get(index);
    }

    public ArrayList<String> getActividadByUser(String user) {
        ArrayList<String> resultado= new ArrayList<>();

        int i = 0;


        while (i<listaActividades.size()) {
            if (listaActividades.get(i).getMiUsuario().equals(user)) {
                resultado.add(listaActividades.get(i).ponerTexto());
            } else
                i++;
        }


        return resultado;

    }


}
