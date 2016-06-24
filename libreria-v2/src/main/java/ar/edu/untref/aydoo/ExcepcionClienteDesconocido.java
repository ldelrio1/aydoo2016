package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public class ExcepcionClienteDesconocido extends RuntimeException {

    private final static String mensajeClienteNoRegistrado = "El Cliente pedido no esta registrado";
    public ExcepcionClienteDesconocido(){
        super(mensajeClienteNoRegistrado);
    }
}
