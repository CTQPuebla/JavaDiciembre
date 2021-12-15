package uno;
import java.util.Scanner;

public class EjercicioDosNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroUno;
		int numeroDos;
		
		System.out.println("Ingresa primer valor: ");
		numeroUno = scanner.nextInt();
		System.out.println("Ingresa segundo valor: ");
		numeroDos = scanner.nextInt();
		scanner.close();
		
		if(numeroUno>numeroDos) {
			System.out.println("El numero es mayor");
		}
		else if(numeroUno == numeroDos){
			System.out.println("Los numeros son iguales");
		}
		else {
			System.out.println("El numero es menor");
		}
	}
}
