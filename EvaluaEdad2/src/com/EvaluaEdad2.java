package com;
import java.util.Scanner;

public class EvaluaEdad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad:  ");
		
		int edad = entrada.nextInt();
		if(edad < 18) 
		{
			System.out.println("Eres un adolescente");		
        }
		else  if (edad < 40)
		{
			System.out.println("Eres un j�ven");
		}
		else if  (edad < 65)
		{
			System.out.println("Eres maduro");
		}
		else 
		{
			System.out.println("Cu�date");	
		}
	}
}
