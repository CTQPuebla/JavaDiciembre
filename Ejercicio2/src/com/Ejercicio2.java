package com;
import java.util.*;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		int numero;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite un numero: ");
		numero = s.nextInt();
		
		if(numero%2==0) {
			System.out.println("el numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		
	
	}

}
