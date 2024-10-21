package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Aeropuerto {
	private String ubicacion;
	public ArrayList<Avion> aviones = new ArrayList<Avion>();

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void crearVuelo(String origen, String destino, Date horaSalida, Date horaLlegada) {
		throw new UnsupportedOperationException();
	}

	public void registrarAvion(String nombre) {
		throw new UnsupportedOperationException();
	}

	public void buscarVuelosPorHora(Date hora) {
		throw new UnsupportedOperationException();
	}

	public void buscarUsuariosdeVuelo(Date hora, String origen, String destino) {
		throw new UnsupportedOperationException();
	}

	public Aeropuerto(String ubicacion, ArrayList<Avion> aviones) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Avion> getAviones() {
		throw new UnsupportedOperationException();
	}
}