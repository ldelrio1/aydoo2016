package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by lucas on 22/06/16.
 */
public class JuntaElectoral {

    private LinkedList <Candidato> listaDeCandidatos;
    private LinkedList <Partido> listaDePartidos;
    private LinkedList <Provincia> listaDeProvincias;

    public JuntaElectoral(){
        listaDeCandidatos = new LinkedList<>();
        listaDePartidos = new LinkedList<>();
        listaDeProvincias = new LinkedList<>();
    }

    public void agregarCandidato(Candidato unCandidato) {
        listaDeCandidatos.add(unCandidato);
        if (!listaDePartidos.contains(unCandidato.getPartido())){
            listaDePartidos.add(unCandidato.getPartido());
        }
    }

    public void agregarProvincia(Provincia unaProvincia){
        listaDeProvincias.add(unaProvincia);
    }

    public Partido obtenerPartidoMasVotadoEnProvincia(Provincia unaProvincia) {

        int mayorCantidadDeVotos = 0;
        int cantidadDeVotosActual;
        Partido partidoMasVotado = null;

        for (int i = 0; i < listaDePartidos.size(); i++){

            if(unaProvincia.obtenerTotalDeVotosDePartidos().containsKey(listaDePartidos.get(i))){
                cantidadDeVotosActual = unaProvincia.obtenerTotalDeVotosDePartidos().get(listaDePartidos.get(i));

                if (cantidadDeVotosActual > mayorCantidadDeVotos){
                    mayorCantidadDeVotos = cantidadDeVotosActual;
                    partidoMasVotado = listaDePartidos.get(i);
                }
            }
        }
        return partidoMasVotado;
    }

    public Candidato obtenerCandidatoMasVotadoEnNacion() {

        int mayorCantidadDeVotos = 0;
        int cantidadDeVotosActual;
        Candidato candidatoMasVotado = null;

        for(int i = 0; i < listaDeCandidatos.size(); i++){

            if(obtenerTotalDeVotosDeCadaCandidatoEnNacion().containsKey(listaDeCandidatos.get(i))) {

                cantidadDeVotosActual = obtenerTotalDeVotosDeCadaCandidatoEnNacion().get(listaDeCandidatos.get(i));
                if (cantidadDeVotosActual > mayorCantidadDeVotos) {
                    mayorCantidadDeVotos = cantidadDeVotosActual;
                    candidatoMasVotado = listaDeCandidatos.get(i);
                }
            }
        }

        return candidatoMasVotado;
    }

    private Map<Candidato,Integer> obtenerTotalDeVotosDeCadaCandidatoEnNacion(){

        Map <Candidato, Integer> votosDeCandidatosEnNacion = new HashMap<>();

        for (int i = 0; i < listaDeCandidatos.size(); i++){

            votosDeCandidatosEnNacion.put(listaDeCandidatos.get(i), 0);

            for(int j = 0; j < listaDeProvincias.size(); j++){

                int votosDeCandidatoEnUnaProvincia = listaDeProvincias.get(j).obtenerTotalDeVotosDeCandidato(listaDeCandidatos.get(i));
                int votosDeCandidatoAcumulados = votosDeCandidatosEnNacion.get(listaDeCandidatos.get(i));
                votosDeCandidatosEnNacion.put(listaDeCandidatos.get(i), votosDeCandidatoAcumulados + votosDeCandidatoEnUnaProvincia);
            }
        }
        return votosDeCandidatosEnNacion;
    }

    public int obtenerCantidadDeVotosDeCandidatoEnNacion(Candidato unCandidato) {

        int cantidadDeVotos;

        if(obtenerTotalDeVotosDeCadaCandidatoEnNacion().containsKey(unCandidato)){
            cantidadDeVotos = obtenerTotalDeVotosDeCadaCandidatoEnNacion().get(unCandidato);
        }else{
            throw new ExcepcionCandidatoInexistente();
        }

        return cantidadDeVotos;
    }
}