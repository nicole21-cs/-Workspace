import java.util.Scanner;

public class EjercicioFactorial4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 1;
		int total = 1;
		System.out.println("Introduzca un numero");
		do {
			numero = sc.nextInt();
			if (numero < 0)
				System.out.println("Solo introducir numeros positivos");
		} while (numero < 0);
		while (numero != 0) {
			total = total * numero;
			numero--;
		}
		System.out.println("El total es:" + total);
	}
}
