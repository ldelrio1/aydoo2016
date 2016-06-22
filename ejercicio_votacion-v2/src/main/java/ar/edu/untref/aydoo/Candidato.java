package ar.edu.untref.aydoo;

/**
 * Created by lucas on 22/06/16.
 */
public class Candidato {

    private Partido partido;
    public Candidato(String nombre, Partido partidoCandidato) {
        partido = partidoCandidato;

    }

    public Partido getPartido(){
        return partido;
    }
}
