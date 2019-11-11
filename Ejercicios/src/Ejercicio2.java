import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int numeroMayor = 0;
		System.out.println("Introduzca un numero");
		numero = sc.nextInt();
		while (numero > 0) {
			numero = sc.nextInt();
			if (numero > numeroMayor) {
				numeroMayor = numero;
			}
			System.out.println("El número mayor es:" + numeroMayor);
		}
		System.out.println("Fin del programa");
	}
}
