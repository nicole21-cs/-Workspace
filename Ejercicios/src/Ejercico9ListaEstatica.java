import java.util.Scanner;

public class Ejercico9ListaEstatica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arrayNombres = new String [10];
		String nombre;
		System.out.println("Introduzca diez nombres");
		for(int i=0 ; i<arrayNombres.length; i++) {
			nombre = sc.nextLine();
			
		}
		
		System.out.println("Ahora se van a mostrar los nombres en may�sculas");
		for(String value : arrayNombres ) {
			String mayusculas = value.toUpperCase();
			System.out.println(mayusculas);
		}
		
		System.out.println("Ahora se van a mostrar los nombres en min�sculas");
		for(String valor : arrayNombres) {
			String minusculas = valor.toLowerCase();
			System.out.println(minusculas);
		}

	}

}