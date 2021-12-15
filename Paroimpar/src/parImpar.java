import java.util.Scanner;
public class parImpar {
		public static void main (String [] args) {
			 Scanner entrada = new Scanner(System.in);
			 int cifra;
			 System.out.println("EVALUACION CIFRA PAR O IMPAR");
			 System.out.println("Teclea una cifra");
			 cifra = entrada.nextInt();
			 if (cifra%2==0)System.out.println("es par");
			 else System.out.println("la cifra es impar");
			
			 
		}

	}

