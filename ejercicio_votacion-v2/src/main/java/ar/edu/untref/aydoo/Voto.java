package ar.edu.untref.aydoo;

public class Voto {

    public Voto(Candidato candidato, Provincia provincia){

        provincia.sumarVoto(candidato);
    }

}
