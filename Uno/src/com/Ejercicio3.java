package com;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.print("Teclea un numero entero para comprobar si es par o impar: ");
		Integer a = S.nextInt();
		if(a % 2 == 0)
			System.out.println("El numero es par");
		else 
			System.out.println("el numero es impar");
	
	}

}
