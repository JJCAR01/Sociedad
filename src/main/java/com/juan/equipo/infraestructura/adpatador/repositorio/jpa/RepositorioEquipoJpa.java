package com.juan.equipo.infraestructura.adpatador.repositorio.jpa;

import com.juan.equipo.infraestructura.adpatador.entidades.EntidadEquipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEquipoJpa extends JpaRepository<EntidadEquipo,Integer> {

}
