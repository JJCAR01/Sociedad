package com.juan.equipo.dominio.puerto;

import com.juan.equipo.aplicacion.dto.DtoJugador;
import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.modelo.Jugador;

import java.util.List;

public interface RepositorioJugador {

    List<Jugador> listar();
    int guardar(Jugador jugador);
    Jugador consultarPorId(int id);
    boolean existe(Jugador jugador);

}
