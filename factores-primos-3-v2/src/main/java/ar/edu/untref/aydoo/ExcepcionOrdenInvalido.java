package ar.edu.untref.aydoo;

/**
 * Created by lucas on 13/06/16.
 */
public class ExcepcionOrdenInvalido extends RuntimeException{

    private final static String mensajeNumeroNegativo = "\n Orden no aceptado \n Las opciones posibles son asc o des";

    public ExcepcionOrdenInvalido(){
        super(mensajeNumeroNegativo);
    }
}
