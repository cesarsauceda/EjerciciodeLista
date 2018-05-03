package com.example.sauceda.ejerciciodelista;

/**
 * Created by sauceda on 11/03/18.
 */

public class Datos {
    private int Id;
    private String Titulo;
    private String Detalle;
    private int Imgagen;

    public Datos(int id, String titulo, String detalle, int imgagen) {
        Id = id;
        Titulo = titulo;
        Detalle = detalle;
        Imgagen = imgagen;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public int getImgagen() {
        return Imgagen;
    }

    public void setImgagen(int imgagen) {
        Imgagen = imgagen;
    }
}
