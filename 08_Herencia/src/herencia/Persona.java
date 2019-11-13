package herencia;

//todas las clases se heredan de la clase object , se lo pongamos o no (extends Object)
public class Persona {
	//private String nombre;
    private String dni;
    private double peso;
    private int edad;
    
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//estamos cambiando el metodo toString de la clase object
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", peso=" + peso + ", edad=" + edad + "]";
	}
	
    
}
