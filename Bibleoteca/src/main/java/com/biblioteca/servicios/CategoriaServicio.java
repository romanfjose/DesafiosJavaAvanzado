package com.biblioteca.servicios;

import com.biblioteca.entidades.Categoria;
import com.biblioteca.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicio {

    @Autowired
    CategoriaRepositorio categoriaRepositorio;

    public void guardarCategoria(Categoria categoria){
        categoriaRepositorio.save(categoria);
    }
}
