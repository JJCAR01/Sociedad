package com.juan.equipo.infraestructura.controlador;

import com.juan.equipo.aplicacion.dto.DtoEquipo;
import com.juan.equipo.aplicacion.dto.DtoJugador;
import com.juan.equipo.aplicacion.dto.DtoRespuesta;
import com.juan.equipo.aplicacion.servicio.equipo.ServicioAplicacionConsultarEquipo;
import com.juan.equipo.aplicacion.servicio.equipo.ServicioAplicacionGuardarEquipo;
import com.juan.equipo.aplicacion.servicio.jugador.ServicioAplicacionConsultarJugador;
import com.juan.equipo.aplicacion.servicio.jugador.ServicioAplicacionGuardarJugador;
import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.modelo.Jugador;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/jugadores")
public class ControladorJugador {

    private final ServicioAplicacionConsultarJugador servicioAplicacionConsultarJugador;
    private final ServicioAplicacionGuardarJugador servicioAplicacionGuardarJugador;

    @GetMapping("/todos")
    public ResponseEntity<List<Jugador>> consultar(){
        return new ResponseEntity<>(servicioAplicacionConsultarJugador.ejecutar(), HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<DtoRespuesta> guardar(@RequestBody DtoJugador dto) {
        return new ResponseEntity<>(this.servicioAplicacionGuardarJugador.ejecutar(dto),HttpStatus.OK);
    }
}
