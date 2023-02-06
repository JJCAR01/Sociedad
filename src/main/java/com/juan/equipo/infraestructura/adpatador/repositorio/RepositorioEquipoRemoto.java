package com.juan.equipo.infraestructura.adpatador.repositorio;

import com.juan.equipo.aplicacion.dto.DtoEquipo;
import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.puerto.RepositorioEquipo;
import com.juan.equipo.infraestructura.adpatador.entidades.EntidadEquipo;
import com.juan.equipo.infraestructura.adpatador.repositorio.jpa.RepositorioEquipoJpa;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioEquipoRemoto implements RepositorioEquipo {

    private final RepositorioEquipoJpa repositorioEquipoJpa;

    public RepositorioEquipoRemoto(RepositorioEquipoJpa repositorioEquipoJpa) {
        this.repositorioEquipoJpa = repositorioEquipoJpa;
    }

    @Override
    public List<Equipo> listar() {
        List<EntidadEquipo> entidades = this.repositorioEquipoJpa.findAll();
        return entidades.stream().map(entidadEquipo -> Equipo.of(entidadEquipo.getId(),entidadEquipo.getNombre())).toList();
    }

    @Override
    public int guardar(Equipo equipo) {
        EntidadEquipo entidadEquipo = new EntidadEquipo(equipo.getId(),equipo.getNombre());
        return this.repositorioEquipoJpa.save(entidadEquipo).getId();
    }

    @Override
    public Equipo consultarPorId(int id) {
        return null;
    }

    @Override
    public boolean existe(Equipo equipo) {
        return false;
    }

}
