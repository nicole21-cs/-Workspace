import java.util.ArrayList;
import java.util.Scanner;

public class Ejercio7Nombres {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<String> listaStrings = new ArrayList<String>();
		String nombre = "fin";
		do {
			System.out.println("Introduzca un nombre: (hasta fin)");
		     nombre = sc.nextLine(); //se reutiliza como en numero=sc.nextInt
		     if(!nombre.equals("fin")) { //para que guarde todos los nombres excepto fin
		     listaStrings.add(nombre);
		     }
		}while(!nombre.equalsIgnoreCase("fin"));
		 for(String valor : listaStrings) {
			 System.out.println(valor);
		 }
	}
}
