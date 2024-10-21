package org.example;

public class Piloto {
	private String nombre;
	private String apellido;
	public Vuelo vuelo;
	public Pasaporte pasaporte;

	public Piloto(String nombre, String apellido, Pasaporte pasaporte) {
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