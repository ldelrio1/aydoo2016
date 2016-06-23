package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class LibroTest {

    @Test
    public void creaLibroVerificaNombre(){

        Libro elSeniorDeLosAnillos = new Libro("El Señor de los Anillos", 170);

        Assert.assertEquals( "El Señor de los Anillos" , elSeniorDeLosAnillos.getNombre());
    }

    @Test
    public void creaLibroVerificaPrecio(){

        Libro elHobbit = new Libro("El Hobbit", 200);

        Assert.assertEquals( 200, elHobbit.getPrecio(),0.01);
    }

    @Test
    public void verificaSuscribible(){

        Libro elHobbit = new Libro("El Hobbit", 200);

        Assert.assertFalse(elHobbit.esSuscribible());
    }
}
