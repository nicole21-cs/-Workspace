package interfaces;

public class Jefe2 extends Empleado2{
	public void fichar(int hora) {
		System.out.println("Se ficha a las : " + hora);
	}
	public boolean descansar(int minutos) {
		return true;
	}
}
