package com.juan.equipo.infraestructura.adpatador.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "jugadores")
public class EntidadJugador {

    @Id
    private Integer id;
    private String nombre;
    private Integer edad;
    private String posicion;
}
