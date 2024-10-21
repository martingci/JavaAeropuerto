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

	public boolean crearVuelo(Vuelo vueloAAgregar, Avion avionAAgregar) {
		for (Avion avion : aviones) {
			if (avion.equals(avionAAgregar)) {
				avion.vuelos.add(vueloAAgregar);
				return true;
			}
		}
		return false;
	}

	public boolean registrarAvion(Avion avionNuevo) {
		for (Avion avionRegistrado : aviones) {
			if (avionRegistrado.equals(avionNuevo)) {
				return false;
			}
		}
		aviones.add(avionNuevo);
		return true;
	}

	public void buscarVuelosPorFecha(Date fecha) {
		for (Avion avion : aviones) {
			for (Vuelo vuelo : avion.vuelos) {
				if (vuelo.getSalida().equals(fecha)) {
					System.out.println();
				}
			}
		}
	}

	public void buscarUsuariosdeVuelo(Date fecha, String origen, String destino) {
		for (Avion avion : aviones) {
			for (Vuelo vuelo : avion.vuelos) {
				if (vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino) && vuelo.getSalida().equals(fecha)) {
					for (Pasajero pasajero : vuelo.getPasajeros()) {
						System.out.println(pasajero.getNombre() + " " + pasajero.getApellido());
					}
				}
			}
		}
	}

	public Aeropuerto(String ubicacion, ArrayList<Avion> aviones) {
		this.ubicacion = ubicacion;
		this.aviones = aviones;
	}

	public ArrayList<Avion> getAviones() {
		return aviones;
	}

	public boolean agregarPasajero (Pasajero pasajero, Date fecha, String origen, String destino) {
		if (pasajero.pasaporte.validarPasaporte()) {
			for (Avion avion : aviones) {
				for (Vuelo vuelo : avion.vuelos) {
					if (vuelo.getSalida().equals(fecha) && vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)) {
						for (Pasajero pasajerosAgregados : vuelo.getPasajeros()) {
							if (pasajerosAgregados.getNombre().equals(pasajero.getNombre())) {
								return false;
							}
						}
						vuelo.pasajeros.add(pasajero);
						return true;
					}
				}
			}
		}
        return false;
    }

	public boolean agregarPiloto (Piloto piloto, Date fecha, String origen, String destino) {
		if (piloto.pasaporte.validarPasaporte()) {
			for (Avion avion : aviones) {
				for (Vuelo vuelo : avion.vuelos) {
					if (vuelo.getSalida().equals(fecha) && vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)) {
						for (Piloto pilotoAgregado : vuelo.getPilotos()) {
							if (pilotoAgregado.getNombre().equals(piloto.getNombre())) {
								return false;
							}
						}
						vuelo.pilotos.add(piloto);
						return true;
					}
				}
			}
		}
		return false;
	}

}