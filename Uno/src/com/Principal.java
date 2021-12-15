package com;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		//Tipos de datos 
		//Estructuras de control
		//Ciclicas
		//Arrays 1, y 2 dimensiones
		//Java RW (lectura y escritura de archivos)
		
		byte i = -128;
		short s ;//= -3276;
		int x = 10;
		long l = 3444;
		float g = 20.2f;
		char c = 'd';
		
		String m = "algo";
		String k;
		//Object es la clase madre de todas las clases
		Object o = m;
		//Scanner s = new Scanner(System.in);
		Integer J = 230;
		int h = J.parseInt("-212");
		float f = J.parseUnsignedInt("10");
		//En java los numeros decimales son doubles por default, se
		//debe asignar f al final para manejarlos como float
		//con numeros sin putno decimal se asignan como enteros por default
		Float d = 3.5f;
		Long r = 3444l;
		System.out.println(f);
		J.toString();
		System.out.println(J.getClass());
		//IF evalua el cumplimiento de una condicion
		//Verdadero-falso
		
		if (d == 3.5) {
			System.out.println(d+2);
		}
		
		//Puede comparar strings char y enteros
		
		switch(x) {
		
		case 1: 
			System.out.println("primera linea");
			System.out.println("segunda linea");
			break;
			
		case 10:
			System.out.println("primera");
			System.out.println("segunda");
			//break;
			
		default:
			System.out.println("lol");
			
		case 11: 
			System.out.println("sigo ejecutando los casos");
		}
		
		String letras = "cambios";
		
	
	}

}
