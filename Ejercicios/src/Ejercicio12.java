import java.util.ArrayList;


public class Ejercicio12 {

	public static void main(String[] args) {
		ArrayList<String> listaRopa = new ArrayList<String> () ;
		listaRopa.add("camiseta");
		listaRopa.add("pantal�n");
	    elementosArray(listaRopa);
	    
	    ArrayList<String> listaComida = new ArrayList<String> () ;
		listaComida.add("pasta");
		listaComida.add("tarta");
	    elementosArray(listaComida);

	}
   public static void elementosArray(ArrayList<String> lista) {
	   System.out.println("----Lista----");
	   for(String valor : lista ) {
		   System.out.println(valor);
	   }
	   
   }
}
