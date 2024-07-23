package com.aluracursos.literatura.model;

import java.util.List;
import java.util.stream.Collectors;

public class Autor {
    private String nombre;
    private String nacimiento;
    private String muerte;
    private List<Libro> libro;

    public Autor(){}

    public Autor(DatosAutor autor){
        this.nombre = autor.nombre();
        this.nacimiento = autor.nacimiento();
        this.muerte = autor.muerte();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getMuerte() {
        return muerte;
    }

    public void setMuerte(String muerte) {
        this.muerte = muerte;
    }

    @Override
    public String toString() {
        return "************+AUTOR************" +
                "Nombre='" + nombre + '\'' +
                ", Fecha de nacimiento='" + nacimiento + '\'' +
                ", Fecha de Fallecimiento='" + muerte + '\'' +
                "Libros= " + libro.stream().map(Libro::getTitulo).collect(Collectors.toUnmodifiableList()) + '\n' +
                "****************************" + '\n';
    }
}
