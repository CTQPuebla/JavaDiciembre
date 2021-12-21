package com;

public class Animal {
	protected int extremidades;
	protected double iq;
	
	public Animal(int extremidades, double iq) {
		this.extremidades = extremidades;
		this.iq = iq;
	}
	
	protected void pensar() {
		System.out.println("Yo pienso instintivamente");
	}
	
	protected void comer() {
	}

	@Override
	public String toString() {
		return "Animal [extremidades=" + extremidades + ", iq=" + iq + "]";
	}
	

}
