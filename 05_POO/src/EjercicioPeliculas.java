import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioPeliculas {

	public static void main(String[] args) {
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
		int opcion;
		do {
			 mostrarMenu();
			 opcion = leerOpcion();
			 if(opcion == 1) {
				 String titulo = leerDatos(" el t�tulo de la pel�cula");
				 String genero = leerDatos(" el g�nero de la pel�cula");
				 String director = leerDatos(" el director de la pel�cula");
				 String sPuntuacion = leerDatos(" puntuaci�n si lo desea");
				 double dPuntuacion = Double.parseDouble(sPuntuacion);
				 
				 Pelicula p = new Pelicula(titulo, genero, director, dPuntuacion);
				 listaPeliculas.add(p);
				 
			 }else if(opcion == 2) {
				 recorrerArray(listaPeliculas);
			 }
		}while(opcion != 0);
		
		System.out.println("Gracias por su colaboraci�n");

	}
    
	public static void mostrarMenu() {
		System.out.println("Escoja una opci�n");
		System.out.println("1-Alta de la pel�cula");
		System.out.println("2-Listar pel�culas");
		System.out.println("0-Salir del programa");
		
	}
	public static int leerOpcion() {
		Scanner sc = new Scanner(System.in);
		String sOpcion = sc.nextLine();
		int iOpcion = Integer.parseInt(sOpcion); //si  no hacemos esto nos dar� problemas 
		return iOpcion;                          //a la larga
	}
	 
	public static String leerDatos(String cadena) { //cadena recibe el string que quiero leer
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza" + cadena);
		String dato = sc.nextLine();
		return dato;
		
	}
	 public static void recorrerArray(ArrayList<Pelicula> listaPeliculas) {
		 for(Pelicula p : listaPeliculas) {
			 System.out.println("----  Pel�cula ---- ");
			 System.out.println("El t�tulo de la pel�cula es : " + p.titulo);
			 System.out.println("El g�nero de la pel�cula es : " + p.genero);
			 System.out.println("El director de la pel�cula es : " + p.director);
			 // si en syso(p) ; solo ponemos p nos va amostrar la direcci�n del objeto
		 }
	 }
	    
	
}	
	         
