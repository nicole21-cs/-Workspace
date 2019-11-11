package JavaBean;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPelicula {

	public static void main(String[] args) {
		ArrayList<PeliculaBean> listaPeliculas = new ArrayList<PeliculaBean>();
		int opcion = 0;
		
		PeliculaBean peli1 = new PeliculaBean();
		peli1.setTitulo("Star Wars");
		peli1.setGenero("Ciencia ficci�n");
		peli1.setDirector("Rian Jhonson");
		peli1.setPuntuacion(7.6);
		System.out.println("Titulo : " + peli1.getTitulo());
		
		do {
			mostrarMenu();
			opcion = leerOpcion();
			if(opcion == 1) {
				String titulo = leerDato(" el titulo de la peli");
				String genero = leerDato(" el g�nero de la peli");
				String director = leerDato(" el director de la peli");
				String sPuntuacion = leerDato( "la puntuaci�n si queire");
				double dPuntuacion = Double.parseDouble(sPuntuacion);	
				
				PeliculaBean peli = new PeliculaBean(titulo, genero, director, dPuntuacion); 
				listaPeliculas.add(peli);
				
			}else if(opcion == 2) {
				recorrerArray(listaPeliculas);
			}
			
		}while(opcion != 0);
		System.out.println("Gracias por usarla");

	}
    
	public static void mostrarMenu() {
		System.out.println("Elija una opci�n : ");
		System.out.println("1-Dar de alta una pel�cula");
		System.out.println("2-Listar pel�culas");
		System.out.println("0-Salir del programa");
	}
	public static int leerOpcion() {
		Scanner sc = new Scanner(System.in);
		String sOpcion = sc.nextLine();
		int iOpcion = Integer.parseInt(sOpcion);
		return iOpcion;
	}
	public static String leerDato(String cadena) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca " + cadena);
		String dato = sc.nextLine();
		return dato;
	}
	public static void recorrerArray(ArrayList<PeliculaBean> listaPeliculas) {
		for(PeliculaBean peli : listaPeliculas) {
			System.out.println("----Pelicula----");
			System.out.println("Titulo : " + peli.getTitulo());
			System.out.println("G�nero : " + peli.getGenero());
			System.out.println("Director : " + peli.getDirector());
			System.out.println("Puntuaci�n : " + peli.getPuntuacion());
		}
	}
	
	
	
}