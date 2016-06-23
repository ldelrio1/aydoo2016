package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class ProvinciaTest {

    Partido cambiemos = new Partido ("Cambiemos");
    Candidato macri = new Candidato ("Macri", cambiemos);

    Partido frenteParaLaVictoria = new Partido("Frente para la victoria");
    Candidato scioli = new Candidato("Scioli", frenteParaLaVictoria);

    Provincia buenosAires = new Provincia ("Buenos Aires");

    @Test
    public void obtieneTotalDeVotosDeUnCandidatoEnProvincia(){

        Voto voto1 = new Voto(scioli, buenosAires);
        Voto voto2 = new Voto(macri, buenosAires);
        Voto voto3 = new Voto(scioli, buenosAires);

        int cantidadDeVotosDeScioli = buenosAires.obtenerTotalDeVotosDeCandidato(scioli);
        Assert.assertEquals(2, cantidadDeVotosDeScioli);
    }

    @Test
    public void obtieneTotalDeVotosEnLaProvincia(){

        Voto voto1 = new Voto(scioli, buenosAires);
        Voto voto2 = new Voto(macri, buenosAires);
        Voto voto3 = new Voto(scioli, buenosAires);

        int cantidadDeVotos = buenosAires.contarVotos();
        Assert.assertEquals(3, cantidadDeVotos);
    }
}
