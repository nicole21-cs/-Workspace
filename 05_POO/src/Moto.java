
public class Moto {
     public String matricula;
     public String marca;
     public int posicion;
     public int velocidad;
     private int velocidadInicial; //se pone private para que nadie la pueda cambiar , esto indica la propia velocidad 
	                               // solo se podria tocar esta velocidad desde la clase no fuera de la clase
     public Moto() { //aqui java te dara por defecto todo
		super();
	}

	public Moto(String matricula, String marca, int posicion, int velocidad) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.posicion = posicion;
		this.velocidad = velocidad;
		this.velocidadInicial = velocidad;
	}

	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", marca=" + marca + ", posicion=" + posicion + ", velocidad="
				+ velocidad + "]";
	}
     
     public int acelerar(boolean adelante) {
    	 if(adelante) {
    	 this.posicion = this.posicion + this.velocidad;
    	 }else {
    		 this.posicion = this.posicion - this.velocidad;
    	 }
    	 return this.posicion;
     }
     
     public void iraPosicionDeSalida() {
    	 this.posicion = 0;
     }
     
     public void meterseEnBoxes() {
    	 this.velocidad = this.velocidadInicial;
     }
     
     public int getVelocidadInicial() { //el get deja ver el valor , ya que el atributo de velocidadInicial
    	                                // lo hemos puesto privado y no dejaba ver nada 
    	                                //con esto hemos permitido que se vea el valor pero que no se modifique la velocidad
    	return this.velocidadInicial;
     }
     /*
     public int acelerarAtras() { asi no se haria , auqnue no estaria mal
    	 this.posicion = this.posicion - this.velocidad;
    	 return this.posicion;
     } */
     
     
}
