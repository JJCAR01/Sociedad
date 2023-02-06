package com.juan.equipo.aplicacion.servicio.jugador;

import com.juan.equipo.aplicacion.dto.DtoEquipo;
import com.juan.equipo.aplicacion.dto.DtoJugador;
import com.juan.equipo.aplicacion.dto.DtoRespuesta;
import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.modelo.Jugador;
import com.juan.equipo.dominio.servicio.jugador.ServicioGuardarJugador;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarJugador {

    private final ServicioGuardarJugador servicioGuardarJugador;

    public ServicioAplicacionGuardarJugador(ServicioGuardarJugador servicioGuardarJugador) {
        this.servicioGuardarJugador = servicioGuardarJugador;
    }

    public DtoRespuesta ejecutar(DtoJugador dto){
        Jugador jugador = Jugador.of(dto.getId(),dto.getNombre(),dto.getEdad(),dto.getPosicion());
        return new DtoRespuesta<>(servicioGuardarJugador.ejecutar(jugador));
    }
}
