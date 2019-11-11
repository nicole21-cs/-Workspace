package creacionAvion;

import java.util.ArrayList;

public class Pasajero {
     private String nombre;
     private String dni;
     private String telefono;
     private ArrayList<Maleta> listaMaletas;
     
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public ArrayList<Maleta> getListaMaletas() {
		return listaMaletas;
	}
	public void setListaMaletas(ArrayList<Maleta> listaMaletas) {
		this.listaMaletas = listaMaletas;
	}
	
	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", listaMaletas="
				+ listaMaletas + "]";
	}
	
     
}
