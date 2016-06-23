package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class RevistaTest {

    @Test
    public void creaRevistaVerificaNombre(){

        Revista elGrafico = new Revista("El Gráfico", 20);

        Assert.assertEquals( "El Gráfico" , elGrafico.getNombre());
    }

    @Test
    public void creaRevistaVerificaPrecio(){

        Revista laNacion = new Revista("La Nación Revista", 30);

        Assert.assertEquals( 30, laNacion.getPrecio(),0.01);
    }

    @Test
    public void creaRevistaVerificaPrecioLuegoDeCambiarlo(){

        Revista laNacion = new Revista("La Nación Revista", 30);
        laNacion.setPrecio(40);

        Assert.assertEquals( 40, laNacion.getPrecio(),0.01);
    }
}
