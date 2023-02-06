package com.juan.equipo.aplicacion.servicio;

import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.servicio.equipo.ServicioConsultarEquipo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicioAplicacionConsultarEquipo {

    private final ServicioConsultarEquipo servicioConsultarEquipo;
    public ServicioAplicacionConsultarEquipo(ServicioConsultarEquipo servicioConsultarEquipo) {
        this.servicioConsultarEquipo = servicioConsultarEquipo;
    }

    public List<Equipo> consultar(){
        return this.servicioConsultarEquipo.ejecutar();
    }
}
