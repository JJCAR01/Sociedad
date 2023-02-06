package com.juan.equipo.dominio.testdatabuilder;

import com.juan.equipo.dominio.modelo.Equipo;

public class EquipoTestDataBuilder {

    private Integer id;
    private String nombre;

    public EquipoTestDataBuilder(Integer id, String nombre) {
        this.id = 1;
        this.nombre = "Juan";
    }

    public EquipoTestDataBuilder conId(String nombre) {
        this.id = id;
        return this;
    }

    public EquipoTestDataBuilder conNombre(String apellido) {
        this.nombre = nombre;
        return this;
    }

    public Equipo build() {
        return Equipo.of(id, nombre);
    }


}
