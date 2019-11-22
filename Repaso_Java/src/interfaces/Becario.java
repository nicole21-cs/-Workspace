package interfaces;

public class Becario extends Empleado2{
    public void fichar(int hora) {
    	if(hora>8) {
    		System.out.println("Amonestar becario");
    	}else {
    		System.out.println("Fichaje correcto. Entra a las :" + hora);
    	}
    }
    
    public boolean descansar(int minutos) {
    	if(minutos<=15) {
    		return true;
    	}else {
    		return false;
    	}
    }
}
