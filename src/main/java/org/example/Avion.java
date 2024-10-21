package org.example;
import java.util.ArrayList;

public class Avion {
	private String nombre;
	public Aeropuerto aeropuerto;
	public ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Avion(String nombre, ArrayList<Vuelo> vuelos) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Vuelo> getVuelos() {
		throw new UnsupportedOperationException();
	}
}