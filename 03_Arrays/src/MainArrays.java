import java.util.ArrayList;

public class MainArrays {

	public static void main(String[] args) {
		//Las listas Java tiene listas din�micas y listas est�ticas
		//Listas est�ticas
		int[] arrayNumeros = new int[10]; //[10] Esto es las posiciones que tiene el arryay
		arrayNumeros[0] = 23; //para que guarde el n�mero
        System.out.println(arrayNumeros[0]);
        System.out.println(arrayNumeros[1]);
        System.out.println(arrayNumeros.length); //es un m�todo de la clase array; la longitud del array
        
        System.out.println("-----Recorremos Array------");
        for(int i=0; i<=arrayNumeros.length - 1 ;i++) { //esto es para recorrer el array
          System.out.println("Valor de la posicion" + i + "del array es " + arrayNumeros[i]);
        }
         //si ponemos una posicion del array que no existe,pagaras cara tu estupidez
        //porque JAVA te para el programa instantaneamente
       //System.out.println(arrayNumeros[10]);
       //System.out.println("esto NO se ejecuta despu�s");
        System.out.println(arrayNumeros[8]);
        System.out.println("Esto se ejecutar� despu�s");
        
        //Listas din�micas -- Son objetos en JAVA ,por ello tiene un estado y unos atributos
        //hay que utilizar la clase array list
        ArrayList<String> listaStrings = new ArrayList<String>();
        listaStrings.add(0, "Harry"); // primer valor es la posici�n del array.El segundo valor que contendr� el ARRAY
        listaStrings.add(1, "Ermion");
        boolean a = listaStrings.add("Ron"); //se hace asi y ya se a�ade directamente a la siguiente posicion
        System.out.println(listaStrings.get(0));
        System.out.println(listaStrings.get(2));
        
        for(int i=0; i<listaStrings.size();i++) { //esta forma ya no se utiliza
        	System.out.println(listaStrings.get(i));
        }
        
        //Se utiliza esta forma para recorrer un array es un for each
        
        for(String valor : listaStrings) { //for(poner el tipo : la lista que queremos recorrer
        	System.out.println(valor);
        
        System.out.println("----Recorriendo el arrayNumeros-----");
        for(int n : arrayNumeros) { 
        	System.out.println(n);
        }
        }
	}

}
