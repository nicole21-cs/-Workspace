package herencia;

import java.util.ArrayList;

public class MainHerencia {

	public static void main(String[] args) {
		Persona p = new Persona();
		p.setDni("529987654");
		p.setPeso(65.5);
		p.setEdad(40);
		
		Milenial m = new Milenial();
		m.setDni("342689076");
		m.setEdad(30);
		m.setPeso(89);
		m.setLlevaGorra(true);
		m.setPereza(7);
		
		GeneracionZ gz = new GeneracionZ();
		gz.setDni("254789610");
		gz.setEdad(18);
		gz.setPeso(71);
		gz.setLlevaGorra(false);
		gz.setPereza(4);
		gz.setTrabajaExtranjero(true);
		
		//Una referencia padre puede apuntar a cualquiera objeto hijo
		//aunque pueda apuntar a cualquiera de sus hijos, solamente puedo acceder a los métodos y atributos del tipo de la referencia 
		Persona p2 = gz;
		Persona p3 = m;
		
		System.out.println(p2.getDni());
		//System.out.println(p2.getPereza()); esto no se puede ya que persona no tiene el atributo pereza
		
		Persona p4 = new Milenial(); //esto no es funcional
		p4.setPeso(34);
		//p4.setPereza();
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>(); //esto se puede hacer ya que se ha hecho con herencia
		listaPersonas.add(p);
		listaPersonas.add(m);
		listaPersonas.add(gz);
		
		System.out.println(listaPersonas.get(2).getDni());
		
		//si sabemos que un obejto es de un tipo concreto podemos hacer un casting
		//aqui con el casting "decimos" que la referencia Persona(del Array) se cambie a GeneracionZ
		GeneracionZ gz1 = (GeneracionZ)listaPersonas.get(2); 
		System.out.println(gz1.getPereza());
		System.out.println(gz1.isTrabajaExtranjero());
		
		for(Persona p5 : listaPersonas) {
			System.out.println(p5);
		}
		

	}

}
