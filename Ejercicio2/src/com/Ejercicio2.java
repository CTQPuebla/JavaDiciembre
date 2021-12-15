package com;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		int x;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indica el valor de x");
		x = scanner.nextInt();
		
		if(x % 2 == 0){
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
	}

}
