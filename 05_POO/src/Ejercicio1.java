
public class Ejercicio1 {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		c1.matricula = "1111ADD";
		c1.marca = "Mercedes";
		c1.modelo = "Mercedes C-4";
		c1.mantenimiento = "Nuevo";
		
		System.out.println("----COCHE----");
		System.out.println(c1.matricula);
		System.out.println(c1.marca);
		System.out.println(c1.modelo);
		System.out.println(c1.mantenimiento);
		
		
		Coche c2 = new Coche();
		c2.matricula = "8508DXX";
		c2.marca = "Opel";
		c2.modelo = "Zafira 96";
		c2.mantenimiento = "Segunda mano";
		System.out.println("----COCHE----");
		System.out.println(c2.matricula);
		System.out.println(c2.marca);
		System.out.println(c2.modelo);
		System.out.println(c2.mantenimiento);
		
		Coche c3 = new Coche();
		c3.matricula = "6754KFC";
		c3.marca = "Seat";
		c3.modelo = "Le�n";
		c3.mantenimiento = "Segunda mano";
		System.out.println("----COCHE----");
		System.out.println(c3.matricula);
		System.out.println(c3.marca);
		System.out.println(c3.modelo);
		System.out.println(c3.mantenimiento);
		
		c1 = c2 ;
		c1.marca = "Kia";
		System.out.println("----COCHE----");
		System.out.println(c1.matricula);
		System.out.println(c1.marca);
		System.out.println(c1.modelo);
		System.out.println(c1.mantenimiento);
		
		
		

	}
    
}