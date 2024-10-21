package org.example;

import org.junit.jupiter.api.BeforeEach;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AeropuertoTest {

    Aeropuerto aeropuerto = new Aeropuerto("Temuco");
    Vuelo vuelo1 = new Vuelo("Temuco", "Santiago", new Date (2024-1900, 9, 20), new Date(2024-1900, 9, 21));
    Avion avion1 = new Avion("avion1");
    Pasaporte pasaporte1 = new Pasaporte(1, "Chilena", 10, new Date(2024-1900, 9, 20));
    Pasajero pasajero1 = new Pasajero("Martin", "Carrasco", pasaporte1);
    Pasaporte pasaporte2 = new Pasaporte(2, "Chilena", 10, new Date(2024-1900, 9, 30));
    Pasajero pasajero2 = new Pasajero("Juan", "Perez", pasaporte2);
    Pasaporte pasaporte3 = new Pasaporte(3, "Chilena", 10, new Date(2024-1900, 9, 10));
    Piloto piloto1 = new Piloto("David", "Baez", pasaporte3);


    @org.junit.jupiter.api.Test
    void crearVuelo() {
        aeropuerto.registrarAvion(avion1);
        assertTrue(aeropuerto.crearVuelo(vuelo1, avion1));
        assertFalse(aeropuerto.crearVuelo(vuelo1, avion1));
    }

    @org.junit.jupiter.api.Test
    void registrarAvion() {
        Avion avion = new Avion("avion1");
        assertTrue(aeropuerto.registrarAvion(avion));
        assertFalse(aeropuerto.registrarAvion(avion));
    }

    @org.junit.jupiter.api.Test
    void agregarPasajero() {
        aeropuerto.registrarAvion(avion1);
        aeropuerto.crearVuelo(vuelo1, avion1);
        assertFalse(aeropuerto.agregarPasajero(pasajero1, new Date (2024-1900, 9, 20), "Temuco", "Santiago"));
        assertTrue(aeropuerto.agregarPasajero(pasajero2, new Date (2024-1900, 9, 20), "Temuco", "Santiago"));
        aeropuerto.buscarUsuariosdeVuelo(new Date (2024-1900, 9, 20), "Temuco", "Santiago");
    }

    @org.junit.jupiter.api.Test
    void agregarPiloto() {
        aeropuerto.registrarAvion(avion1);
        aeropuerto.crearVuelo(vuelo1, avion1);
        assertFalse(aeropuerto.agregarPiloto(piloto1, new Date (2024-1900, 9, 20), "Temuco", "Santiago"));
    }
}