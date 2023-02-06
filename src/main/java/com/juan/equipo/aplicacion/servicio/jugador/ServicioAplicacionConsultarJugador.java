package com.juan.equipo.aplicacion.servicio.jugador;

import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.modelo.Jugador;
import com.juan.equipo.dominio.puerto.RepositorioJugador;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionConsultarJugador {

    private final RepositorioJugador repositorioJugador;

    public ServicioAplicacionConsultarJugador(RepositorioJugador repositorioJugador) {
        this.repositorioJugador = repositorioJugador;
    }

    public List<Jugador> ejecutar() {
        return this.repositorioJugador.listar();
    }

}
