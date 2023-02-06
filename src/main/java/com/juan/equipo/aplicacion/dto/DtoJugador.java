package com.juan.equipo.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DtoJugador {

    private Integer id;
    private String nombre;
    private Integer edad;
    private String posicion;
}
