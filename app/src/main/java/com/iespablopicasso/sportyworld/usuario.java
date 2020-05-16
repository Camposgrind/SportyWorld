package com.iespablopicasso.sportyworld;

public class usuario {

    //ESTADO

    protected String user;
    protected String passwd;
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String email;

    //Comportamientos

    //Constructor
    public usuario(String serializado) {
        String[] trozos;
        trozos = serializado.split(";");
        user = trozos[0];
        passwd = trozos[1];
        nombre = trozos[2];
        apellidos = trozos[3];
        dni = trozos[4];
        email = trozos[5];
    }

    public usuario(String user,String passwd,String nombre, String apellidos,String dni,String email) {
        this.user= user;
        this.passwd=passwd;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.email=email;
    }

    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return passwd;
    }

    public boolean test(String otrouser, String otropasswd) {
        return (otrouser.equals(user) && otropasswd.equals(passwd));
    }

    public String serializar() {
        return user + ";" +  passwd + ";" +  nombre + ";" +  apellidos + ";" +  dni + ";" +  email;
    }

}
