package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by lucas on 23/06/16.
 */
public class CompraTest {

    @Test
    public void verificaMesDeCompra(){

        Compra compraEnero = new Compra(Mes.ENERO);
        Assert.assertEquals(Mes.ENERO, compraEnero.getMesCompra());
    }

    @Test
    public void verificaMesDeCompraLuegoDeCambiarlo(){

        Compra compraFebrero = new Compra(Mes.ENERO);
        compraFebrero.setMes(Mes.ABRIL);
        Assert.assertEquals(Mes.ABRIL, compraFebrero.getMesCompra());
    }

    @Test
    public void compraDeUnProducto(){

        Compra compraEnero = new Compra(Mes.ENERO);

        Periodico popular = new Periodico("Diario Popular",10);
        compraEnero.agregarProducto(popular);

        Assert.assertEquals(popular, compraEnero.getProductos().get(0));
    }

    @Test
    public void compraMasDeUnProducto(){

        Compra compraEnero = new Compra(Mes.ENERO);

        Periodico popular = new Periodico("Diario Popular",10);
        ArticuloDeLibreria lapiz = new ArticuloDeLibreria("Lápiz", 8,1);
        Libro laCaida = new Libro("La caida", 80);

        compraEnero.agregarProducto(popular);
        compraEnero.agregarProducto(lapiz);
        compraEnero.agregarProducto(laCaida);

        Assert.assertEquals(lapiz, compraEnero.getProductos().get(1));
    }
}
