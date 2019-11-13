package empleados;

import java.util.ArrayList;

public class Director extends Empleado {
	private ArrayList<Empleado> listaEmpleados;
	private static final int BONIFICACION_POR_EMPLEADO = 50; // esto es una constante, nunca cambian su valor por la
																// palabra final

	public ArrayList<Empleado> getListaEmpelados() {
		return listaEmpleados;
	}

	public void setListaEmpelados(ArrayList<Empleado> listaEmpelados) {
		this.listaEmpleados = listaEmpelados;
	}

	@Override
	public double calcularSalario() {
		double salarioTotal = getSalarioBase() + (listaEmpleados.size() * BONIFICACION_POR_EMPLEADO);
		return salarioTotal;
	}

}
