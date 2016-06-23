package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class ArticuloDeLibreriaTest {

    @Test
    public void creaArticuloVerificaNombre(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5, 1);

        Assert.assertEquals( "lapicera Bic" , lapicera.getNombre());
    }

    @Test
    public void creaArticuloVerificaPrecio(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5, 1);

        Assert.assertEquals( 6.05, lapicera.getPrecio(),0.01);
    }

    @Test
    public void creaArticuloVerificaPrecioCambiandoIva(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5, 1);
        lapicera.setIva(10);

        Assert.assertEquals( 5.5, lapicera.getPrecio(),0.01);
    }

    @Test
    public void verificaSuscribible(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5, 1);

        Assert.assertFalse(lapicera.esSuscribible());
    }

    @Test
    public void verificaPrecioConVariosArticulos(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5, 3);

        Assert.assertEquals( 18.15, lapicera.getPrecio(),0.01);
    }

    @Test
    public void cantidadDeArticulosCeroEsperaExcepcion(){

        try {
            ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5, 0);
        }catch (ExcepcionCantidadIncorrecta e){
        }
    }


    @Test
    public void cantidadDeArticulosNegativaEsperaExcepcion(){

        try {
            ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5, -3);
        }catch (ExcepcionCantidadIncorrecta e){
        }

    }
}
