package com.juan.equipo.infraestructura.adpatador.repositorio.jpa;

import com.juan.equipo.infraestructura.adpatador.entidades.EntidadEquipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEquipoJpa extends JpaRepository<EntidadEquipo,Integer> {

}
