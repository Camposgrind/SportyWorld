package com.iespablopicasso.sportyworld;

//import java.util.ArrayList;
import java.util.HashMap;

public class ListaUsuarios {


    //ESTADO

    //Lista de ejercicios disponibles
    //protected ArrayList<usuario> listaUsuarios;
    private HashMap<String, usuario> mapaUsuarios;



    //Comportamiento


    //Constructor
    public ListaUsuarios() {

        mapaUsuarios = new HashMap<>();
    }

    //Añadir un usuario
    public void addUsuario(usuario nuevoU) {
        mapaUsuarios.put(nuevoU.getUser(),nuevoU);
    }

    //¿Cuántos hay?
    public int size() {
        return mapaUsuarios.size();
    }

    //Devolver el usuario dado su user
    public usuario getUsuarioByUser(String user) {
        usuario aUser = null;

        aUser = mapaUsuarios.get(user);

        return aUser;

    }


    //Test para el login
    public boolean test(String user,String passwd) {
        usuario miUser;

        miUser = this.getUsuarioByUser(user);

        if (miUser == null) return false;
        else return (miUser.test(user,passwd));
    }
}
