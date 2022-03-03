package com.biblioteca.repositorio;

import com.biblioteca.entidades.Autor;
import org.springframework.data.repository.CrudRepository;

public interface AutorRepositorio extends CrudRepository<Autor,Long> {
}
