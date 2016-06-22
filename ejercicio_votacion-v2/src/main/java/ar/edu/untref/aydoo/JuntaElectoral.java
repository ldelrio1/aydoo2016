package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by lucas on 22/06/16.
 */
public class JuntaElectoral {

    private LinkedList <Candidato> listaDeCandidatos;
    private LinkedList <Voto> listaDeVotos;
    private LinkedList <Partido> listaDePartidos;

    public JuntaElectoral(){
        listaDeCandidatos = new LinkedList<>();
        listaDeVotos = new LinkedList<>();
        listaDePartidos = new LinkedList<>();
    }

    public void agregarCandidato(Candidato unCandidato) {
        listaDeCandidatos.add(unCandidato);
        if (!listaDePartidos.contains(unCandidato.getPartido())){
            listaDePartidos.add(unCandidato.getPartido());
        }
    }

    public Partido obtenerPartidoMasVotadoEnProvincia(Provincia unaProvincia) {

        int mayorCantidadDeVotos = 0;
        int cantidadDeVotosActual = 0;
        Partido partidoMasVotado = null;

        for (int j = 0; j < listaDePartidos.size(); j++){

            if(unaProvincia.obtenerVotosDePartidos().containsKey(listaDePartidos.get(j))){
                cantidadDeVotosActual = unaProvincia.obtenerVotosDePartidos().get(listaDePartidos.get(j));

                if (cantidadDeVotosActual > mayorCantidadDeVotos){
                    mayorCantidadDeVotos = cantidadDeVotosActual;
                    partidoMasVotado = listaDePartidos.get(j);
                }
            }

        }
        return partidoMasVotado;
    }
/*
    public Candidato obtenerCandidatoMasVotado(){

    }*/

}
