package ejercicio;

import java.util.ArrayList;
import java.util.Scanner;


public class Libreria {
    private ArrayList<Libro> listaLibros;

	public ArrayList<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(ArrayList<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}
	
	public Libro busquedaIsbn(String isbnUsuario) {
		for(Libro l : listaLibros) {
			if(l.getIsbn().equalsIgnoreCase(isbnUsuario)) {
				 return l; //esto es para devolver el libro
			}
	   }	
		return null;
    }
	
	public ArrayList<Libro> busquedaEditorial(String editorial){ //es para devolver varios libros
		ArrayList<Libro> listaLibrosEditorial = new ArrayList<Libro>(); //aqui voy guardando losm libros de la misma editorial
		for(Libro l : listaLibros) {
			if(l.getEditorial().equalsIgnoreCase(editorial)) {
				listaLibrosEditorial.add(l);
			}
		}
		return listaLibrosEditorial;
	}
	
	public ArrayList<Autor> busquedaAutorPorNombre(String nombreAutor){ //búsqueda de autores con el mismo nombre 
		ArrayList<Autor> listaAutores = new ArrayList<Autor>();
		for(Libro l : listaLibros) {
			if(l.getAutor().getNombre().equalsIgnoreCase(nombreAutor)) {
				listaAutores.add(l.getAutor());
			}
		}
		return listaAutores;
	}
	public ArrayList<String> busquedaPorNombre(String nombre){ //solo quiero los nombres
		ArrayList<String> listaAutores = new ArrayList<String>();
		for(Libro l : listaLibros) {
			if(l.getAutor().getNombre().equalsIgnoreCase(nombre)) {
				listaAutores.add(l.getAutor().getNombre());
			}
		}
		return listaAutores;
	}
	public ArrayList<Libro> busquedaLibrosPorNombreAutor(String nombreAutor){//esto es pra buscar un libro por el nombre del autor
		ArrayList<Libro> listaLibrosPorNombre = new ArrayList<Libro>();
		for(Libro l : listaLibros) {
			if(l.getAutor().getNombre().equalsIgnoreCase(nombreAutor)) {
				listaLibrosPorNombre.add(l);
			}
		}
		return listaLibrosPorNombre;
	}

	@Override
	public String toString() {
		return "Libreria [listaLibros=" + listaLibros + "]";
	}
	
}