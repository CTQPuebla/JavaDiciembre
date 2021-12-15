import java.util.Scanner;
public class Mayusculas {
	public static void main (String [] args) {
		Scanner intro = new Scanner (System.in);
		System.out.println("DISCRIMINACIÓN ENTRE MAYUSCULAS Y MIÚSCULAS");
		System.out.println("Ingrese datos de tipo texto");
		String letra;
		letra = intro.next();
		 for (int i = 0; i < letra.length(); i++) {
			    
	            if(Character.isLowerCase(letra.charAt(i))){   System.out.println("las letras mayusculas son"); 
	            System.out.println(letra.charAt(i));
	            
	            }}}}
