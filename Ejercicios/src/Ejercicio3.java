import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int numeroMayor=0;
		do {
			numeroMayor = 0;
			System.out.println("Introduzca un numero");
			numero = sc.nextInt();
			while (numero > 0) {
				numero = sc.nextInt();
				if (numero > numeroMayor) {
					numeroMayor = numero;
				}
			}
			System.out.println("El número mayor es:" + numeroMayor);
			System.out.println("Desea introducir otra secuencia 0-si , 1-no ");
			numero = sc.nextInt();
		} while (numero == 0);
		System.out.println("Fin del programa");

	}

}
