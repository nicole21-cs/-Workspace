package empleados;

import java.util.ArrayList;

public class MainEmpresa {
	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>(); //esta es la lista 
		                                                                //de la empresa 
		Empleado e = new Empleado();
		e.setDni("34567829H");
		e.setNombre("Asterix");
		e.setSalarioBase(600);
		
		Empleado e2 = new Empleado();
		e2.setDni("57893214K");
		e2.setNombre("Obelix");
		e2.setSalarioBase(800);
		
		Empleado e3 = new Empleado();
		e3.setDni("85472301Q");
		e3.setNombre("Panoramix");
		e3.setSalarioBase(1200);
		
		JefeProyecto jp = new JefeProyecto();
		jp.setDni("03687421M");
		jp.setNombre("Abraracurcix");
		jp.setSalarioBase(2000);
		jp.setBonificaciones(300);
		
		JefeProyecto jp2 = new JefeProyecto();
		jp2.setDni("21478962P");
		jp2.setNombre("Arceranceturix");
		jp2.setSalarioBase(2500);
		jp2.setBonificaciones(400);
		
		Director d1 = new Director();
		d1.setDni("47896254B");
		d1.setNombre("Gargamel");
		d1.setSalarioBase(3000);
		
		ArrayList<Empleado> empleadosDirector = new ArrayList<Empleado>(); //esta es la lista
		                                                        //de los empleados del director
		d1.setListaEmpelados(empleadosDirector);
		empleadosDirector.add(e2);
		empleadosDirector.add(jp2);
		empleadosDirector.add(e);
		
		
		listaEmpleados.add(e);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(jp);
		listaEmpleados.add(jp2);
		listaEmpleados.add(d1);
		for(Empleado e1 : listaEmpleados) {
			System.out.println(e1.calcularSalario());
		}
		
		
		
		

	}

}
