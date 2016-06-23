package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class SuscripcionTest {

    @Test
    public void suscripcionDiariaDePeriodico(){

        Periodico clarin = new Periodico("Clarín", 18);
        Suscripcion suscripcionClarin = new Suscripcion(clarin, Frecuencia.DIARIA);

        Assert.assertEquals(540, suscripcionClarin.getPrecio(), 0.01);
    }

    @Test
    public void suscripcionDiariaDeRevista(){

        Revista elGrafico = new Revista("El Gráfico", 20);
        Suscripcion suscripcionElGrafico = new Suscripcion(elGrafico, Frecuencia.DIARIA);

        Assert.assertEquals(600, suscripcionElGrafico.getPrecio(), 0.01);
    }

    @Test
    public void suscripcionSemanal(){

        Periodico clarin = new Periodico("Clarín", 15);
        Suscripcion suscripcionClarin = new Suscripcion(clarin, Frecuencia.SEMANAL);

        Assert.assertEquals(60, suscripcionClarin.getPrecio(), 0.01);
    }

    @Test
    public void suscripcionQuincenal(){

        Periodico clarin = new Periodico("Clarín", 15);
        Suscripcion suscripcionClarin = new Suscripcion(clarin, Frecuencia.QUINCENAL);

        Assert.assertEquals(30, suscripcionClarin.getPrecio(), 0.01);
    }

    @Test
    public void suscripcionMensual(){

        Periodico clarin = new Periodico("Clarín", 15);
        Suscripcion suscripcionClarin = new Suscripcion(clarin, Frecuencia.MENSUAL);

        Assert.assertEquals(15, suscripcionClarin.getPrecio(), 0.01);
    }

    @Test
    public void suscripcionDeLibroEsperaExcepcion(){

        Libro elHobbit = new Libro("El Hobbit", 200);
        try {
            Suscripcion suscripcionDeLibro = new Suscripcion(elHobbit, Frecuencia.MENSUAL);
        }catch (ExcepcionDeProductoNoSuscribible e){
        }
    }

    @Test
    public void suscripcionDeArticuloDeLibreriaEsperaExcepcion(){

        ArticuloDeLibreria lapicera = new ArticuloDeLibreria("lapicera Bic", 5, 1);
        try {
            Suscripcion suscripcionDeArticuloDeLibreria = new Suscripcion(lapicera, Frecuencia.MENSUAL);
            Assert.assertEquals(5, suscripcionDeArticuloDeLibreria.getPrecio(), 0.01);
        }catch (ExcepcionDeProductoNoSuscribible e){
        }
    }
}