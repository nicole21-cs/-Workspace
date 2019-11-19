package herencia;

public class Turismo extends Automovil {
	private int numPuertas ;
	private int numVentanas;

	public Turismo(String modelo, String marca, double velocidad, int numAsientos, double anguloDireccion,
			String matricula, int numRuedas, String tipoMotor, double potenciaMotor) {
		super(modelo, marca, velocidad, numAsientos, anguloDireccion, matricula, numRuedas, tipoMotor, potenciaMotor);
		// TODO Auto-generated constructor stub
	}

	public Turismo(String modelo, String marca, double velocidad, int numAsientos, double anguloDireccion,
			String matricula, int numRuedas, String tipoMotor, double potenciaMotor, int numPuertas, int numVentanas) {
		super(modelo, marca, velocidad, numAsientos, anguloDireccion, matricula, numRuedas, tipoMotor, potenciaMotor);
		this.numPuertas = numPuertas;
		this.numVentanas = numVentanas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumVentanas() {
		return numVentanas;
	}

	public void setNumVentanas(int numVentanas) {
		this.numVentanas = numVentanas;
	}
	
	public void abrirPuerta() {
		System.out.println("Puerta abierta!!!");
	}
	public void abrirCapo() {
		System.out.println("Capó abierto!!!");
	}

	@Override
	public String toString() {
		return "Turismo [Número de puertas = " + numPuertas + ",\n Número de ventanas = " + numVentanas + ",\n Matricula = "
				+ getMatricula() + ",\n Número de ruedas = " + getNumRuedas() + ",\n Tipo de motor = " + getTipoMotor()
				+ ",\n Potencia del motor = " + getPotenciaMotor() + ",\n Modelo = " + getModelo() + ",\n Marca = "
				+ getMarca() + ",\n Velocidad = " + getVelocidad() + ",\n Número de asientos = " + getNumAsientos()
				+ ",\n Ángulo de dirección = " + getAnguloDireccion() + "]";
	}
	
	
	

}
