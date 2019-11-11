import java.util.Scanner;

public class Ejercico5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduzca un numero");
		numero = sc.nextInt();
		for(int i=0; i<=numero ; i++) {
			if(i % 2 == 0) {
				System.out.println("Los numeros pares son:" + i);
			}
		}
		System.out.println("Fin del programa");
		

	}

}
