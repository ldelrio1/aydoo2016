package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public class ExcepcionCantidadIncorrecta extends RuntimeException {
    private final static String mensajeCantidadIncorrecta = "Cantidad de articulos incorrecta, ingrese una cantidad positiva";
    public ExcepcionCantidadIncorrecta(){
        super(mensajeCantidadIncorrecta);
    }
}
