package com.example.recyclerview.Modelos;

public class Persona {
    private Integer id;
    private String Nombre;
    private String Apellido;
    private Integer Edad;
//a8c74765
    public Persona(Integer id, String nombre, String apellido, Integer edad) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }
}
