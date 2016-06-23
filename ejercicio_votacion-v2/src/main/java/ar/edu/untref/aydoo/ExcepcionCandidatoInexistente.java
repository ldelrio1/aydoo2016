package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public class ExcepcionCandidatoInexistente extends RuntimeException {

    private final static String mensajeCandidatoInexistente = "El candidato ingresado no existe";
    public ExcepcionCandidatoInexistente(){
        super(mensajeCandidatoInexistente);
    }
}
