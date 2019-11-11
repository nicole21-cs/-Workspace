import java.util.Scanner;

public class CuadradoDeUnNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int resultado ;
        System.out.println("Introduzca un numero");
        numero = sc.nextInt();
        resultado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es " + resultado);
        

	}

}
