package org.example;
import java.util.Date;

public class Pasaporte {
	private int id;
	private String nacionalidad;
	private int hojasDisponibles;
	private Date vencimiento;
	public Pasajero pasajero;
	public Piloto piloto;

	public Pasaporte(int id, String nacionalidad, int hojasDisponibles, Date vencimiento) {
		this.id = id;
		this.nacionalidad = nacionalidad;
		this.hojasDisponibles = hojasDisponibles;
		this.vencimiento = vencimiento;
	}

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
		return this.hojasDisponibles;
	}

	public void sethojasDisponibles(int hojasDisponibles) {
		this.hojasDisponibles = hojasDisponibles;
	}

	public Date getVencimiento() {
		return this.vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	public boolean validarPasaporte() {
		Date fechaActual = new Date();
		return (fechaActual.before(this.vencimiento) && (this.hojasDisponibles > 0));
	}

}