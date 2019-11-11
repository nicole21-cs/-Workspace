import java.util.Scanner;

public class EjercicioFactorialCorregido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int total = 1;
		System.out.println("Introduzca un numero");
		numero = sc.nextInt();
		for(int i=2 ; i<=numero ; i++) {
		     total = total *i ;
		}    
	    System.out.println("El factorial de" + numero + "es:" + total);
	}
}
