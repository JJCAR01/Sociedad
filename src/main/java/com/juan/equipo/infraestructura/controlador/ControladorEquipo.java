package com.juan.equipo.infraestructura.controlador;

import com.juan.equipo.aplicacion.dto.DtoEquipo;
import com.juan.equipo.aplicacion.dto.DtoRespuesta;
import com.juan.equipo.aplicacion.servicio.equipo.ServicioAplicacionConsultarEquipo;
import com.juan.equipo.aplicacion.servicio.equipo.ServicioAplicacionGuardarEquipo;
import com.juan.equipo.dominio.modelo.Equipo;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/equipos")
public class ControladorEquipo {

    private final ServicioAplicacionGuardarEquipo servicioAplicacionGuardarEquipo;
    private final ServicioAplicacionConsultarEquipo servicioAplicacionConsultarEquipo;

    @GetMapping("/todos")
    public ResponseEntity<List<Equipo>> consultar(){
        return new ResponseEntity<>(servicioAplicacionConsultarEquipo.ejecutar(), HttpStatus.OK);
    }

    @PostMapping("/guardar")
    public ResponseEntity<DtoRespuesta> guardar(@RequestBody DtoEquipo dto) {
        return new ResponseEntity<>(this.servicioAplicacionGuardarEquipo.ejecutar(dto),HttpStatus.OK);
    }

}
