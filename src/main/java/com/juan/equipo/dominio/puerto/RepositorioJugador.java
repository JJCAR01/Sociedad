package com.juan.equipo.dominio.puerto;

import com.juan.equipo.aplicacion.dto.DtoJugador;

public interface RepositorioJugador {

    int guardar(DtoJugador dtoJugador);
    DtoJugador consultarPorId(int id);
    boolean existe(DtoJugador dtoJugador);
}
