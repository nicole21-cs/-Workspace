package ejercicio;

public class Habitacion {
    private String tipoHabitacion;
    private double metrosCuadrados;
    
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}
	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	
	@Override
	public String toString() {
		return "Habitacion [tipoHabitacion=" + tipoHabitacion + ", metrosCuadrados=" + metrosCuadrados + "]";
	}
    
    
}