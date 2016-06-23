package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by lucas on 22/06/16.
 */
public class Provincia {

    private LinkedList<Candidato> listaDeVotos;

    public Provincia (String nombre){

        listaDeVotos = new LinkedList<>();
    }

    public void sumarVoto(Candidato candidato){

        listaDeVotos.add(candidato);
    }

    public int contarVotos(){
        return listaDeVotos.size();

    }

    public int obtenerTotalDeVotosDeCandidato(Candidato unCandidato){

        int votosDeCandidato = 0;

        for (int i = 0; i < listaDeVotos.size(); i++){
            if(listaDeVotos.get(i).equals(unCandidato)){
                votosDeCandidato ++;
            }
        }

        return votosDeCandidato;
    }

    public Map<Partido, Integer> obtenerTotalDeVotosDePartidos(){

        Map<Partido, Integer> votosDePartidos = new HashMap<>();

        for(Candidato candidatoActual : listaDeVotos){
            if(!votosDePartidos.containsKey(candidatoActual.getPartido())) {
                votosDePartidos.put(candidatoActual.getPartido(),1);

            }else{
                int cantidadDeVotos = votosDePartidos.get(candidatoActual.getPartido());
                votosDePartidos.put(candidatoActual.getPartido(), cantidadDeVotos + 1);
            }
        }

        return votosDePartidos;
    }

}
