package com.juan.equipo.dominio.utilidad.validacion;

public class ValidacionCampos {

    public static void validarObligatorio(String valor, String mensaje)
    {
        if((valor == null) || valor.isEmpty())
        {
            throw new IllegalArgumentException(mensaje);
        }
    }

    public static void validarObligatorioNumero(Integer valor, String mensaje){
        if((valor == null) ||  valor <= 0){
            throw new IllegalArgumentException(mensaje);
        }
    }
}
