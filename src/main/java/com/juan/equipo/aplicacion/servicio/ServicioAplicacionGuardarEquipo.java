package com.juan.equipo.aplicacion.servicio;

import com.juan.equipo.aplicacion.dto.DtoEquipo;
import com.juan.equipo.aplicacion.dto.DtoRespuesta;
import com.juan.equipo.dominio.modelo.Equipo;
import com.juan.equipo.dominio.servicio.equipo.ServicioGuardarEquipo;
import org.springframework.stereotype.Component;

@Component
public class ServicioAplicacionGuardarEquipo {

    private final ServicioGuardarEquipo servicioGuardarEquipo;
    public ServicioAplicacionGuardarEquipo(ServicioGuardarEquipo servicioGuardarEquipo) {
        this.servicioGuardarEquipo = servicioGuardarEquipo;
    }

    public DtoRespuesta ejecutar(DtoEquipo dto){
        Equipo equipo = Equipo.of(dto.getId(),dto.getNombre());
        return new DtoRespuesta<>(servicioGuardarEquipo.ejecutar(equipo));
    }


}
