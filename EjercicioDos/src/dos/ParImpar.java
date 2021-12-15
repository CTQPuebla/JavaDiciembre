package dos;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroUno;
		
		System.out.println("Ingresa primer valor: ");
		numeroUno = scanner.nextInt();
		scanner.close();
		
		if(numeroUno % 2 == 0) {
			System.out.println("El valor es par");
		}
		else {
			System.out.println("El valor es impar");
		}
	}
}
