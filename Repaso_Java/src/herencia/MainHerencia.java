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
		//System.out.println(a);
		t.abrirCapo();
		t.abrirPuerta();
		
		double precio[] = {0.19 , 0.23}; //array del precio 
		
		Taxi tx = new Taxi("Porche", "P-99", 0, 5, 0, "4875KLT", 4, "Eléctrico", 888, false, "765423RTY",precio );
        
		//tx.metodoCobrar(20, 18);
		System.out.println(tx.metodoCobrar(20, 18));
		System.out.println(tx);
	}

}
