package ar.edu.untref.aydoo;
import ar.edu.untref.aydoo.ManejadorDeArgumentos.Formato;
import ar.edu.untref.aydoo.ManejadorDeArgumentos.ManejadorDeArgumentos;
import ar.edu.untref.aydoo.ManejadorDeArgumentos.Numero;
import ar.edu.untref.aydoo.ManejadorDeArgumentos.Orden;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 13/06/16.
 */
public class IntegracionTest {

    AnalizadorDeArgumentos analizador = new AnalizadorDeArgumentos();
    CalculadorDeFactoresPrimos calculador = new CalculadorDeFactoresPrimos();

    @Test
    public void numeroYOrdenAsc() throws ExcepcionIngresoInvalido {

        String numero = "10";
        String orden = "--sort:asc";
        String [] argumentos = new String[]{numero, orden};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String resultado = calculador.getFactoresPrimos(analizador.getOrden());
        String resultadoEsperado = " 2 5";
        Assert.assertEquals( resultadoEsperado,resultado);
    }

    @Test
    public void numeroYOrdenDes() throws ExcepcionIngresoInvalido {

        String numero = "10";
        String orden = "--sort:des";
        String [] argumentos = new String[]{numero, orden};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String resultado = calculador.getFactoresPrimos(analizador.getOrden());
        String resultadoEsperado = " 5 2";
        Assert.assertEquals( resultadoEsperado,resultado);
    }

    @Test
    public void OrdenDesYNumero() throws ExcepcionIngresoInvalido {

        String numero = "10";
        String orden = "--sort:des";
        String [] argumentos = new String[]{orden, numero};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String resultado = calculador.getFactoresPrimos(analizador.getOrden());
        String resultadoEsperado = " 5 2";
        Assert.assertEquals( resultadoEsperado,resultado);
    }

    @Test
    public void numeroYOrdenEsperaAscDefault() throws ExcepcionIngresoInvalido {

        String numero = "10";
        String [] argumentos = new String[]{numero};
        analizador.analizarArgumentos(argumentos);
        calculador.calcularFactoresPrimos(analizador.getNumero());
        String resultado = calculador.getFactoresPrimos(analizador.getOrden());
        String resultadoEsperado = " 2 5";
        Assert.assertEquals( resultadoEsperado,resultado);
    }

}
