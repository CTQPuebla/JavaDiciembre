import java.util.Scanner;

public class Evalua {
	public static void main (String [] ar) {
		 Scanner teclado = new Scanner(System.in);
		 int cantidadUno, cantidadDos;
		 System.out.println("EVALUACION DE DOS CANTIDADES");
		 System.out.println("Teclea una cifra");
		 cantidadUno = teclado.nextInt();
		 System.out.println("Y ahora la segunda");
		 cantidadDos = teclado.nextInt();
		 
		 if(cantidadUno>cantidadDos)
		 System.out.println("La cifra:"+cantidadUno+" es mas grande que:"+ cantidadDos);
		 else System.out.println("La cifra:"+cantidadDos+" es mas grande que:"+ cantidadUno);
		 if(cantidadUno<cantidadDos)
			 System.out.println("Las cifras son iguales"+cantidadUno+"="+cantidadDos);
		 
		 
	}

}
