package com;
import java.util.*;
import java.lang.Math;
public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		double numero;
		double exponente;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite un numero");
		numero = s.nextDouble();
		System.out.println("Digite su exponente");
		exponente = s.nextDouble();
		
		if(exponente > 0) {
			double resultado = Math.pow(numero,exponente);
			System.out.println("El resultado es " + resultado);
			
		}else if(exponente  == 0) {
			System.out.println("El resultado es 1");
			
		}else if(exponente < 0){
			System.out.println("El resultado es 1/"+ exponente*-1);
			
		}
		
	}

}
