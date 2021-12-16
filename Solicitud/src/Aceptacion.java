import java.util.Scanner;
public class Aceptacion {
	public static void main (String []ar) {
		Scanner lee = new Scanner (System.in);
		int nota,edad;
		String sexo;
		System.out.println("REVISION DE SOLICITUD");
		System.out.println("ingresa tu sexo");
		sexo = lee.nextLine();
		System.out.println("que edad tiene");
		edad = lee.nextInt();
		System.out.println("que nota tuvo");
		nota =lee.nextInt();
		switch (sexo) {
		case "f":  
			if (nota>=5 && edad>=18) System.out.println("Solicitud Aceptada");
			else System.out.println("Solicitud Denegada");
			break;
		case "m": 
			if (nota>=5 && 	edad>=18)  System.out.println("Posible"); 
			else System.out.println("Denegado");
			break;
		case "femenino": 
			if (nota>=5  && edad>=18) System.out.println("Aceptado");
			else System.out.println("Denegado");
			break;
		case "masculino":
			if (nota>=5 && edad>=18)System.out.println("Posible");
			else System.out.println("Denegado");
			break;
		}
	}
}
