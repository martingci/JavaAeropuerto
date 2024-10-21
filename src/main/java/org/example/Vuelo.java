package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private String origen;
	private String destino;
	private Date salida;
	private Date llegada;
	public Avion avion;
	public ArrayList<Piloto> pilotos;
	public ArrayList<Pasajero> pasajeros;

	public Vuelo(String origen, String destino, Date salida, Date llegada) {
		this.origen = origen;
		this.destino = destino;
		this.salida = salida;
		this.llegada = llegada;
		this.pasajeros = pasajeros;
		this.pilotos = pilotos;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getSalida() {
		return this.salida;
	}

	public void setSalida(Date salida) {
		this.salida = salida;
	}

	public Date getllegada() {
		return this.llegada;
	}

	public void setllegada(Date llegada) {
		this.llegada = llegada;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return this.pasajeros;
	}

	public ArrayList<Piloto> getPilotos() {
		return this.pilotos;
	}

	public boolean pasajeroUnico(int id) {
		for (Pasajero pasajero : pasajeros) {
			if (pasajero.pasaporte.getId() == id) {
				return false;
			}
		}
		return true;
	}

	public boolean pilotoUnico(int id) {
		for (Piloto piloto : pilotos) {
			if (piloto.pasaporte.getId() == id) {
				return false;
			}
		}
		return true;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
}