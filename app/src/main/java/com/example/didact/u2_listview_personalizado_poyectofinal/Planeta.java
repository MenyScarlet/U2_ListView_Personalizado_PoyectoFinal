package com.example.didact.u2_listview_personalizado_poyectofinal;

/**
 * Created by DIDACT on 31/01/2018.
 */

public class Planeta {

    //Atributos
    String nombre;
    String tipo;
    String satelites;
    String year;
    String imagen;

    //Constructor

    public Planeta(String nombre, String tipo, String satelites, String year, String imagen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.satelites = satelites;
        this.year = year;
        this.imagen = imagen;
    }


    //Getters & Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSatelites() {
        return satelites;
    }

    public void setSatelites(String satelites) {
        this.satelites = satelites;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
