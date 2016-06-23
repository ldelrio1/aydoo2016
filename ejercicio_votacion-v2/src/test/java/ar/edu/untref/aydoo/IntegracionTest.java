package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class IntegracionTest {

    Partido cambiemos = new Partido ("Cambiemos");
    Candidato macri = new Candidato ("Macri", cambiemos);

    Partido frenteParaLaVictoria = new Partido("Frente para la victoria");
    Candidato scioli = new Candidato("Scioli", frenteParaLaVictoria);

    Partido fIT = new Partido("Frente de Izquierda y de los Trabajadores");
    Candidato delCanio = new Candidato("Del Caño", fIT);

    Provincia buenosAires = new Provincia ("Buenos Aires");
    Provincia mendoza = new Provincia("Mendoza");
    Provincia entreRios = new Provincia ("Entre Rios");

    @Test
    public void emisionDeVoto(){

        JuntaElectoral junta = new JuntaElectoral();
        junta.agregarCandidato(macri);
        junta.agregarProvincia(buenosAires);
        Voto unVoto = new Voto(macri, buenosAires);

        int cantidadDeVotos = buenosAires.contarVotos();
        Assert.assertEquals(1, cantidadDeVotos);
    }

    @Test
    public void obtienePartidoMasVotadoEnUnaProvinciaCon1VotoYUnaProvincia(){

        JuntaElectoral junta = new JuntaElectoral();

        junta.agregarCandidato(macri);
        junta.agregarCandidato(scioli);
        Voto unVoto = new Voto(macri, buenosAires);

        Partido partidoResultante;
        partidoResultante = junta.obtenerPartidoMasVotadoEnProvincia(buenosAires);

        Assert.assertEquals(cambiemos, partidoResultante);
    }

    @Test
    public void obtienePartidoMasVotadoEnUnaProvinciaConVariosVotosYUnaProvincia(){

        JuntaElectoral junta = new JuntaElectoral();

        junta.agregarCandidato(macri);
        junta.agregarCandidato(scioli);
        junta.agregarCandidato(delCanio);
        Voto voto1 = new Voto(macri, buenosAires);
        Voto voto2 = new Voto(scioli, buenosAires);
        Voto voto3 = new Voto(delCanio, buenosAires);
        Voto voto4 = new Voto(macri, buenosAires);
        Voto voto5 = new Voto(scioli, buenosAires);
        Voto voto6 = new Voto(scioli, buenosAires);

        Partido partidoResultante;
        partidoResultante = junta.obtenerPartidoMasVotadoEnProvincia(buenosAires);

        Assert.assertEquals(frenteParaLaVictoria, partidoResultante);
    }

    @Test
    public void obtienePartidoMasVotadoEnUnaProvinciaConVariosVotosYVariasProvincias(){

        JuntaElectoral junta = new JuntaElectoral();

        junta.agregarCandidato(macri);
        junta.agregarCandidato(scioli);
        junta.agregarCandidato(delCanio);
        Voto voto1 = new Voto(delCanio, mendoza);
        Voto voto2 = new Voto(macri, buenosAires);
        Voto voto3 = new Voto(scioli, buenosAires);
        Voto voto4 = new Voto(delCanio, mendoza);
        Voto voto5 = new Voto(macri, buenosAires);
        Voto voto6 = new Voto(scioli, buenosAires);
        Voto voto7 = new Voto(delCanio, mendoza);
        Voto voto8 = new Voto(scioli, mendoza);

        Partido partidoResultante;
        partidoResultante = junta.obtenerPartidoMasVotadoEnProvincia(mendoza);

        Assert.assertEquals(fIT, partidoResultante);
    }

    @Test
    public void obtieneCandidatoMasVotadoANivelNacionalConUnaProvinciaIngresadaYUnCandidato(){

        JuntaElectoral junta = new JuntaElectoral();

        junta.agregarCandidato(scioli);
        junta.agregarProvincia(buenosAires);
        Voto voto = new Voto(scioli, buenosAires);

        Candidato candidatoResultante;
        candidatoResultante = junta.obtenerCandidatoMasVotadoEnNacion();

        Assert.assertEquals(scioli, candidatoResultante);
    }

    @Test
    public void obtieneCandidatoMasVotadoANivelNacionalConUnaProvinciaIngresadaYVariosCandidatos(){

        JuntaElectoral junta = new JuntaElectoral();

        junta.agregarCandidato(scioli);
        junta.agregarCandidato(macri);
        junta.agregarCandidato(delCanio);
        junta.agregarProvincia(buenosAires);
        Voto voto1 = new Voto(scioli, buenosAires);
        Voto voto2 = new Voto(macri, buenosAires);
        Voto voto3 = new Voto(scioli, buenosAires);
        Voto voto4 = new Voto(delCanio, buenosAires);

        Candidato candidatoResultante;
        candidatoResultante = junta.obtenerCandidatoMasVotadoEnNacion();

        Assert.assertEquals(scioli, candidatoResultante);
    }

    @Test
    public void obtieneCandidatoMasVotadoANivelNacionalConVariasProvinciasYVariosCandidatos(){

        JuntaElectoral junta = new JuntaElectoral();

        junta.agregarCandidato(scioli);
        junta.agregarCandidato(macri);
        junta.agregarCandidato(delCanio);

        junta.agregarProvincia(buenosAires);
        junta.agregarProvincia(mendoza);
        junta.agregarProvincia(entreRios);

        Voto voto1 = new Voto(scioli, entreRios);
        Voto voto2 = new Voto(macri, buenosAires);
        Voto voto3 = new Voto(scioli, buenosAires);
        Voto voto4 = new Voto(macri, entreRios);
        Voto voto5 = new Voto(macri, buenosAires);
        Voto voto6 = new Voto(scioli, buenosAires);
        Voto voto7 = new Voto(delCanio, mendoza);
        Voto voto8 = new Voto(macri, entreRios);

        Candidato candidatoResultante;
        candidatoResultante = junta.obtenerCandidatoMasVotadoEnNacion();

        Assert.assertEquals(macri, candidatoResultante);
    }

    @Test
    public void obtieneCantidadDeVotosDeUnCandidatoEnNacion(){

        JuntaElectoral junta = new JuntaElectoral();

        junta.agregarCandidato(scioli);
        junta.agregarCandidato(macri);
        junta.agregarCandidato(delCanio);

        junta.agregarProvincia(buenosAires);
        junta.agregarProvincia(mendoza);
        junta.agregarProvincia(entreRios);

        Voto voto1 = new Voto(scioli, entreRios);
        Voto voto2 = new Voto(macri, buenosAires);
        Voto voto3 = new Voto(scioli, buenosAires);
        Voto voto4 = new Voto(macri, entreRios);
        Voto voto5 = new Voto(macri, buenosAires);
        Voto voto6 = new Voto(scioli, buenosAires);
        Voto voto7 = new Voto(scioli, buenosAires);

        int totalDeVotosResultantes = junta.obtenerCantidadDeVotosDeCandidatoEnNacion(scioli);

        Assert.assertEquals(4, totalDeVotosResultantes);

    }

    @Test
    public void obtienerCantidadDeVotosDeUnCandidatoEnNacionDeCandidatoInexistente()throws ExcepcionCandidatoInexistente{

        JuntaElectoral junta = new JuntaElectoral();

        junta.agregarCandidato(scioli);
        junta.agregarCandidato(macri);

        junta.agregarProvincia(buenosAires);
        junta.agregarProvincia(mendoza);
        junta.agregarProvincia(entreRios);

        Voto voto1 = new Voto(scioli, entreRios);
        Voto voto2 = new Voto(macri, buenosAires);
        Voto voto3 = new Voto(scioli, buenosAires);
        Voto voto4 = new Voto(macri, entreRios);
        Voto voto5 = new Voto(macri, buenosAires);
        Voto voto6 = new Voto(scioli, buenosAires);
        Voto voto7 = new Voto(scioli, buenosAires);

        try{
            Assert.assertEquals(2, junta.obtenerCantidadDeVotosDeCandidatoEnNacion(delCanio));
        }
        catch (ExcepcionCandidatoInexistente e){
        }
    }
}
