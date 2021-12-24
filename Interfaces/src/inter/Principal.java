package inter;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Smartphone");
		Smartphone s1 = new Smartphone();
		s1.facebook();
		s1.contactos();
		s1.instagram();
		s1.messenger();
		s1.mensajes();  //El estado de los objetos se ve desde sus atributos, miestras que su comportamiento se ve desde sus metodos
		s1.llamadas();
		s1.llamar(22222222);
		
		System.out.println("--------------");
		System.out.println("Telefono Basico");
		TelefonoBasico t1 = new TelefonoBasico();
		t1.contactos();
		t1.llamadas();
		t1.mensajes();
		t1.llamar(222222222);
	}
}
