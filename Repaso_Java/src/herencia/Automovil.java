package herencia;

public class Automovil extends Vehiculo {
     private String matricula;
     private int numRuedas;
     private String tipoMotor;
     private double potenciaMotor;
     
     

	
	public Automovil(String modelo, String marca, double velocidad, int numAsientos, double anguloDireccion,
			String matricula, int numRuedas , String tipoMotor , double potenciaMotor) {
		super(modelo, marca, velocidad, numAsientos, anguloDireccion);
		this.matricula = matricula;
		this.numRuedas = numRuedas;
		this.tipoMotor = tipoMotor;
		this.potenciaMotor = potenciaMotor;
		
		
	}

     public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	public int getNumRuedas() {
		return numRuedas;
	}




	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}




	public String getTipoMotor() {
		return tipoMotor;
	}




	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}




	public double getPotenciaMotor() {
		return potenciaMotor;
	}




	public void setPotenciaMotor(double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	@Override
	public String toString() {
		return "Automovil [matricula=" + matricula + ", Numero de ruedas=" + numRuedas + ", tipoMotor=" + tipoMotor
				+ ", potenciaMotor=" + potenciaMotor + ", getModelo()=" + getModelo() + ", getMarca()=" + getMarca()
				+ ", getVelocidad()=" + getVelocidad() + ", getNumAsientos()=" + getNumAsientos()
				+ ", getAnguloDireccion()=" + getAnguloDireccion() + "]";
	}

	
	
	
     
}
