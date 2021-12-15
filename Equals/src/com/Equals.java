package com;
import java.util.Scanner;
public class Equals {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("Introduce tu nombre, por favor:  ");
        String nombre = entrada.nextLine();
        

		System.out.println("Vuelve a introducir tu nombre, por favor:  ");
        String nombre2 = entrada.nextLine();
        
        System.out.println(nombre.equals(nombre2));  
        
	}

}
