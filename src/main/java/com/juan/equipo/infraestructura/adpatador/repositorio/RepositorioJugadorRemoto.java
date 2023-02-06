package com.juan.equipo.infraestructura.adpatador.repositorio;

import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.modelo.Jugador;
import com.juan.equipo.dominio.puerto.RepositorioJugador;
import com.juan.equipo.infraestructura.adpatador.entidades.EntidadEquipo;
import com.juan.equipo.infraestructura.adpatador.entidades.EntidadJugador;
import com.juan.equipo.infraestructura.adpatador.repositorio.jpa.RepositorioJugadorJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioJugadorRemoto implements RepositorioJugador {

    private final RepositorioJugadorJpa repositorioJugadorJpa;

    public RepositorioJugadorRemoto(RepositorioJugadorJpa repositorioJugadorJpa) {
        this.repositorioJugadorJpa = repositorioJugadorJpa;
    }

    @Override
    public List<Jugador> listar() {
        List<EntidadJugador> entidades = this.repositorioJugadorJpa.findAll();
        return entidades.stream().map(entidadJugador -> Jugador.of(entidadJugador.getId(),
                entidadJugador.getNombre(),entidadJugador.getEdad(),entidadJugador.getPosicion())).toList();
    }

    @Override
    public int guardar(Jugador jugador) {
        return 0;
    }

    @Override
    public Jugador consultarPorId(int id) {
        return null;
    }

    @Override
    public boolean existe(Jugador jugador) {
        return false;
    }
}
