package com.biblioteca.servicios;

import com.biblioteca.entidades.Autor;
import com.biblioteca.repositorio.AutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicio {

    @Autowired
    AutorRepositorio autorRepositorio;

    public void guardarAutor(Autor autor){
        autorRepositorio.save(autor);

    }


}
