package com;
import java.util.Scanner;
public class MayorQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
        
        System.out.println("Introduce un número por favor:  ");
        int numero1 = entrada.nextInt(); 
		
        
        System.out.println("Introduce otro número por favor:  ");
        int numero2 = entrada.nextInt(); 
        
        
				
				if(numero1 > numero2)
				{
					System.out.println("El Número: "+ numero1 +" es el mayor");
				}
				else if (numero1 == numero2)
				{
					System.out.println("Los números son iguales");
				}
				else 
					{
					System.out.println("El Número: "+ numero2 +" es el mayor");
					}
				
				
	}

}
