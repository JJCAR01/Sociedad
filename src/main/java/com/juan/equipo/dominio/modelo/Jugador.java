package com.juan.equipo.dominio.modelo;

import lombok.Getter;

import static com.juan.equipo.dominio.utilidad.validacion.ValidacionCampos.validarObligatorio;
import static com.juan.equipo.dominio.utilidad.validacion.ValidacionCampos.validarObligatorioNumero;

@Getter
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

    public static Jugador of(Integer id, String nombre,Integer edad,String posicion){
        validarObligatorioNumero(id,"La identificacion no puede ser vacia");
        validarObligatorio(nombre,"El nombre debe ser obligario");
        validarObligatorioNumero(edad,"La edad debe ser obligatoria");
        validarObligatorio(posicion,"La posicion debe ser obligatoria");
        return new Jugador(id,nombre,edad,posicion);
    }

}
