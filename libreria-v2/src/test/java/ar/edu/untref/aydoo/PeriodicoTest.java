package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.time.Period;

/**
 * Created by lucas on 23/06/16.
 */
public class PeriodicoTest {

    @Test
    public void creaPeriodicoVerificaNombre(){

        Periodico clarin = new Periodico("Clarín", 18);

        Assert.assertEquals( 18, clarin.getPrecio(),0.01);
    }

    @Test
    public void creaPeriodicoVerificaPrecio(){

        Periodico laNacion = new Periodico("La Nación", 15);

        Assert.assertEquals( 15, laNacion.getPrecio(),0.01);
    }

    @Test
    public void creaPeriodicoVerificaNombreLuegoDeCambiarlo(){

        Periodico tiempoArgentino = new Periodico("Tiempo Arg", 12);
        tiempoArgentino.setNombre("Tiempo Argentino");

        Assert.assertEquals( "Tiempo Argentino", tiempoArgentino.getNombre());
    }

    @Test
    public void verificaSuscribible(){

        Periodico laNacion = new Periodico("La Nación", 15);

        Assert.assertTrue(laNacion.esSuscribible());
    }
}

