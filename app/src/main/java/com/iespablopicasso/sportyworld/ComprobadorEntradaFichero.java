package com.iespablopicasso.sportyworld;

// Esta clase cada vez tendrá menos utilidad. De hecho, cuando serialicemos con Serializable, con XML o con JSON
//Dejará de tener utilidad. Por lo que no la necesitaremos a partir de Sporty v4.0

public class ComprobadorEntradaFichero {
	
	//Para testear los ejercicios
	public boolean test(String linea) {
		String[] trozos = linea.split(";");
		
		
		try {
			Float.parseFloat(trozos[1]);
		} catch (Exception e) {
			return false;
		}
		
		
		return (trozos.length == 2);
	}


	//Para testear los usuarios
	public boolean testUsuario(String linea) {
		String[] trozos = linea.split(";");

		return (trozos.length == 6);
	}
}
