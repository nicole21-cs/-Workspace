import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaNombres = new ArrayList<String> ();
		String nombre;
		System.out.println("Introduzca diez nombres");
		for(int i=0 ; i<=9 ; i++) {
			nombre = sc.nextLine();
			listaNombres.add(nombre);
		}
		System.out.println("Se van a mostrar los nombres en may�sculas");
		for(String valor : listaNombres) {
			String mayusculas = valor.toUpperCase(); //se puede poner directamente dentro del syso(valor.toUpperCase)
			System.out.println(mayusculas);
		}
		System.out.println("Se van a mostrar los nombres en min�sculas");
		for(String valor : listaNombres) {
		   String minusculas = valor.toLowerCase();
		   System.out.println(minusculas);
		}
	}

}
