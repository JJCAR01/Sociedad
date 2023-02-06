package com.juan.equipo.aplicacion.servicio.equipo;

import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.puerto.RepositorioEquipo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionConsultarEquipo {

    private final RepositorioEquipo repositorioEquipo;

    public ServicioAplicacionConsultarEquipo(RepositorioEquipo repositorioEquipo) {
        this.repositorioEquipo = repositorioEquipo;
    }

    public List<Equipo> ejecutar() {
        return this.repositorioEquipo.listar();
    }

}
