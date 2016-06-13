package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 13/06/16.
 */
public class AnalizadorDeArgumentosTest {

    AnalizadorDeArgumentos analizador = new AnalizadorDeArgumentos();

    @Test
    public void verificaNumeroEnArgumentos(){
        String numero = "10";
        String [] argumentos = new String[]{numero};
        analizador.analizarArgumentos(argumentos);
        Assert.assertEquals("10",analizador.getNumero());
    }

    @Test
    public void ingresaDosArgumentosVerificaOrden(){
        String numero = "10";
        String orden = "--sort:asc";
        String [] argumentos = new String[]{numero, orden};
        analizador.analizarArgumentos(argumentos);
        String ordenEncontrado = analizador.getOrden();
        Assert.assertEquals("asc", ordenEncontrado);
    }

    @Test
    public void ingresaTodosLosArgumentosVerificaFormato(){
        String numero = "10";
        String orden = "--sort:asc";
        String formato = "--format=pretty";
        String [] argumentos = new String[]{numero, orden, formato};
        analizador.analizarArgumentos(argumentos);
        String formatoEncontrado = analizador.getFormato();
        Assert.assertEquals("pretty", formatoEncontrado);
    }

    @Test
    public void ingresaOrdenYNumeroVerificaOrden(){
        String numero = "10";
        String orden = "--sort:des";
        String [] argumentos = new String[]{orden, numero};
        analizador.analizarArgumentos(argumentos);
        String ordenEncontrado = analizador.getOrden();
        Assert.assertEquals("des", ordenEncontrado);
    }

    @Test
    public void ingresaFormatoOrdenYNumeroVerificaNumero(){
        String numero = "10";
        String orden = "--sort:asc";
        String formato = "--format=pretty";
        String [] argumentos = new String[]{formato, orden, numero};
        analizador.analizarArgumentos(argumentos);
        String numeroEncontrado = analizador.getNumero();
        Assert.assertEquals("10", numeroEncontrado);
    }

    @Test
    public void ingresaTodosLosArgumentosVerificaOrdenMayusculaConAsc(){
        String numero = "10";
        String orden = "--sort:ASC";
        String [] argumentos = new String[]{numero, orden};
        analizador.analizarArgumentos(argumentos);
        String ordenEncontrado = analizador.getOrden();
        Assert.assertEquals("asc", ordenEncontrado);
    }

    @Test
    public void ingresaTodosLosArgumentosVerificaOrdenMayusculaConDes(){
        String numero = "10";
        String orden = "--sort:DES";
        String [] argumentos = new String[]{numero, orden};
        analizador.analizarArgumentos(argumentos);
        String ordenEncontrado = analizador.getOrden();
        Assert.assertEquals("des", ordenEncontrado);
    }

    @Test
    public void ingresaTodosLosArgumentosVerificaFormatoMayusculaConPretty(){
        String numero = "10";
        String orden = "--sort:asc";
        String formato = "--format=PRETTY";
        String [] argumentos = new String[]{numero, orden, formato};
        analizador.analizarArgumentos(argumentos);
        String formatoEncontrado = analizador.getFormato();
        Assert.assertEquals("pretty", formatoEncontrado);
    }

    @Test
    public void ingresaTodosLosArgumentosVerificaFormatoMayusculaConQuiet(){
        String numero = "10";
        String orden = "--sort:asc";
        String formato = "--format=QUIET";
        String [] argumentos = new String[]{numero, orden, formato};
        analizador.analizarArgumentos(argumentos);
        String formatoEncontrado = analizador.getFormato();
        Assert.assertEquals("quiet", formatoEncontrado);
    }
}
