package ar.edu.untref.aydoo;

/**
 * Created by lucas on 14/06/16.
 */
public class ExcepcionArchivoInvalido extends RuntimeException {

    private final static String mensajeArchivoInvalido = "\n Archivo invalido \n Debe ingresar un archivo con extension .txt";
    public ExcepcionArchivoInvalido(){
        super(mensajeArchivoInvalido);
    }
}
