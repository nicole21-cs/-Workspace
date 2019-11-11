
public class Coche {
      public String matricula ;
      public String marca;
      public String modelo;
      public String mantenimiento;
      
      public Coche() {
    	  this.matricula = ""; //con esto ya no se pone a null la matricula en caso de no ponerla
      }
 
	public Coche(String matricula, String marca, String modelo, String mantenimiento) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.mantenimiento = mantenimiento;
	}
	public Coche(String matricula) {
		this(); //llama al constructor por defecto, es decir , al de sin parámetros 
		this.matricula = matricula; 
	}
	public Coche(String matricula , String marca) {
		this.matricula = matricula;
		this.marca = marca;
		
	}
	
      
}
