package creacionAvion;

public class Asiento {
    private String fila;
    private String posicion;
    private String tipoAsiento;
    private Pasajero pasajero;
    
	public String getFila() {
		return fila;
	}
	public void setFila(String fila) {
		this.fila = fila;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getTipoAsiento() {
		return tipoAsiento;
	}
	public void setTipoAsiento(String tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}
	public Pasajero getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	@Override
	public String toString() {
		return "Asiento [fila=" + fila + ", posicion=" + posicion + ", tipoAsiento=" + tipoAsiento + ", pasajero="
				+ pasajero + "]";
	}
    
	
}
