
public class Variables {

	public static void main(String[] args) {
		//En JAVA tenemos dos tipos de variables
		//tenemos variables primitivas
		//tenmso variables de referencia
		//las siguientes serian variables primitivas:
		//int,long,double,boolean
		int numero = 0; //variable numerica
		System.out.println("El numero es:" + numero);
		int numero2 = 78;
		System.out.println(numero2);
		
		//otros tipos de variables
		long numeroLargo = 676;
		double numeroReal = 34.589;
		boolean cierto = true;
		cierto = false;
		System.out.println(numeroLargo);
		System.out.println(numeroReal);
		
		//el otro tipo son las variables de referencia o directamente referenciales
		String nombre = "pepe"; //declaración de variable
		System.out.println("El nombre es:" + nombre);
		nombre="Laura"; //asignación de variable
		System.out.println("El nombre es:" + nombre);
		int numero3; //esto se puede pero es buena costumbre inicializar las variables
		numero3 = 98;
		System.out.println(numero3);
		
		double numero4 = 10;
		double numero5 = numero4;
		
		int numero6 = 56;
		double numero7 = 7;
		
		double numero8 = 58;
		int numero9 = (int)numero8; //El (int)intenta meter el 58 en "caja double"
		System.out.println(numero9);

	}

}
