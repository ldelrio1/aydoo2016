package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.Excepciones.ExcepcionArchivoInvalido;
import ar.edu.untref.aydoo.Excepciones.ExcepcionFormatoInvalido;
import ar.edu.untref.aydoo.Excepciones.ExcepcionOrdenInvalido;
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

    @Test
    public void ordenIncorrectoEsperaExcepcion() throws ExcepcionOrdenInvalido {
        String numero = "10";
        String orden = "--sort:as";
        String [] argumentos = new String[]{numero, orden};
        try {
            analizador.analizarArgumentos(argumentos);
        }catch (ExcepcionOrdenInvalido e){

        }
    }

    @Test
    public void formatoIncorrectoEsperaExcepcion() throws ExcepcionFormatoInvalido {
        String numero = "10";
        String formato = "--format=que";
        String [] argumentos = new String[]{numero, formato};

        try{
            analizador.analizarArgumentos(argumentos);
        }catch (ExcepcionFormatoInvalido e){

        }
    }

    @Test
    public void verificaArchivo(){
        String numero = "10";
        String archivo = "--output-file=salida.txt";
        String [] argumentos = new String[]{numero, archivo};
        analizador.analizarArgumentos(argumentos);
        String archivoEncontrado = analizador.getArchivo();
        Assert.assertEquals("salida.txt", archivoEncontrado);
    }

    @Test
    public void verificaArchivoConMasDeUnArgumento(){
        String numero = "10";
        String orden = "--sort:DES";
        String archivo = "--output-file=salida.txt";
        String [] argumentos = new String[]{numero, archivo, orden};
        analizador.analizarArgumentos(argumentos);
        String archivoEncontrado = analizador.getArchivo();
        Assert.assertEquals("salida.txt", archivoEncontrado);
    }

    @Test
    public void verificaUnArchivoIncorrectoEsperaExcepcion() throws ExcepcionArchivoInvalido {
        String numero = "10";
        String archivo = "--output-file=salida.tyc";
        String [] argumentos = new String[]{numero, archivo};
        try{
            analizador.analizarArgumentos(argumentos);
        }catch (ExcepcionArchivoInvalido e){

        }

    }
}