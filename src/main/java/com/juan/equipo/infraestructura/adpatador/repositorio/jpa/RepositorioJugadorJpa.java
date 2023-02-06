package com.juan.equipo.infraestructura.adpatador.repositorio.jpa;

import com.juan.equipo.dominio.modelo.Jugador;
import com.juan.equipo.infraestructura.adpatador.entidades.EntidadJugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioJugadorJpa extends JpaRepository<EntidadJugador,Integer> {
}
