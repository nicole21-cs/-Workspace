
public class Bucles {

	public static void main(String[] args) {
	  for(int i=0 ; i<=10 ; i++) {
		  System.out.println("El nuemro es:" + i);
	  }
	  
	  int contador=0;
	  while(contador <= 10){ 
          System.out.println("elcontador vale:" + contador);
          contador++;
      }
	  
	  contador=0;
      do{ //de 1 a n veces 
         System.out.println("el contador vale:" + contador);
          contador++;
      }while(contador <=10);
      System.out.println(contador);

	}

}
