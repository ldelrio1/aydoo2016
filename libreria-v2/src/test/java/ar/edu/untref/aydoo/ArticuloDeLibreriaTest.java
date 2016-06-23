package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class ArticuloDeLibreriaTest {

    @Test
    public void creaArticuloVerificaNombre(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5);

        Assert.assertEquals( "lapicera Bic" , lapicera.getNombre());
    }

    @Test
    public void creaArticuloVerificaPrecio(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5);

        Assert.assertEquals( 6.05, lapicera.getPrecio(),0.01);
    }

    @Test
    public void creaArticuloVerificaPrecioCambiandoIva(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5);
        lapicera.setIva(10);

        Assert.assertEquals( 5.5, lapicera.getPrecio(),0.01);
    }

    @Test
    public void verificaSuscribible(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5);

        Assert.assertFalse(lapicera.esSuscribible());
    }
}
