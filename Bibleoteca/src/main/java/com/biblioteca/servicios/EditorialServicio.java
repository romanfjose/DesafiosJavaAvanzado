package com.biblioteca.servicios;

import com.biblioteca.entidades.Editorial;
import com.biblioteca.repositorio.EditorialRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServicio {

    @Autowired
    EditorialRepositorio editorialRepositorio;

    public void guardarEditorial(Editorial editorial){
        editorialRepositorio.save(editorial);
    }
}
