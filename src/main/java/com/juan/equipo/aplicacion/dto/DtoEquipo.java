package com.juan.equipo.aplicacion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DtoEquipo {

    private Integer id;
    private String nombre;
    private List<DtoJugador> jugadores;

}
