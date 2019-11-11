package ejercicio;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		System.out.println("La casa seleccionada es : ");
		Casa c = new Casa();
		c.setPrecio("185.000");
		
		Direccion d1 = new Direccion();
		d1.setTipoVia("Calle");
		d1.setNombreVia("Diamante");
		d1.setNumero("97");
		d1.setCp("28021");
		d1.setCiudad("Madrid");
		
		c.setDireccion(d1);
		
		Persona p = new Persona();
		p.setNombre("Ivan Garc�a");
		p.setEdad("39");
	
		Direccion d2 = new Direccion();
		d2.setTipoVia("Calle");
		d2.setNombreVia("Vital Aza");
		d2.setNumero("15");
		d2.setCp("28017");
		d2.setCiudad("Madrid");
		 
		p.setDireccion(d2);
		
		Habitacion h1 = new Habitacion();
		h1.setTipoHabitacion("Ba�o");
		h1.setMetrosCuadrados(15.5);
		listaHabitaciones.add(h1);
		
		Habitacion h2 = new Habitacion();
		h2.setTipoHabitacion("Habitaci�n principal");
		h2.setMetrosCuadrados(25);
		listaHabitaciones.add(h2);
		
		Habitacion h3 = new Habitacion();
		h3.setTipoHabitacion("Cocina");
		h3.setMetrosCuadrados(20.5);
		listaHabitaciones.add(h3);
		
		c.setDue�o(p);
		c.setListaHabitacion(listaHabitaciones);
		
		/*System.out.println(c.getPrecio());
		System.out.println(c.getDireccion());
		System.out.println(c.getDue�o());
		System.out.println(c.getListaHabitacion()); */
		
		//maneras de cambiar los metros cuadrados
		//1 manera
		h3.setMetrosCuadrados(40);
		 // 2 manera; desde el array
		listaHabitaciones.get(2).setMetrosCuadrados(40); // en get es la posicion del array 
		
		//3 manera
		//c.getListaHabitacion().get(3).setMetrosCuadrados(40);
		
		System.out.println(c);
		
	}

}