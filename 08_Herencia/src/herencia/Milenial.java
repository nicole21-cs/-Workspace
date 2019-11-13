package herencia;

public class Milenial extends Persona { //con "extends" se "invoca" a la herencia
    private int pereza;
    private boolean llevaGorra;
    
	public int getPereza() {
		return pereza;
	}
	public void setPereza(int pereza) {
		this.pereza = pereza;
	}
	public boolean isLlevaGorra() {
		return llevaGorra;
	}
	public void setLlevaGorra(boolean llevaGorra) {
		this.llevaGorra = llevaGorra;
	}
	@Override
	public String toString() {
		return "Milenial [pereza=" + pereza + ", llevaGorra=" + llevaGorra + ", getDni()=" + getDni() + ", getPeso()="
				+ getPeso() + ", getEdad()=" + getEdad() + "]";
	}
	
    
}
