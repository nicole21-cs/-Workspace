import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCoche3Corregido {

	public static void main(String[] args) {
		// se ponen variables para no perder los datos que devuelve la funci�n, cada vez
		// que se crea unan variable y se iguala a "leer dato" se crea la variable dato
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduza el coche " + i);
			String matricula = leerDato("matricula");
			String marca = leerDato("marca");
			String modelo = leerDato("modelo");
			String estado = leerDato("si lo quiere nuevo o de Segunda mano");
			/*
			 * boolean nuevo = false , esto es por si pongo boolean isNew
			 * if(esNuevo.equals("fin"){ nuevo=true; }
			 */

			Coche c = new Coche(matricula, marca, modelo, estado);
			listaCoches.add(c);
		}
		recorrerArray(listaCoches);
		System.out.println("Hasta luego");
	}

	public static String leerDato(String cadena) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca " + cadena);
		String dato = sc.nextLine();
		return dato;
	}

	public static void recorrerArray(ArrayList<Coche> listaCoches) { // la listaCoches es una variable(referencia) que
																		// se crea y apunta al mimso objeto que la lista
																		// que ponemos al invocar esta funci�n
		int i = 1;
		for (Coche c : listaCoches) { // este for each va apuntando a cada objeto guardado por orden de posici�n
			mostrarCoche(c, i);
			i++;
		}
	}

	public static void mostrarCoche(Coche c, int i) { // hacer esto es para que se entienda mejor
		System.out.println("Mostrando coche" + i);
		System.out.println("Mostrando matricula : " + c.matricula);
		System.out.println("Mostrando marca : " + c.marca);
		System.out.println("Mostrando modelo : " + c.modelo);
		System.out.println("Mostrando estado : " + c.mantenimiento);

	}
}
