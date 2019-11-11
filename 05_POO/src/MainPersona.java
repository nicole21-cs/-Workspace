
public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Bartolo"; // asi se cambian los valores
		p1.edad = 29;
		p1.peso = 58.5;
		p1.profesion = "Mec�nico";
		// Persona p7 = p1 ; aqu� se "cambia" de referencia y no pierdes al objeto , en
		// este caso a persona
		// Persona p1 = new Persona(); //aqu� se est� creando un nuevo objeto y se
		// perder�a el anterior objeto creado

		System.out.println(p1.nombre);
		System.out.println(p1.edad);
		System.out.println(p1.peso);
		System.out.println(p1.profesion);
		System.out.println(p1); // esto imprime la dirreci�n donde se encunetra el objeto

		Persona p2 = new Persona();
		p2.nombre = "Bud Spencer";
		p2.edad = 78;
		p2.peso = 119;
		p2.profesion = "Actor";

		System.out.println(p2.nombre);
		System.out.println(p2.edad);
		System.out.println(p2.peso);
		System.out.println(p2.profesion);
		System.out.println(p2);

		Persona p3 = p2;
		p3.edad = 55;
		System.out.println(p3.edad);
		System.out.println(p2.edad);

		p1 = p2;
		p1.edad = 77;
		System.out.println(p2.edad);
		System.out.println(p2.nombre);
		System.out.println(p2.peso);
		System.out.println(p2.profesion);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		Persona p4 = new Persona("Eloy", 78, 29);
		System.out.println(p4.nombre);
		System.out.println(p4.peso);
		System.out.println(p4.edad);
	}

}