package com.alteabackend.demo.Models;

public class Chatbot {
    private static Long id;
    private static String Nombre;
    private static String Descripcion;

    public Chatbot(Long id, String Nombre, String Descripcion){
        Chatbot.id = id;
        Chatbot.Nombre = Nombre;
        Chatbot.Descripcion = Descripcion;
    }

    public Long getId() {
        return id;
    }

    public static void setId(Long id) {
        Chatbot.id = id;
    }

    public static String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        Chatbot.Nombre = Nombre;
    }

    public static String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        Chatbot.Descripcion = Descripcion;
    }

}