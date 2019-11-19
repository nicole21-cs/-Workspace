package herencia;

public class Vehiculo {
	private String modelo;
	private String marca;
	private double velocidad;
	private int numAsientos;
	private double anguloDireccion;
	

	public Vehiculo(String modelo, String marca, double velocidad, int numAsientos, double anguloDireccion) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.velocidad = velocidad;
		this.numAsientos = numAsientos;
		this.anguloDireccion = anguloDireccion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public double getAnguloDireccion() {
		return anguloDireccion;
	}

	public void setAnguloDireccion(double anguloDireccion) {
		this.anguloDireccion = anguloDireccion;
	}
	//no necesitamos método de girar ya que tenemos el atributo de "anguloDireccion"
	//no necesitamos métodfo de velovidad ya que tenemos el atributo de velocidad

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", marca=" + marca + ", velocidad=" + velocidad + ", numAsientos="
				+ numAsientos + ", anguloDireccion=" + anguloDireccion + "]";
	}

}
