package com.juan.equipo.dominio.servicio.equipo;

import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.puerto.RepositorioEquipo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioConsultarEquipo {

    private final RepositorioEquipo repositorioEquipo;

    public ServicioConsultarEquipo(RepositorioEquipo repositorioEquipo) {
        this.repositorioEquipo = repositorioEquipo;
    }
    public List<Equipo> ejecutar() {
        return this.repositorioEquipo.listar();
    }
}
