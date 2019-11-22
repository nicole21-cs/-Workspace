package interfaces;

public class MainApp {

	public static void main(String[] args) {
        //Empleado e = new Empelado(); esto no se puede yua que empelado es una interfaz
		
		Persona p = new Persona("57896247L", 85.4, 50);
		System.out.println(p);
		
		Jefe j = new Jefe("57960847K", 78.4, 45);
		System.out.println(j);
		System.out.println("El jefe cobra:" +j.cobrar());
		j.trabajar("firmar papeles");
		
		//Jefe j2 = new Perosna("4789552J", 47.5,45); no se puede ya que un objeto hijo no puede apuntar al padre
		
		Persona p2 = new Jefe("789647P", 59.4, 33); //esto si se puede ya que eL PADRE puede llamar a un objeto hijo
		//p2.fichar(); como persona no tiene el método fichar, dar error
	    System.out.println("El DNI del jefe es : " + p2.getDni());
	    
	    Jefe2 jf = new Jefe2();
	    Becario b = new Becario();
	    
	    jf.setSalario(5000);
	    b.setSalario(500);
	    System.out.println("El jefe cobra : " + jf.cobrar());
	    System.out.println("El becario cobra : " + b.cobrar());
	    
	    System.out.println("¿Se acepta descansar al becario? " + b.descansar(30));
	    b.fichar(9);
	    jf.fichar(10);
	}

}
