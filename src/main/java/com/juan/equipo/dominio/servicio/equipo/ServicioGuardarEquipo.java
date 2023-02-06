package com.juan.equipo.dominio.servicio.equipo;

import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.puerto.RepositorioEquipo;
import org.springframework.stereotype.Service;

@Service
public class ServicioGuardarEquipo {

    private static final String MENSAJE_YA_EXISTE = "Ya existe el equipo con los datos ingresados";

    private final RepositorioEquipo repositorioEquipo;

    public ServicioGuardarEquipo(RepositorioEquipo repositorioEquipo) {
        this.repositorioEquipo = repositorioEquipo;
    }

    public Long ejecutar(Equipo equipo) {

        if(this.repositorioEquipo.existe(equipo)) {
            throw new IllegalStateException(MENSAJE_YA_EXISTE);
        }
        return (long) this.repositorioEquipo.guardar(equipo);
    }

}
