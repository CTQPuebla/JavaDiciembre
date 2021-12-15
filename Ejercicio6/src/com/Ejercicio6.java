package com;
import java.util.*;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		int edad;
		int nota;
		String sexo;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite su sexo (M ó F):");
		sexo = s.nextLine();
		System.out.println("Digite su edad: ");
		edad = s.nextInt(); 
		System.out.println("Digitge su nota del 0 al 10:");
		nota = s.nextInt();
		
		if((sexo.equals("M")) && (nota >=5) && (edad>= 18) ) {
			System.out.println("ES POSIBLE");
		}else if((nota >=5) && (edad>= 18) && (sexo.equals("F"))) {
			System.out.println("ES ACEPTADA");
		}else{
			System.out.println("no aceptado");
		}
		
	}

}
