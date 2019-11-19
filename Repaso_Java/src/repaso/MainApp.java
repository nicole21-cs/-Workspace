package repaso;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		int[] marks = {125, 192, 95 , 116, 110};
		//esta forma de recorrerlo también es util, pero con el for each es más fácil
		for (int i = 0 ; i<marks.length; i++) {
			System.out.println("El valor es : " + marks[i]);
		} 
		// For-each
		for(int num : marks) {
			System.out.println("2. El valor es : " + num);
		}
		
		//este array se usa para cuando no tenemos la clase creada o como en este caso son numeros poner int
		ArrayList<Integer> elementos = new ArrayList<Integer>();
		for(int num : marks) {
			System.out.println("2. El valor es : " + num);
			elementos.add(num); //lo añadimos a la lista de array los valores que se imprimen
		}
		//accediendo al array
		System.out.println(elementos.get(0));
			
			
		

	}

}
