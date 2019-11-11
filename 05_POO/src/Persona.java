//Las clases en Java son moldes para la creaci�n de objetos 
//son planos en los que java se va a basar para la creacion de objetos
public class Persona {
	// Una clase Java en cualquier lenguaje tiene atributos y tiene m�todos
	// Los atributos en Java se suelen poner dentro de la clase y al rpincipio de
	// ella
	// Estos atributos tienen su ciclo de vida hasta que el objeto muera, es decir,
	// cuando ya no tenga referencia
	// creacion de la clase Persona :
	public String nombre;
	public double peso;
	public int edad;
	public String profesion;

	// Este es el constructor por defecto , se llaman igual que la clase
	// Pero podemos tener todos los constructores que queramos
	public Persona() {

	}

	// Constructor con par�metros
	public Persona(String nombre1, double peso1, int edad1) {
		nombre = nombre1;
		peso = peso1;
		edad = edad1;

	}

	// este el constructor con todos los par�metros
	public Persona(String nombre, double peso, int edad, String profesion) {
		super(); // En Java existe la herencia , y esto est� invocando al padre de este objeto
		this.nombre = nombre; // El THIS es una referencia al propio objeto, con esto puedo acceder al
							 // atributo del objeto
		this.peso = peso;
		this.edad = edad;
		this.profesion = profesion;
	}
}
