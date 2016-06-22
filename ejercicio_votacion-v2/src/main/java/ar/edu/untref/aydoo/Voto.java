package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class Voto {

    public Voto(Candidato candidato, Provincia provincia){

        provincia.contarVoto(candidato);
    }

}
