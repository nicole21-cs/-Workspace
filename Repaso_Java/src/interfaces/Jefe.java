package interfaces;

public class Jefe extends Persona  implements Empleado {
	
	
	 public Jefe(String dni, double peso, int edad) {//constructor superclass
		super(dni, peso, edad); //esto llama a la clase padre (Persona)
		
	}
	public void fichar(int hora) { //aqui si que hay que "rellenarlos" ya que es una clase
		 System.out.println("El empleado ha fichado a las: " + hora);
		 
	 }
     public boolean descansar(int minutos) {
    	 System.out.println("El jefe descansa: " + minutos + "minutos");
    	 return true;
    	 
     }
     public void trabajar(String tarea) {
    	 System.out.println("El jefe hace la tarea de:" + tarea);
    	 
     }
     public double cobrar() {
    	 return 10000.369;
     }
	@Override
	public String toString() {
		return "Jefe [Dni=" + getDni() + ", Peso=" + getPeso() + ", Edad=" + getEdad() + "]";
	}
     
     
    	 
}
