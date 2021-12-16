import java.util.Scanner;
public class Promedio {	
	public static void main (String []ar) {
		Scanner recibo = new Scanner(System.in);
		float cifra=0.0f;
		int edad=24, i=1;
		System.out.println("PROMEDIO");
		float promedio=0;
		do {System.out.println("Escribe cifras");
			cifra =cifra+ recibo.nextFloat();
			promedio=cifra/i;
			i++;
			System.out.println("tus numeros sumados dan"+cifra+"\nsu promedio es:"+promedio);}
		while(promedio<edad);}}