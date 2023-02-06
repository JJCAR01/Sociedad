package com.juan.equipo.dominio.modelo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.juan.equipo.dominio.testdatabuilder.EquipoTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureMockMvc
class EquipoTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void validarCreacionExitosa() throws Exception {

        //Patron 3a (arrange-act-assert)

        //Preparar todos los datos para aplicar la prueba
        Integer id = 1;
        String nombre = "Juan";
        List<Jugador> jugadores = null;

        //Ejecuta el metodo a probar
        Equipo equipo = new Equipo(id,nombre,jugadores);

        //Se valida el resultado
        Assertions.assertEquals(1,equipo.getId());
        Assertions.assertEquals("Juan",equipo.getNombre());
    }




}