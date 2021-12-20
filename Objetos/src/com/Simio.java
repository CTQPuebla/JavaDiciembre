package com;

public class Simio extends Animal{
	
	private boolean pelaje;
	
	public Simio(int extremidades, double iq) {
		super(extremidades, iq);
		System.out.println("Tengo "+extremidades+" extremidades");
		System.out.println("Tengo un iq de "+ iq);
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	@Override
	public String toString() {
		return "Simio [pelaje=" + pelaje + ", extremidades=" + extremidades + ", iq=" + iq + "]";
	}

	public boolean getPelaje() {
		return pelaje;
	}
	
	public int getExtremidades() {
		return extremidades;
	}

}
