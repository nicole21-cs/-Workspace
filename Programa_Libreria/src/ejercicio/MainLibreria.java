package ejercicio;


import java.util.ArrayList;
import java.util.Scanner;

public class MainLibreria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		Libreria l = new Libreria();
		l.setListaLibros(listaLibros);
		
		int opcion = 0;
		System.out.println("Bienvenidos a la libreria LILO");
		
		do {
			opcion = mostrarMenu();
			if(opcion == 1) {
				String titulo = leerDato(" el titulo del libro");
				String editorial = leerDato(" la editorial del libro");
				String isbn = leerDato(" el isbn");
				String nombreAutor = leerDato("el autor");
				String apellidoAutor = leerDato("los apellidos del autor");
				String fechaNacimiento = leerDato("la fecha de nacimiento del autor");
				
				Autor autor = new Autor(nombreAutor, apellidoAutor, fechaNacimiento);
				Libro lib = new Libro(isbn, titulo, editorial, autor);
				listaLibros.add(lib);
				
			}else if(opcion == 2) {
			  System.out.println("Introduzca un ISBN para buscar el libro");
			  String isbn = sc.nextLine();
			  //l.busquedaIsbn(isbn);
			  Libro libro = l.busquedaIsbn(isbn);
			  System.out.println(libro);
			  
			}else if (opcion == 3) {
				recorrerArray(listaLibros);
			}else if(opcion==4) {
				System.out.println("Introduzca un editorial para buscar libros");
				String editorial = sc.nextLine();
				ArrayList<Libro> listaLibrosEditorial = l.busquedaEditorial(editorial);
				recorrerArray(listaLibrosEditorial);
			}else if(opcion == 5) {
				System.out.println("Introduzca un nombre para buscar el libro");
				String nombreAutor = sc.nextLine();
				ArrayList<Libro> listaLibrosPorNombre  = l.busquedaLibrosPorNombreAutor(nombreAutor);
				System.out.println(listaLibrosPorNombre);
			}
				
		}while(opcion != 0);
		System.out.println("Fin del programa");

	}
     public static int mostrarMenu() {
    	 
	     System.out.println("Elija una opci�n");
	     System.out.println("1-Alta de libro");
	     System.out.println("2-B�squeda de libro por isbn");
	     System.out.println("3-Listar libros");
	     System.out.println("4-B�squeda de libros por editorial");
	     System.out.println("5-B�squeda de autores por nombre");
	     System.out.println("0-Salir");
	     Scanner sc = new Scanner(System.in);
	     String sopcion = sc.nextLine();
	     
	    int iopcion = -1; //si se pone 0 se confundiria con el 0 de la opci�n
		try {
			iopcion = Integer.parseInt(sopcion);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Solo se admiten n�meros");
		}
	     return iopcion;
     }
     public static String leerDato(String cadena) {
    	 System.out.println("Introduzca" + cadena);
    	 Scanner sc = new Scanner(System.in);
    	 String dato = sc.nextLine();
    	 return dato;
     }
     public static void recorrerArray(ArrayList<Libro> listaLibros) {
    	 for(Libro l : listaLibros) {
    		 System.out.println("----LIBRO----");
    		 System.out.println("El t�tulo es : " + l.getTitulo());
    		 System.out.println("La editorial es : " + l.getEditorial());
    		 System.out.println("El isbn es : " + l.getIsbn());
    		 System.out.println("El autor es : " + l.getAutor());
    		 System.out.println("--------------");
    	 }
     }
}
