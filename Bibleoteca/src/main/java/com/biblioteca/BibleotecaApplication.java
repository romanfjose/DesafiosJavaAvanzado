package com.biblioteca;

import com.biblioteca.entidades.Autor;
import com.biblioteca.entidades.Categoria;
import com.biblioteca.entidades.Editorial;
import com.biblioteca.entidades.Libro;
import com.biblioteca.repositorio.EditorialRepositorio;
import com.biblioteca.repositorio.LibroRepositorio;
import com.biblioteca.servicios.AutorServicio;
import com.biblioteca.servicios.CategoriaServicio;
import com.biblioteca.servicios.EditorialServicio;
import com.biblioteca.servicios.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.border.LineBorder;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BibleotecaApplication implements CommandLineRunner {

	@Autowired
	AutorServicio autorServicio;

	@Autowired
	CategoriaServicio categoriaServicio;

	@Autowired
	EditorialServicio editorialServicio;

	@Autowired
	LibroServicio libroServicio;

	@Autowired
	LibroRepositorio libroRepositorio;


	public static void main(String[] args) {
		SpringApplication.run(BibleotecaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		long millis=System.currentTimeMillis();
		java.util.Date date=new java.util.Date(millis);


		Categoria categoria1 = new Categoria("Drama");
		Categoria categoria2 = new Categoria("Romance");
		Categoria categoria3 = new Categoria("Accion");
		Categoria categoria4 = new Categoria("Ciencia Ficcion");
		categoriaServicio.guardarCategoria(categoria1);
		categoriaServicio.guardarCategoria(categoria2);
		categoriaServicio.guardarCategoria(categoria3);
		categoriaServicio.guardarCategoria(categoria4);

		Autor autor1 = new Autor("Edgar Allan Poe", date, new ArrayList<Libro>() , "American");
		Autor autor2 = new Autor("Tini", date, new ArrayList<Libro>() , "Argentino");
		Autor autor3 = new Autor("Yatra", date, new ArrayList<Libro>() , "Colombia");
		Autor autor4 = new Autor("One Ok Rock", date, new ArrayList<Libro>() , "Japones");


		autorServicio.guardarAutor(autor1);
		autorServicio.guardarAutor(autor2);
		autorServicio.guardarAutor(autor3);
		autorServicio.guardarAutor(autor4);

		Editorial editorial1 = new Editorial("Pinguino", new ArrayList<Libro>());

		editorialServicio.guardarEditorial(editorial1);

		Libro libro5 = new Libro("Attack on Titan", date , autor1, editorial1, categoria1 );

		libroServicio.guardarLibro(libro5);


//	libroRepositorio.findById(1L).ifPresent(x -> System.out.println(x));



	//	libroServicio.getLibros().forEach(libro -> System.out.println(libro));

	}
}
