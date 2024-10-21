package org.example;
import java.util.ArrayList;

public class Avion {
	private String nombre;
	public Aeropuerto aeropuerto;
	public ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public Avion(String nombre) {
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Vuelo> getVuelos() {
		return this.vuelos;
	}
}