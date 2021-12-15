package com;
import java.util.*;

public class Ejercicio3 {
	
	public static void main(String[] args) { 
		
		int numero1;
		int numero2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite el primer numero: ");
		numero1 = s.nextInt();
		System.out.println("Digite el segundo numero: ");
		numero2 = s.nextInt();
		
			
		if(numero2 == 0) {
			System.out.println("Error, no puedes dividir entre cero");
		}else {
			double resultado = numero1 / numero2;
			
			System.out.println("La division de estos dos numeros es: "+ resultado);
		}
		
		
	}

}
