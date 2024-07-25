package com.aluracursos.literatura.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table (name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nombre;
    private String nacimiento;
    private String muerte;
    @OneToMany(mappedBy = "autor",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Libro> libro;

    public Autor(){}

    public Autor(DatosAutor autor){
        this.nombre = autor.nombre();
        this.nacimiento = autor.nacimiento();
        this.muerte = autor.muerte();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Libro> getLibro() {
        return libro;
    }

    public void setLibro(List<Libro> libro) {
        this.libro = libro;
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
