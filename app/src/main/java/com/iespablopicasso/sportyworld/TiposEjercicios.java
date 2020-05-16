package com.iespablopicasso.sportyworld;

import java.util.ArrayList;

public class TiposEjercicios {
	
	//ESTADO
	
	//Lista de ejercicios disponibles
	protected ArrayList<Ejercicio> listaEjercicios;
	
	

	//Comportamiento
	
	
	//Constructor
	public TiposEjercicios() {
		listaEjercicios = new ArrayList();
	}
	
	//Añadir un ejercicio
	public void addEjercicio(Ejercicio nuevoE) {
		listaEjercicios.add(nuevoE);
	}
	
	//¿Cuántos hay?
	public int size() {
		return listaEjercicios.size();
	}
	
	//Dar el ejercicio de la posición i
	public Ejercicio getEjercicioByIndex(int index) {
		return listaEjercicios.get(index);
	}
	
	public Ejercicio getEjercicioByDescripcion(String descr) {
		Ejercicio ejer = null;
		
		int i = 0;
		
		
		while (ejer==null && i<listaEjercicios.size()) {
		    if (listaEjercicios.get(i).getDescripcion().equals(descr)) {
		    	ejer = listaEjercicios.get(i);
		    } else
		    	i++;
		}
		
		
		return ejer;
		
	}
	
}
