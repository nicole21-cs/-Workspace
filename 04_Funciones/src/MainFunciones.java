import java.util.Scanner;

public class MainFunciones {
      /*
       * Funciones o metodos son cajas que no tenemos poque saber (no se va invocar a menos que la llamemos)
       * como hacen una funcionalidad(caja negra) pero si como usarla
       * Basicamente una funcion tiene de 0 a N par�metros de entrada 
       * y de 0 a 1 parametros de salida 
       * cuando usamos una funcion tenemos que saber cuantos 
       * parametro de entradda tienen y si tuiene de slaida
       * Por ejemplo :
       * System.out.println("Ola k ase");
       * La funci�n "pintln" tiene un parametro de entrada y 0 de salida
       * int i = sc.nextInt();
       * La funcion "nextInt" tiene 0 pr�metro de entrda y 1 pr�metro de salida 
       */
	public static void main(String[] args) {
		//Esta tambi�n es una funci�n muy especial porque es la funci�n Main , es decir el punto de entrada de nuestra aplicaci�n
        //Esta funci�n tiene un par�metro de entrda que es un array de Strings
		// y no tiene parametros de salida porque pone void
		
		System.out.println("Inicio del programa");
		mostrarMenu();
		System.out.println("Hago cosas...");
		mostrarMenu();
		imprimirNombre("felix");
		imprimirNombre("laura");
		imprimirNombre("Mar�a");
		imprimirNombreManolo();
		imprimirNombreApellidos("Mar", "Garc�a");
		imprimirNombreApellidos("Miriam", "Baeza");
		//leerNumero();
		System.out.println(leerNumero());
		int n1 = leerNumero();
		int n2 = leerNumero();
		int resultado = n1 + n2 ;
		System.out.println(resultado);
		System.out.println("Fin del programa");
	}
	//No importa la posici�n donde se cree la funcion , lo unico es que tiene que estar dentro de la clase
     // podemos crear todas las funciones que queramos 
	// Las funciones se creran dentro de la clase, pero nunca dentro de otra funci�n
	//Por ejemplo :
	//Primero se pone la visibilidad, en este caso "public" y luego la palabra "static"
	//Segundo se pone el valor de retorno si tuviera
	//En este caso void porque no tiene valores de retorno
	//Tercero se pone el nombre de la funci�n, en este caso "mostrarMenu"
	//Cuarto lugar se ponen los parametros de entrada en caso de tenerlos 
	//Los parametros de entrada van entre par�ntesis y si tiene varios van separados por " , "
	//En este caso no tenemos par�metros de entrada ni se salida 
	public static void mostrarMenu() { //funcion para mostrar menu por pantalla
		System.out.println("1-Crear persona");
		System.out.println("2-Borrar persona");
		System.out.println("3-Modificar persona");
		System.out.println("4-Buscar persona");
		System.out.println("0-Salir del programa");
	}
	
	public static void imprimirNombreManolo() { // Esto no es muy funcional 
		System.out.println("Manolo");
	}
	//En esta funci�n quiero imprimir,SOLO IMPRIMIR no leer, de manera bonita un nombre por pantalla
	//Como queremos imprimir un nombre cualquiera habria que tener un par�metro de entrda (String nombre)
	public static void imprimirNombre(String nombre) { 
		System.out.println("**********");
		System.out.println("****" + nombre + "****");
		System.out.println("**********");
	}
	public static void imprimirNombreApellidos(String nombre, String apellidos) { 
		System.out.println("**********");
		System.out.println("****" + nombre + "****");
		System.out.println("****" + apellidos + "****");
		System.out.println("**********");
	}
	//Funcion que lea un numero del usuario y devolverlo
	public static int leerNumero() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero");
		//el ciclo de vida de esta variable empieza en la siguiente y muere cuando salga del bloque de la funci�n "{}" 
		int numero = sc.nextInt(); //hay que devolver para qeu no se pierda el numero metido
		return numero; //devuelve el valor a quien haya llamada a la funci�n ,  hay que devolver aqlgo si se quiere operar con ello
	}
}