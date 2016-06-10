package ar.edu.untref.aydoo;

/**
 * Created by lucas on 10/06/16.
 */
public class ExcepcionIngresoInvalido extends Exception{

    private final static String mensajeIngresoLetra = "Debe ingresar un numero";

    public ExcepcionIngresoInvalido(){
        super(mensajeIngresoLetra);
    }
}
