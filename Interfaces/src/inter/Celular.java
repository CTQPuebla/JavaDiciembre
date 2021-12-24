package inter;

public abstract class Celular {

	String marca, color, modelo;
	int numerotelefono;

	public Celular() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumerotelefono() {
		return numerotelefono;
	}

	public void setNumerotelefono(int numerotelefono) {
		this.numerotelefono = numerotelefono;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", numerotelefono="
				+ numerotelefono + "]";
	}
	
	public abstract String llamar(int numero);
		
	
}
