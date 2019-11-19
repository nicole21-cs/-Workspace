package herencia;

import java.util.ArrayList;
import java.util.Arrays;

public class Taxi extends Turismo {
	private boolean ocupado;
	private String licencia;
	//private ArrayList<Double> precioTarifa; este es dinámiso pero en este caso no se necesita
	private double precio[]; //este es para un array , para tarifia de día/noche, este es un array estático(solo hay 2 elementos)
    //tarifa día---- 0 //noche--- 1 esto son las posiciones en el array
	
	public Taxi(String modelo, String marca, double velocidad, int numAsientos, double anguloDireccion,
			String matricula, int numRuedas, String tipoMotor, double potenciaMotor, int numPuertas, int numVentanas) {
		super(modelo, marca, velocidad, numAsientos, anguloDireccion, matricula, numRuedas, tipoMotor, potenciaMotor,
				numPuertas, numVentanas);
	}
	
	public Taxi(String modelo, String marca, double velocidad, int numAsientos, double anguloDireccion,
			String matricula, int numRuedas, String tipoMotor, double potenciaMotor, boolean ocupado, String licencia,
			double[] precio) {
		super(modelo, marca, velocidad, numAsientos, anguloDireccion, matricula, numRuedas, tipoMotor, potenciaMotor);
		this.ocupado = ocupado;
		this.licencia = licencia;
		this.precio = precio;
	}




	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String getLicencia() {
		return licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public double[] getPrecio() {
		return precio;
	}

	public void setPrecio(double[] precio) {
		this.precio = precio;
	}
	
	public double metodoCobrar(int tiempoViaje , int horaCobro) {
		if(horaCobro > 20 || horaCobro < 6) {
			return tiempoViaje * precio[1]; //tarifa diurna
		}else {
			return tiempoViaje * precio[0]; //tarifa nocturna
		}
		
	}

	@Override
	public String toString() {
		return "Taxi [ocupado=" + ocupado + ", licencia=" + licencia + ", precio=" + Arrays.toString(precio)
				+ ", getNumPuertas()=" + getNumPuertas() + ", getNumVentanas()=" + getNumVentanas()
				+ ", getMatricula()=" + getMatricula() + ", getNumRuedas()=" + getNumRuedas() + ", getTipoMotor()="
				+ getTipoMotor() + ", getPotenciaMotor()=" + getPotenciaMotor() + ", getModelo()=" + getModelo()
				+ ", getMarca()=" + getMarca() + ", getVelocidad()=" + getVelocidad() + ", getNumAsientos()="
				+ getNumAsientos() + ", getAnguloDireccion()=" + getAnguloDireccion() + "]";
	}

	
	
	

	

}
