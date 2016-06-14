package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 13/06/16.
 */
public class FormatoDeSalidaTest {

    FormatoDeSalida formatoSalida = new FormatoDeSalida();

    @Test
    public void salidaConFormatoPretty(){

        String numero = "10";
        String factoresPrimosOrdenados = " 2 5";
        String formato = "pretty";
        String salida = formatoSalida.salidaConFormato(numero, factoresPrimosOrdenados, formato);

        Assert.assertEquals("Factores primos 10: 2 5", salida);
    }

    @Test
    public void salidaConFormatoQuiet(){

        String numero = "10";
        String factoresPrimosOrdenados = " 2 5";
        String formato = "quiet";
        String salida = formatoSalida.salidaConFormato(numero, factoresPrimosOrdenados, formato);

        Assert.assertEquals("\n2\n5", salida);
    }
}
