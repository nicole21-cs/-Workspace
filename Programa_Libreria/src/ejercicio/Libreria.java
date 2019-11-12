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
				 return l;
			}
	   }	
		return null;
    }

	@Override
	public String toString() {
		return "Libreria [listaLibros=" + listaLibros + "]";
	}
	
}