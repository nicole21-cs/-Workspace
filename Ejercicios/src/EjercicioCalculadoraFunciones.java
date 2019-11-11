import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCalculadoraFunciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> listaResultados = new ArrayList<Double>();
		ArrayList<String> fraseResultado = new ArrayList<String>();
		int opcion = 0;
		double resultado = 0;
		do {
			opcion = mostrarMenu(); // si no pongo variable el numero de la opcion se quedaria PERDIDO
			if (opcion == 1) {
				mostrarOpcion("sumar");
				double numero2 = leerNumero();
				double numero3 = leerNumero();
				resultado = sumar(numero2, numero3);
				System.out.println("El resultado es : " + resultado);
				listaResultados.add(resultado);
				String frase = "La suma de " + numero2 + " y " + numero3 + " es : " + resultado;
				fraseResultado.add(frase);

			} else if (opcion == 2) {
				mostrarOpcion("restar");
				double numero2 = leerNumero();
				double numero3 = leerNumero();

				resultado = restar(numero2, numero3);
				System.out.println("El resultado es : " + resultado);
				listaResultados.add(resultado);
				String frase = "La resta de " + numero2 + " y " + numero3 + " es : " + resultado;
				fraseResultado.add(frase);

			} else if (opcion == 3) {
				mostrarOpcion("multiplicar");
				double numero2 = leerNumero();
				double numero3 = leerNumero();

				resultado = multiplicar(numero2, numero3);
				System.out.println("El resultado es : " + resultado);
				listaResultados.add(resultado);
				String frase = "La multiplicacion de " + numero2 + " y " + numero3 + " es : " + resultado;
				fraseResultado.add(frase);

			} else if (opcion == 4) {
				mostrarOpcion("dividir");
				double numero2 = leerNumero();
				double numero3 = leerNumero();

				resultado = dividir(numero2, numero3);
				System.out.println("El resultado es : " + resultado);
				listaResultados.add(resultado);
				String frase = "La division de " + numero2 + " y " + numero3 + " es : " + resultado;
				fraseResultado.add(0, frase);
			}

		} while (opcion != 0);
		for (Double n : listaResultados) {
			System.out.println(n);
		}
		for (String valor : fraseResultado) {
			System.out.println(valor);

		}

		System.out.println("Ha elegido la opci�n salir");
		System.out.println("Fin del progrma");
		System.out.println("Gracias por utilizarlo , ADIOS!!!");

	}

	public static int mostrarMenu() {
		System.out.println("Elija un opci�n : ");
		System.out.println("1-Sumar");
		System.out.println("2-Restar");
		System.out.println("3-Multiplicar");
		System.out.println("4-Dividir");
		System.out.println("0-Salir");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		return opcion;

	}

	public static double leerNumero() {
		System.out.println("Introduzca un n�mero : ");
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		return numero;
	}

	public static void mostrarOpcion(String opcion) {
		System.out.println("Ha elegido la opci�n " + opcion);
	}

	public static double sumar(double n1, double n2) {
		return n1 + n2;
	}

	public static double restar(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}

	public static double dividir(double n1, double n2) {
		return n1 / n2;
	}

}
