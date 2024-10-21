package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private String origen;
	private String destino;
	private Date salida;
	private Date llegada;
	public Avion avion;
	public ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	public ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();

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
		throw new UnsupportedOperationException();
	}

	public void setllegada(Date llegada) {
		throw new UnsupportedOperationException();
	}

	public Vuelo(String origen, String destino, Date salida, Date llegada, ArrayList<Pasajero> pasajeros, ArrayList<Piloto> pilotos) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Pasajero> getPasajeros() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Piloto> getPilotos() {
		throw new UnsupportedOperationException();
	}

	public boolean pasajeroUnico(int id) {
		throw new UnsupportedOperationException();
	}

	public boolean pilotoUnico(int id) {
		throw new UnsupportedOperationException();
	}
}