package com.biblioteca.entidades;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name="autor")
public class Autor {

    public Autor() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "libro_id")
    private List<Libro> libros;

    @Column(name = "nacionalidad")
    private String nacionalidad;


    public Autor(String nombre, Date fecha_nacimiento, List<Libro> libros, String nacionalidad) {

        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.libros = libros;
        this.nacionalidad = nacionalidad;
    }



    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", libros=" + libros +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
