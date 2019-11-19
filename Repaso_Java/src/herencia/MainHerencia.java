package herencia;

public class MainHerencia {

	public static void main(String[] args) {
		Vehiculo v = new Vehiculo("Hondeo", "Ford", 0, 3, 0);
		System.out.println(v);
		
		Automovil a = new Automovil("Opel","Zafira",55, 5, 0, "5547896",4, "Combustión", 888);
		
		Turismo t = new Turismo("607","Peugot", 0, 6,0, "4782LJY", 4, "Diesel", 160, 5,8);
		t.setVelocidad(100);
		t.setMatricula("7643DRW");
		System.out.println(t);

	}

}
