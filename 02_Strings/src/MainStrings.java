
public class MainStrings {
	public static void main(String[] args) {
		//Las cadenas en java no son primitivas , son objetos
		String cadena = "Harry Potter";
        String cadena2 = "Ermion";
        String cadena3 = "Ron Wesly";
        
        String valor = "hommer";
        String valor2 = "hommer";
        
        //para comparar strings SIEMPRE el m�todo equals
        if(valor.equals(valor2)) {
        	System.out.println("Los nombres son iguales");
        }
        
        String valor3 = "Hommer";
        if(valor.equals(valor3)) {
        	System.out.println("Los nombres son iguales");
        }else {
        	System.out.println("Los nombres son diferentes");
        }
        
        if(valor.equalsIgnoreCase(valor3)) {
        	System.out.println("Los nombres son iguales");
        }else {
        	System.out.println("Los nombres son diferentes");
        }
        String frase = "Hommer se comio un pollo";
        if(frase.contains("Hommer")) { //para decir si existe la palabra 
        	System.out.println("Si que existe Hommer");
        }else {
        	System.out.println("no existe Hommer");
        }
        String mayusculas = frase.toUpperCase(); //frase.toUpperCase sirve para poner en may�scula la frase declarada en la variable
        System.out.println(mayusculas);
	    
        System.out.println(frase.endsWith("pollo"));
        
        String subcadena = frase.substring(0,6); //para imprimir una palabra especifica y se empieza a contar desde 0 hasta una letra mas de la que quieras
        System.out.println(subcadena);
        
        String subcadena2 = frase.substring(0,9).toUpperCase().concat("N").toLowerCase(); //ESTO NO HAY QUE HACERLO ES CONFUSO
        System.out.println(subcadena2);
        
        String subcadena3 = frase.substring(0,9).substring(0,6); //se i9mprimir� el ultimo substring
        System.out.println(subcadena3);
        
        System.out.println(frase.length());
	}
}
