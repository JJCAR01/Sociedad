package com.juan.equipo.dominio.servicio.jugador;

import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.modelo.Jugador;
import com.juan.equipo.dominio.puerto.RepositorioJugador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioConsultarJugador {

    private final RepositorioJugador repositorioJugador;

    public ServicioConsultarJugador(RepositorioJugador repositorioJugador) {
        this.repositorioJugador = repositorioJugador;
    }

    public List<Jugador> ejecutar() {
        return this.repositorioJugador.listar();
    }
}
