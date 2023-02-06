package com.juan.equipo.dominio.puerto;

import com.juan.equipo.aplicacion.dto.DtoEquipo;
import com.juan.equipo.dominio.modelo.Equipo;

import java.util.List;

public interface RepositorioEquipo {

    List<Equipo> listar();
    int guardar(Equipo equipo);
    Equipo consultarPorId(int id);
    boolean existe(Equipo equipo);


}
