package com.biblioteca.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="editorial")
public class Editorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "editorial_id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany
    @JoinColumn(name = "libro_id")
    private List<Libro> libros;

    public Editorial() {
    }

    public Editorial(String nombre, List<Libro> libros) {

        this.nombre = nombre;
        this.libros = libros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }
}
