package interfaces;

public abstract class Empleado2 {
	private int salario; //este es un atributo de empleado2
	
	//Métodos abstractos
	 public abstract void fichar(int hora) ; //se pone abstract ya que son métodos que no se implementan
     public abstract boolean descansar(int minutos);
     
     //Métodos implementados , es para todas las clases en general
     public void trabajar(String tarea) {
    	 System.out.println("El empelado hace la tarea : " + tarea);
     }
     public double cobrar() {
    	 return salario;
     }
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
     
     
}
