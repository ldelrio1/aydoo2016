package ar.edu.untref.aydoo.Excepciones;

/**
 * Created by lucas on 10/06/16.
 */
public class ExcepcionNumeroInvalido extends  RuntimeException {

    private final static String mensajeNumeroMenorA1 = "Ingresó un numero invalido \n Ingrese un numero mayor a 1";

    public ExcepcionNumeroInvalido(){
        super(mensajeNumeroMenorA1);
    }

}