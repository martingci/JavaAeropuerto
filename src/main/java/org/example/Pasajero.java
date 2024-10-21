package org.example;

public class Pasajero {
	private String nombre;
	private String apellido;
	public Pasaporte pasaporte;

	public Pasajero(String nombre, String apellido, Pasaporte pasaporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.pasaporte = pasaporte;
	}

	public Pasaporte getPasaporte() {
		return this.pasaporte;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}