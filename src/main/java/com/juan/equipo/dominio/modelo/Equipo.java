package com.juan.equipo.dominio.modelo;

import lombok.Getter;

import java.util.List;

@Getter
public class Equipo {

    private final Integer id;
    private  final String nombre;
    private final List<Jugador> jugadores;

    public Equipo(Integer id, String nombre, List<Jugador> jugadores) {
        this.id = id;
        this.nombre = nombre;
        this.jugadores = jugadores;
    }

    public static Equipo of(Integer id, String nombre){
        validarObligatorio(id,"El campo no puede ser vacio");
        validarObligatorio(nombre,"El nombre debe ser obligatorio");
        return new Equipo(id,nombre,null);
    }


    private static void validarObligatorio(Object valor, String mensaje) {
        if (valor == null || valor.equals("")) {
            throw new IllegalArgumentException(mensaje);
        }
    }
}
