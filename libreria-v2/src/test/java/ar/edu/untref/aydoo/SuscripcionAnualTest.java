package ar.edu.untref.aydoo;

import gherkin.lexer.Fr;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class SuscripcionAnualTest {

    @Test
    public void suscripcionAnualVerificaDescuento(){

        Periodico clarin = new Periodico("Clarín", 18);

        Suscripcion suscripcionClarin = new Suscripcion(clarin, Frecuencia.MENSUAL);
        SuscripcionAnual suscripcionAnual = new SuscripcionAnual(suscripcionClarin);

        Assert.assertEquals( 14.4 ,suscripcionAnual.getPrecio(),0.01);
    }

}
