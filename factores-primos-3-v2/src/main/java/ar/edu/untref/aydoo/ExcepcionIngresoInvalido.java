package ar.edu.untref.aydoo;

public class ExcepcionIngresoInvalido extends Exception{

    private final static String mensajeIngresoLetra = "Debe ingresar un numero";

    public ExcepcionIngresoInvalido(){
        super(mensajeIngresoLetra);

    }
}