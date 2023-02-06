package com.juan.equipo.infraestructura.adpatador.entidades;

import com.juan.equipo.dominio.modelo.Jugador;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "equipos")
public class EntidadEquipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<EntidadJugador> jugadores;

}
