package empleados;

public class JefeProyecto extends Empleado {
    private double bonificaciones;

	public double getBonificaciones() {
		return bonificaciones;
	}

	public void setBonificaciones(double bonificaciones) {
		this.bonificaciones = bonificaciones;
	}

	@Override
	public double calcularSalario() {
		double salarioTotal = getSalarioBase() + getBonificaciones();
		return salarioTotal;
	}
    
	
}
