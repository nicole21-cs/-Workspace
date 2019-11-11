import java.util.Scanner;

public class EjercicoCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero = 0;
		int resultado = 0;
		do {
			System.out.println("Elija un opción : ");
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("0-Salir");
			numero = sc.nextInt();
			if(numero == 1) {
				System.out.println("Ha elegido la opción sumar");
				System.out.println("Introduzca un número y pulse enter para introducir otro número");
			    int numero2=0; int numero3=0;
			    numero2 = sc.nextInt();
			    numero3 = sc.nextInt();
			    resultado = numero2 + numero3;
			    System.out.println("El resultado es : " + resultado);
			    
			}else if( numero == 2) {
				System.out.println("Ha elegido la opción restar");
				System.out.println("Introduzca un número y pulse enter para introducir otro número");
			    int numero2=0; int numero3=0;
			    numero2 = sc.nextInt();
			    numero3 = sc.nextInt();
			    resultado = numero2 - numero3;
			    System.out.println("El resultado es : " + resultado);
			    
			}else if(numero == 3) {
				System.out.println("Ha elegido la opción multiplicar");
				System.out.println("Introduzca un número y pulse enter para introducir otro número");
			    int numero2=0; int numero3=0;
			    numero2 = sc.nextInt();
			    numero3 = sc.nextInt();
			    resultado = numero2 * numero3;
			    System.out.println("El resultado es : " + resultado);
			    
			}else if(numero == 4) {
				System.out.println("Ha elegido la opción dividr");
				System.out.println("Introduzca un número y pulse enter para introducir otro número");
			    int numero2=0; int numero3=0;
			    numero2 = sc.nextInt();
			    numero3 = sc.nextInt();
			    resultado = numero2 / numero3;
			    System.out.println("El resultado es : " + resultado);
			    
			}
		}while(numero != 0);
		System.out.println("Ha elegido la opción salir");
		System.out.println("Fin del progrma");
		System.out.println("Gracias por utilizarlo , ADIOS!!!");

	}

}
