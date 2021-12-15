package com;
import java.util.*;

public class Ejercicio1 {
	
	public static void main(String[] args ) {
		
		int numero1;
		int numero2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite el primer numero: ");
		numero1 = s.nextInt();
		System.out.println("Digite el segundo numero: ");
		numero2 = s.nextInt();
		
		if(numero1 < numero2) {
			System.out.println(numero1 + " es menor que " + numero2 );
			
		}else if(numero1 > numero2) {
			System.out.println(numero1 +" es mayor que "+ numero2);
		}else {
			System.out.println("Son iguales");
		}
		
		
		
		
	}


}
