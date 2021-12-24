package abstraccion;

public class Principal {

	public static void main(String[] args) {
		Perro p1 = new Perro();
		p1.setNombre("Firulais");
		p1.RealizaSonido();
		
		System.out.println("----------");
		
		Gato g1 = new Gato();
		g1.setNombre("Pelusa");
		g1.RealizaSonido();
	}

}
