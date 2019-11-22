package interfaces;

public class Persona {
	private String dni;
	private double peso;
	private int edad;
	
	

	public Persona(String dni, double peso, int edad) {
		super();
		this.dni = dni;
		this.peso = peso;
		this.edad = edad;
	}

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

	// estamos cambiando el metodo toString de la clase object
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", peso=" + peso + ", edad=" + edad + "]";
	}

}
