public class Metodos {
	
	
	public static void main(String[] ar) {
		String frase = "Hoy es 15 de Diciembre";
		System.out.println(frase + "tiene:");
		String consonante="", vocal="";

		for (int x = 0; x < frase.length(); x++) {
			String letra = Character.toString(frase.charAt(x));			
			if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
				System.out.print(letra);
			else try {Integer.parseInt(letra);}
			catch(Exception ex) {consonante=consonante+letra;System.out.print(consonante);}}
		}
	}

	/*
	 * System.out.println(frase.length()); System.out.println(frase.charAt(21));
	 * System.out.println(frase.substring(4)); System.out.println(frase.substring(5,
	 * 8)); System.out.println(frase.toUpperCase());
	 * System.out.println(frase.toLowerCase()); System.out.println(frase.equals
	 * ("hoy es 15de diciembre"));
	 * System.out.println(frase.equals("Hoy es 15 de Diciembre"));
	 * System.out.println(frase.compareTo("de"));
	 */

	/*
	 * for (int i=0; i<10; i++) { System.out.println("for"+i); }
	 */
	/*
	 * int w=0; while(w<3) { System.out.println("Bec"+w); w++;
	 */
//	int j=1;
//	do
//	{
//		System.out.println("bec" + j);
//		j++;
//	}while(j<8);
//}

