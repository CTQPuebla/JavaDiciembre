package inter;

public class Smartphone extends Celular implements AplicacionesBasicas, AplicacionesNuevas {
	
	public Smartphone() {
		
	}
	

	@Override
	public void facebook() {
		System.out.println("Tengo instalado facebook");
		
	}

	@Override
	public void instagram() {
		System.out.println("Tengo instalado instagram");		
	}

	@Override
	public void messenger() {
		System.out.println("Tengo instalado messenger");		
	}

	@Override
	public void contactos() {
		System.out.println("Tengo instalado contactos");		
	}

	@Override
	public void llamadas() {
		System.out.println("Tengo instalado llamadas");		
	}

	@Override
	public void mensajes() {
		System.out.println("Tengo instalado mensajeria de texto");
		
	}


	@Override
	public String llamar(int numero) {
		return "Lllamando";
	}

}
