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

    public void contarVoto(Candidato candidato){

        listaDeVotos.add(candidato);
    }

    public LinkedList<Candidato> obtenerVotos(){
        return listaDeVotos;

    }

    public Map<Candidato, Integer> obtenerVotosDeCandidatos(){

        Map<Candidato, Integer> votosDeCantidatos = new HashMap<>();;

        for(Candidato candidatoActual : listaDeVotos){
            if(!votosDeCantidatos.containsKey(candidatoActual)){
                votosDeCantidatos.put(candidatoActual, 0);
            }
            else {
                int cantidadDeVotos = votosDeCantidatos.get(candidatoActual);
                votosDeCantidatos.put(candidatoActual, cantidadDeVotos++);
            }

        }
        return votosDeCantidatos;
    }

    public Map<Partido, Integer> obtenerVotosDePartidos(){

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
