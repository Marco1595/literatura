package com.aluracursos.literatura.model;

import java.util.List;

public class Libro {
    private String titulo;
    private Autor autor;
    private List<String> idiomas;
    private Integer descargas;

    public Libro(DatosLibro datosLibro, Autor autor){
        this.titulo = datosLibro.titulo();
        this.autor = autor;
        this.idiomas = datosLibro.idiomas();
        this.descargas = datosLibro.descargas();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getDescargas() {
        return descargas;
    }

    public void setDescargas(Integer descargas) {
        this.descargas = descargas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", idiomas=" + idiomas +
                ", descargas=" + descargas +
                '}';
    }
}
