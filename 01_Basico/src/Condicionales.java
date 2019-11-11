
public class Condicionales {
	public static void main(String[] args) {
		boolean cierto = true;
		// ifs
		if (cierto == true) {
			System.out.println("El valor es cierto");
		}
		cierto = false;
		if (cierto != false) {
			System.out.println("El valor es falso");
		}
		if (cierto == false) {
			System.out.println("El valor es falso");
		}
		if (cierto) {
			System.out.println("El valor es cierto");
		}
		if (!cierto) {
			System.out.println("El valor es false");
		}
		cierto = false;
		if (cierto == false) {
			System.out.println("Es falso");
			System.out.println("De hecho muy falso");
		}
		if (cierto) {
			System.out.println("La variable es cierta");
		} else {
			System.out.println("La variable NO es cierta");
		}

		int numero1 = 1;
		int numero2 = 10;
		if (numero1 > 0 && numero2 < 20) { //&& es el AND
			System.out.println("El numero es mayor que 0 y menor que 10");
		}
		if (numero1 < 0 || numero2 < 20) { // || es el OR
			System.out.println("numero1 es menor que 0 OR numero2 es menor que 2");
		}
		int numero3 = 2;
		if (numero3 == 0) {
			System.out.println("El valor es 0");
		} else if (numero3 == 1) {
			System.out.println("El valor es 1");
		} else if (numero3 == 2) {
			System.out.println("El valor es 2");
		}

	}
}
