package excepciones;

import java.util.Scanner;

public class MainExcepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		do {
			System.out.println("1-Dar de alta milenia");
			System.out.println("2-Buscar milenial");
			System.out.println("0-Salir");
		    try {
			opcion = sc.nextInt();
		    } catch (Exception e) {
			     //e.printStackTrace(); esto imprime la traza de error del programa
		    	sc.nextLine(); //se hace esto para que el escaner se "limpie" y el programa no se raye
			     System.out.println("Eh solo se admiten números!!! No me seas milenial");
		    } 
		   System.out.println("La opción elegida es : " + opcion);
		}while(opcion != 0);
	}

}
