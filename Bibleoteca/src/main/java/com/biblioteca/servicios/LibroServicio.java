package com.biblioteca.servicios;

import com.biblioteca.entidades.Libro;
import com.biblioteca.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicio {

    @Autowired
    LibroRepositorio libroRepositorio;

    public List<Libro> getLibros (){
        return libroRepositorio.findAll();
    }

    public void guardarLibro(Libro libro) {
        libroRepositorio.save(libro);
    }

}
