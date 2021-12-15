package com;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		float x;
		float y;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor a x tipo entero");
		x = scanner.nextInt();
		System.out.println("Ingrese un valor a y tipo entero");
		y = scanner.nextInt();
		
		if(y==0) {
			System.out.println("Valor de 0 no puede ser dividendo");
		}
		else {
			float z;
			z = x /y;
			System.out.println("El resultado es : " + z);
		}
	}

}
