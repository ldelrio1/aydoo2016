package ar.edu.untref.aydoo;

/**
 * Created by lucas on 13/06/16.
 */
public class ExcepcionFormatoInvalido extends RuntimeException {

    private final static String mensajeNumeroNegativo = "\n Formato no aceptado \n Las opciones posibles son pretty o quiet";
    public ExcepcionFormatoInvalido(){
        super(mensajeNumeroNegativo);
    }
}