package org.example;
import java.util.Date;

public class Pasaporte {
	private int id;
	private String nacionalidad;
	private int hojasDisponibles;
	private Date vencimiento;
	public Pasajero pasajero;
	public Piloto piloto;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int gethojasDisponibles() {
		throw new UnsupportedOperationException();
	}

	public void sethojasDisponibles(int hojasDisponibles) {
		throw new UnsupportedOperationException();
	}

	public Pasaporte(int id, String nacionalidad, int hojasDisponibles, Date vencimiento) {
		throw new UnsupportedOperationException();
	}

	public Date getVencimiento() {
		return this.vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}
}