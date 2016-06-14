package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.Excepciones.ExcepcionIngresoInvalido;

import java.io.IOException;

/**
 * Created by lucas on 10/06/16.
 */
public class Program {

    public static final void main(String args[]) throws ExcepcionIngresoInvalido, IOException {

        AnalizadorDeArgumentos analizador = new AnalizadorDeArgumentos();
        analizador.analizarArgumentos(args);

        CalculadorDeFactoresPrimos calculador = new CalculadorDeFactoresPrimos();
        calculador.calcularFactoresPrimos(analizador.getNumero());

        Salida salida = new Salida();
        salida.generarSalida(analizador, calculador);
    }

}