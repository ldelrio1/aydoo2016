package ar.edu.untref.aydoo;
import ar.edu.untref.aydoo.Excepciones.ExcepcionIngresoInvalido;
import ar.edu.untref.aydoo.AnalizadorDeArgumentos;
import ar.edu.untref.aydoo.Salida.FormatoDeSalida;
import ar.edu.untref.aydoo.CalculadorDeFactoresPrimos;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 13/06/16.
 */
public class IntegracionTest {

    AnalizadorDeArgumentos analizador = new AnalizadorDeArgumentos();
    CalculadorDeFactoresPrimos calculador = new CalculadorDeFactoresPrimos();
    FormatoDeSalida salida = new FormatoDeSalida();
    String numero = "10";

    @Test
    public void noEncuentraNumeroEnArgumentos() throws ExcepcionIngresoInvalido {
        String orden = "--sort:asc";
        String formato = "--format=pretty";
        String [] argumentos = new String[]{orden, formato};
        analizador.analizarArgumentos(argumentos);
        try {
            calculador.calcularFactoresPrimos(analizador.getNumero());
        } catch (ExcepcionIngresoInvalido e) {
        }
    }

    @Test
    public void numeroYOrdenAsc() throws ExcepcionIngresoInvalido {

        String orden = "--sort:asc";
        String [] argumentos = new String[]{numero, orden};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String resultado = calculador.getFactoresPrimos(analizador.getOrden());
        String resultadoEsperado = "2 5 ";
        Assert.assertEquals( resultadoEsperado,resultado);
    }

    @Test
    public void numeroYOrdenDes() throws ExcepcionIngresoInvalido {

        String orden = "--sort:des";
        String [] argumentos = new String[]{numero, orden};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String resultado = calculador.getFactoresPrimos(analizador.getOrden());
        String resultadoEsperado = "5 2 ";
        Assert.assertEquals( resultadoEsperado,resultado);
    }

    @Test
    public void OrdenDesYNumero() throws ExcepcionIngresoInvalido {

        String orden = "--sort:des";
        String [] argumentos = new String[]{orden, numero};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String resultado = calculador.getFactoresPrimos(analizador.getOrden());
        String resultadoEsperado = "5 2 ";
        Assert.assertEquals( resultadoEsperado,resultado);
    }

    @Test
    public void numeroOrdenDesYFormatoPretty() throws ExcepcionIngresoInvalido {

        String orden = "--sort:des";
        String formato = "--format=pretty";
        String [] argumentos = new String[]{numero, orden, formato};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String factoresPrimosOrdenados = calculador.getFactoresPrimos(analizador.getOrden());
        String resultado = salida.salidaConFormato(analizador.getNumero(),factoresPrimosOrdenados, analizador.getFormato());
        String resultadoEsperado = "Factores primos 10: 5 2 ";
        Assert.assertEquals(resultadoEsperado,resultado);
    }


    @Test
    public void numeroOrdenDesYFormatoQuiet() throws ExcepcionIngresoInvalido {

        String orden = "--sort:des";
        String formato = "--format=Quiet";
        String [] argumentos = new String[]{numero, orden, formato};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String factoresPrimosOrdenados = calculador.getFactoresPrimos(analizador.getOrden());
        String resultado = salida.salidaConFormato(analizador.getNumero(),factoresPrimosOrdenados, analizador.getFormato());
        String resultadoEsperado = "5\n2\n";
        Assert.assertEquals(resultadoEsperado,resultado);
    }

    @Test
    public void numeroOrdenAscYFormatoNoEspecificadosEsperaDefault() throws ExcepcionIngresoInvalido {

        String orden = "--sort:asc";
        String [] argumentos = new String[]{numero, orden};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String factoresPrimosOrdenados = calculador.getFactoresPrimos(analizador.getOrden());
        String resultado = salida.salidaConFormato(analizador.getNumero(),factoresPrimosOrdenados, analizador.getFormato());
        String resultadoEsperado = "Factores primos 10: 2 5 ";
        Assert.assertEquals(resultadoEsperado,resultado);
    }

    @Test
    public void numeroOrdenYFormatoNoEspecificadosEsperaDefault() throws ExcepcionIngresoInvalido {

        String [] argumentos = new String[]{numero};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String factoresPrimosOrdenados = calculador.getFactoresPrimos(analizador.getOrden());
        String resultado = salida.salidaConFormato(analizador.getNumero(),factoresPrimosOrdenados, analizador.getFormato());
        String resultadoEsperado = "Factores primos 10: 2 5 ";
        Assert.assertEquals(resultadoEsperado,resultado);
    }

}
