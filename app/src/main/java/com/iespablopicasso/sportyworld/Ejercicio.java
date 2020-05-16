package com.iespablopicasso.sportyworld;

public class Ejercicio {
	//ESTADO
	
	protected String descripcion;
	protected float met;
	
	
	//Comportamientos
	
	//Constructor
	public Ejercicio(String serializado) {
		String[] trozos;
		trozos = serializado.split(";");
		descripcion = trozos[0];
		met = Float.parseFloat(trozos[1]);
	}
	
	
	//Calcular KCal
	public String calcularKCal(float minutos, float kgs) {
		return String.valueOf(minutos*kgs*met/60);
	}
	
	public String getDescripcion() {
		return descripcion;
	}



	
	

}
