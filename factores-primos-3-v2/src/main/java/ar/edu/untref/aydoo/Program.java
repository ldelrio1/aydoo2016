package ar.edu.untref.aydoo;

import ar.edu.untref.aydoo.Excepciones.ExcepcionIngresoInvalido;

import java.io.IOException;

/**
 * Created by lucas on 10/06/16.
 */
public class Program {

    /**
     * Tratar de hacer Refactor
     */
    public static final void main(String args[]) throws ExcepcionIngresoInvalido, IOException {

        AnalizadorDeArgumentos analizador = new AnalizadorDeArgumentos();

        analizador.analizarArgumentos(args);

        CalculadorDeFactoresPrimos calculador = new CalculadorDeFactoresPrimos();
        calculador.calcularFactoresPrimos(analizador.getNumero());

        FormatoDeSalida formatoDeSalida = new FormatoDeSalida();
        String salida = formatoDeSalida.salidaConFormato(analizador.getNumero(),
                calculador.getFactoresPrimos(analizador.getOrden()), analizador.getFormato());

        if (analizador.getArchivo()== null){
            System.out.println(salida);
        }else {
            EscrituraEnArchivo escribir = new EscrituraEnArchivo();
            escribir.escribirEnArchivo(analizador.getArchivo(), salida);
        }
    }

}