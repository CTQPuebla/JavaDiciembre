import java.util.Scanner;
public class Expopnente {
	public static void main (String []ar) {
		Scanner read = new Scanner(System.in);
		double  indice,potencia; 
		System.out.println("POTENCIA");
		System.out.println("introduce los datos que te pedire seguido de un enter: un indice");
		indice = read.nextDouble();
		System.out.println("potencia");
		potencia = read.nextDouble();
		double total = Math.pow(indice, potencia);
				System.out.println("este es el resultado:"+total);
	}

}
