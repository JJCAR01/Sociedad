package com.juan.equipo.dominio.servicio.jugador;

import com.juan.equipo.dominio.modelo.Jugador;
import com.juan.equipo.dominio.puerto.RepositorioJugador;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarJugador {

    private static final String MENSAJE_YA_EXISTE = "Ya existe el jugador con los datos ingresados";

    private final RepositorioJugador repositorioJugador;

    public ServicioGuardarJugador(RepositorioJugador repositorioJugador) {
        this.repositorioJugador = repositorioJugador;
    }

    public Long ejecutar(Jugador jugador) {

        if(this.repositorioJugador.existe(jugador)) {
            throw new IllegalStateException(MENSAJE_YA_EXISTE);
        }
        return (long) this.repositorioJugador.guardar(jugador);
    }
}
