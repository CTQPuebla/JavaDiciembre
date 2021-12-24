package abstraccion;

public abstract class Mascota {

	String nombre;

	public Mascota() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + "]";
	}
	
	public abstract void RealizaSonido();
	
}
