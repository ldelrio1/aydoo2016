package ar.edu.untref.aydoo;

import java.io.IOException;

/**
 * Created by lucas on 14/06/16.
 */
public class Salida {


    public void generarSalida(AnalizadorDeArgumentos analizador, CalculadorDeFactoresPrimos calculador) throws IOException {

        String factoresPrimosOrdenados = calculador.getFactoresPrimos(analizador.getOrden());
        FormatoDeSalida formatoDeSalida = new FormatoDeSalida();

        String salida = formatoDeSalida.salidaConFormato(analizador.getNumero(), factoresPrimosOrdenados, analizador.getFormato());

        if (analizador.getArchivo() == null) {
            System.out.println(salida);
        } else {
            EscrituraEnArchivo escribir = new EscrituraEnArchivo();
            escribir.escribirEnArchivo(analizador.getArchivo(), salida);
        }
    }
}
