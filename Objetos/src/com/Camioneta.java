package com;

public class Camioneta extends Deportivo {
	
	private boolean todoTerreno;
	
	public Camioneta() {
		
	}

	public Camioneta(boolean todoTerreno) {
		super();
		this.todoTerreno = todoTerreno;
	}

	public boolean isTodoTerreno() {
		return todoTerreno;
	}

	public void setTodoTerreno(boolean todoTerreno) {
		this.todoTerreno = todoTerreno;
	}

	@Override
	public String toString() {
		return "Camioneta [todoTerreno=" + todoTerreno + ", torque=" + torque + ", hp=" + hp + ", llantas=" + llantas
				+ ", motor=" + motor + ", largo=" + largo + ", ancho=" + ancho + ", alto=" + alto + ", asientos="
				+ asientos + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", estandar=" + estandar
				+ "]";
	}
	
	
}
