package inter;

public class TelefonoBasico extends Celular implements AplicacionesBasicas{
	
	public TelefonoBasico() {
		
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
