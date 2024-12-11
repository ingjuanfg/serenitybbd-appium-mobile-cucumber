package com.ingjuanfg.exceptions;

public class CreacionNotaFallidaException extends AssertionError{
    public static final String MENSAJE_ERROR_CREACION_NOTA = "La nota no fue creada con exito";

    public CreacionNotaFallidaException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
