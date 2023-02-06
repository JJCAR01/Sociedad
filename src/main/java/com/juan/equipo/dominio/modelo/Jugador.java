package com.juan.equipo.dominio.modelo;

public class Jugador {

    private final Integer id;
    private final String nombre;
    private final Integer edad;
    private final String posicion;

    public Jugador(Integer id, String nombre, Integer edad, String posicion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }
}
