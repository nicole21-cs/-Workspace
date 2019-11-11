package creacionAvion;

public class Maleta {
      private String tipoMaleta;
      private double peso;
      
	public String getTipoMaleta() {
		return tipoMaleta;
	}
	public void setTipoMaleta(String tipoMaleta) {
		this.tipoMaleta = tipoMaleta;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Maleta [tipoMaleta=" + tipoMaleta + ", peso=" + peso + "]";
	}
	
      
}

