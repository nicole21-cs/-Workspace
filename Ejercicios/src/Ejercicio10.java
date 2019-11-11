import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaNombres = new ArrayList<String>();
		String nombre = "";
		do {
			System.out.println("Introduzca un nombre");
			nombre = sc.nextLine();
			if (!nombre.equalsIgnoreCase("fin")) {
				listaNombres.add(nombre);
			}
		} while (!nombre.equalsIgnoreCase("fin"));
		System.out.println("---Se van a mostrar los nombres en may�sculas---");
		for (String valor : listaNombres) {
			String mayusculas = valor.toUpperCase();
			System.out.println(mayusculas);
		}
		System.out.println("---Se van a mostrar los nombres en min�sculas---");
		for (String valor : listaNombres) {
			String minusculas = valor.toLowerCase();
			System.out.println(minusculas);
		}
        System.out.println("Fin del programa");
	}

}