
public class EjercicioFunciones {

	public static void main(String[] args) {
	    imprimirAtributosMayusculas(" Alex ", " Santos ", 16 , "672825005");
	    imprimirAtributosMayusculas(" Nicole ", " Ca�ar ", 18 , "672825005");
	    imprimirAtributosMayusculas(" Lola ", " Garc�a ", 20 , "601476985");
	    
	    imprimirAtributosMinusculas(" Ivan ", " Palan ", 39 , "646267708");
	    imprimirAtributosMinusculas("Jessica", "Lopez", 54, "914785360");
	    imprimirAtributosMinusculas("Betty", "Abarca", 42, "665565932");
	    
	    imprimirPersona(" Ivan ", " Palan ", 39 , "646267708" , true);
	    imprimirPersona("Jessica", "Lopez", 54, "914785360" , false);
	    imprimirPersona("Betty", "Abarca", 42, "665565932" , true);
	    
	    
        
	}
   public static void imprimirAtributosMayusculas(String nombre , String apellido, int edad , String telefono) {
	   System.out.println("----PERSONA----");
	   System.out.println("nombre : " + nombre.toUpperCase());
	   System.out.println("apellido : " + apellido.toUpperCase() );
	   System.out.println("edad : " + edad);
	   System.out.println("telefono : " + telefono);
	   //System.out.println(nombre.toUpperCase()); "es mejor ponerlo con el mismo nombre"
	   //System.out.println(apellido.toUpperCase());  
	   
   }
    public static void imprimirAtributosMinusculas(String nombre , String apellido , int edad , String telefono) {
    	System.out.println("----PERSONA----");
 	   System.out.println("nombre : " + nombre.toLowerCase());
 	   System.out.println("apellido : " + apellido.toLowerCase() );
 	   System.out.println("edad : " + edad);
 	   System.out.println("telefono : " + telefono);
    }
    
    //Esta es una funci�n para mejorar lo anterior
    public static void imprimirPersona(String nombre, 
    		                           String apellido, 
    		                           int edad, 
    		                           String telefono,
    		                           boolean mayusculas) {
    	if(mayusculas) {
    		imprimirAtributosMayusculas(nombre, apellido, edad, telefono);
    	}else {
    		imprimirAtributosMinusculas(nombre, apellido, edad, telefono);
    	}
    }
}
