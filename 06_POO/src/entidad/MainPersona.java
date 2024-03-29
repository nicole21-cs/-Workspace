package entidad;

public class MainPersona {

	public static void main(String[] args) {
	     Persona p = new Persona();
	     p.setNombre("Juanchito");
	     p.setEdad(33);
	     p.setPeso(67.8);
	     
	     Direccion d = new Direccion(); 
	     d.setTipoVia("Calle");
	     d.setNombreVia("Serrano");
	     d.setCiudad("Madrid");
	     d.setNumero("56");
	     d.setCp("28067");
	     
	     p.setDireccion(d); //para ponerle a la persona este atributo se hace asi
	     
	     System.out.println(p.getDireccion());
	     System.out.println(d.getCp()); //esto es igual que lo de abajo
	     System.out.println(p.getDireccion().getCp());
	     d.setCp("01000");
	     System.out.println(p.getDireccion().getCp());
	     System.out.println(p);
	}

}
