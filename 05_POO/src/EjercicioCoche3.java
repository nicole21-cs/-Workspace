import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioCoche3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Coche> listaCoches = new ArrayList<Coche> ();
		
		System.out.println("Introduzca la matricula");
		String matricula = sc.nextLine();
		System.out.println("Introduzca la marca del cohe");
		String marca = sc.nextLine();
		System.out.println("Introduzca el modelo del cohe");
		String modelo = sc.nextLine();
		System.out.println("Introduzca si lo quiere Nuevo o de Segunda mano");
		String estado = sc.nextLine();
		
		Coche c = new Coche(matricula, marca, modelo, estado);
		listaCoches.add(c);
	 
		for(Coche coche : listaCoches) {
			System.out.println("Matrícula : " + coche.matricula);
			System.out.println("Marca : " + coche.marca);
			System.out.println("Modelo : " + coche.modelo);
			System.out.println("Estado : " + coche.mantenimiento);
		} 
		 
		/*imprimirCoche();
		imprimirCoche();
		imprimirCoche();
		System.out.println("Gracias por usarlo"); */
		

		System.out.println("Introduzca la matricula");
		 matricula = sc.nextLine();
		System.out.println("Introduzca la marca del cohe");
		 marca = sc.nextLine();
		System.out.println("Introduzca el modelo del cohe");
		 modelo = sc.nextLine();
		System.out.println("Introduzca si lo quiere Nuevo o de Segunda mano");
		 estado = sc.nextLine();
		
		Coche c2 = new Coche(matricula, marca, modelo, estado);
		listaCoches.add(c2);
		
		for(Coche coche : listaCoches) {
			System.out.println("Matrícula : " + coche.matricula);
			System.out.println("Marca : " + coche.marca);
			System.out.println("Modelo : " + coche.modelo);
			System.out.println("Estado : " + coche.mantenimiento);
		}
		
		System.out.println("Introduzca la matricula");
		 matricula = sc.nextLine();
		System.out.println("Introduzca la marca del cohe");
		 marca = sc.nextLine();
		System.out.println("Introduzca el modelo del cohe");
		 modelo = sc.nextLine();
		System.out.println("Introduzca si lo quiere Nuevo o de Segunda mano");
		 estado = sc.nextLine();
		
		Coche c3 = new Coche(matricula, marca, modelo, estado);
		listaCoches.add(c3);
		
		for(Coche coche : listaCoches) {
			System.out.println("Matrícula : " + coche.matricula);
			System.out.println("Marca : " + coche.marca);
			System.out.println("Modelo : " + coche.modelo);
			System.out.println("Estado : " + coche.mantenimiento);
		}
	
        
        	
        
	}
   /*public static void imprimirCoche() {
	   Scanner sc = new Scanner(System.in);
	   ArrayList<Coche> listaCoches = new ArrayList<Coche> ();
		
		System.out.println("Introduzca la matricula");
		String matricula = sc.nextLine();
		System.out.println("Introduzca la marca del cohe");
		String marca = sc.nextLine();
		System.out.println("Introduzca el modelo del cohe");
		String modelo = sc.nextLine();
		System.out.println("Introduzca si lo quiere Nuevo o de Segunda mano");
		String estado = sc.nextLine();
		
		Coche c = new Coche(matricula, marca, modelo, estado);
		listaCoches.add(c);
		
		for(Coche coche : listaCoches) {
			System.out.println("Matrícula : " + coche.matricula);
			System.out.println("Marca : " + coche.marca);
			System.out.println("Modelo : " + coche.modelo);
			System.out.println("Estado : " + coche.mantenimiento);
		} */
	   
   }

