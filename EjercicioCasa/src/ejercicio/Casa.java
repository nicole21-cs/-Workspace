package ejercicio;

import java.util.ArrayList;

public class Casa {
     private String precio;
     private Direccion direccion;
     private ArrayList<Habitacion> listaHabitaciones ;
     private Persona due�o; //poner la � a veces puede dar "problemas" por eso se pone duenio
     
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Habitacion> getListaHabitacion() {
		return listaHabitaciones;
	}
	public void setListaHabitacion(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	public Persona getDue�o() {
		return due�o;
	}
	public void setDue�o(Persona due�o) {
		this.due�o = due�o;
	}
	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", direccion=" + direccion + ", listaHabitaciones=" + listaHabitaciones
				+ ", due�o=" + due�o + "]";
	}
	
	
     
	
     
}
