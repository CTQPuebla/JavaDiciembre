package com;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		int x1, x2;
		int y1, y2;
		int r1, r2;
		double distancia;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de x de la primera circunferencia");
		x1 = scanner.nextInt();
		System.out.println("Ingrese el valor de y de la primera circunferencia");
		y1 = scanner.nextInt();
		System.out.println("Ingrese el valor de r de la primera circunferencia");
		r1= scanner.nextInt();
		System.out.println("Ingrese el valor de x de la segunda circunferencia");
		x2= scanner.nextInt();
		System.out.println("Ingrese el valor de y de la segunda circunferencia");
		y2 = scanner.nextInt();
		System.out.println("Ingrese el valor de r de la segunda circunferencia");
		r2 = scanner.nextInt();
		
		distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		if (distancia == 0) 
		{
		      System.out.println("Concéntricas.");
		} 
		else if (distancia > (r1+r2)) {
		      System.out.println("Exteriores.");
		}
		else if ((distancia > 0) && distancia < Math.abs(r1-r2)) 
		{
		      System.out.println("Interiores.");
		} 
		else if (distancia == (r1+r2)) 
		{
		      System.out.println("Tangentes exteriores.");
		}
		else if (distancia == Math.abs(r1-r2)) 
		{
		      System.out.println("Tangentes interiores.");
		} 
		else if (distancia < (r1+r2) && distancia > Math.abs(r1-r2)) 
		{
		      System.out.println("Secantes.");
		}
	}
}
