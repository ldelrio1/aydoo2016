package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public class ExcepcionDeProductoNoSuscribible extends RuntimeException {

    private final static String mensajeNoSuscribible = "El producto ingresado no es suscribible";
    public ExcepcionDeProductoNoSuscribible(){
        super(mensajeNoSuscribible);
    }
}
