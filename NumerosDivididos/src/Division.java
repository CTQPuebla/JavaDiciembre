import java.util.Scanner;
public class Division {
		public static void main (String [] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("DIVISION");
			System.out.println("teclea una cifra diferente de cero (numerador)");
			int numerador, denominador;
			numerador = entrada.nextInt();
			while(numerador==0) {System.out.println("no uses cero introducelo nuevamente");
			numerador = entrada.nextInt();}
			System.out.println("Teclea una segunda para (deniminador)");
			denominador = entrada.nextInt();
			while(denominador==0) {System.out.println("no uses cero, introducelo nuevamente");
			denominador = entrada.nextInt();}
			double resultado=(float)numerador/denominador;
			System.out.println(numerador+"/"+denominador+"="+resultado);
		}
	}


