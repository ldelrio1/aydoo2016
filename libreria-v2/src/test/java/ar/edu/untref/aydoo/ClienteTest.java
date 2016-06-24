package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class ClienteTest {

    @Test
    public void creaClienteVerificaNombre(){

        Cliente suarez = new Cliente("Carlos","Suarez","Av. Cabildo 2135");
        Assert.assertEquals("Carlos", suarez.getNombreDelCliente());
    }

    @Test
    public void creaClienteVerificaApellido(){

        Cliente suarez = new Cliente("Carlos","Suarez","Av. Cabildo 2135");
        Assert.assertEquals("Suarez", suarez.getApellidoDelCliente());
    }

    @Test
    public void creaClienteVerificaDireccion(){

        Cliente suarez = new Cliente("Carlos","Suarez","Av. Cabildo 2135");
        Assert.assertEquals("Av. Cabildo 2135", suarez.getDireccionDelCliente());
    }

    @Test
    public void agregarCompraEnEnero(){


    }
}
