package herencia;

public class GeneracionZ extends Milenial {
     private boolean trabajaExtranjero;

	public boolean isTrabajaExtranjero() {
		return trabajaExtranjero;
	}

	public void setTrabajaExtranjero(boolean trabajaExtranjero) {
		this.trabajaExtranjero = trabajaExtranjero;
	}

	@Override
	public String toString() {
		return "GeneracionZ [trabajaExtranjero=" + trabajaExtranjero + ", getPereza()=" + getPereza()
				+ ", isLlevaGorra()=" + isLlevaGorra() + ", getDni()=" + getDni() + ", getPeso()=" + getPeso()
				+ ", getEdad()=" + getEdad() + "]";
	}
     
	
}
