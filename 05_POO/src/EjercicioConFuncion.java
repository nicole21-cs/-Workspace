
public class EjercicioConFuncion {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		c1.matricula = "1111ADD";
		c1.marca = "Mercedes";
		c1.modelo = "Mercedes C-4";
		c1.mantenimiento = "Nuevo";
		imprimirCoche(c1);
		
		

		Coche c2 = new Coche();
		c2.matricula = "8508DXX";
		c2.marca = "Opel";
		c2.modelo = "Zafira 96";
		c2.mantenimiento = "Segunda mano";
		imprimirCoche(c2);

		Coche c3 = new Coche();
		c3.matricula = "6754KFC";
		c3.marca = "Seat";
		c3.modelo = "Le�n";
		c3.mantenimiento = "Segunda mano";
		imprimirCoche(c3);
		
		Coche c4 = new Coche("3452GHL"); //aunque solo le demos matr�cula , tambi�n se le puede asignar m�s caracteres
		//System.out.println("La matr�cula es : " + c4.matricula);
		c4.marca = "Audi";
		c4.modelo = "A-5 Caprio";
		imprimirCoche(c4);
		
		Coche c5 = new Coche("9875BDH", "Peugeot");
		/*System.out.println("Matricula : " + c5.matricula);
		System.out.println("Marca : " + c5.marca);*/
		imprimirCoche(c5);
		
		Coche c6 = new Coche("6432FRT", "Kia", "98", "Nuevo");
		/*System.out.println("Matricula : " + c6.matricula);
		System.out.println("Marca : " + c6.marca);
		System.out.println("Modelo : " + c6.modelo);
		System.out.println("Mantenimiento : " + c6.mantenimiento);
		*/
		imprimirCoche(c6);

	}
	/* public static void imprimirCoche(String matricula , String marca , String modelo , String mantenimiento ) {
	 System.out.println("----COCHE----");
	 System.out.println("Matricula : " + matricula);
	 System.out.println("Marca : " + marca);
	 System.out.println("Modelo : " + modelo);
	 System.out.println("Mantenimiento : " + mantenimiento);
     */
	public static void imprimirCoche(Coche c) { // el nombre en "azul"(Coche) es el que hay que poner como lo hemos
													// puesto en la referencia de class
		System.out.println("----COCHE----");
		System.out.println("Matricula : " + c.matricula);
		System.out.println("Marca : " + c.marca);
		System.out.println("Modelo : " + c.modelo);
		System.out.println("Mantenimiento : " + c.mantenimiento);

	}

}
