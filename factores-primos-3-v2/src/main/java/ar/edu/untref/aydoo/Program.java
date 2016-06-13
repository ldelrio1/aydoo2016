package ar.edu.untref.aydoo;

/**
 * Created by lucas on 10/06/16.
 */
public class Program {

    public static final void main(String args[]) throws ExcepcionIngresoInvalido {

        AnalizadorDeArgumentos analizador = new AnalizadorDeArgumentos();

        analizador.analizarArgumentos(args);

        CalculadorDeFactoresPrimos calculador = new CalculadorDeFactoresPrimos();
        calculador.calcularFactoresPrimos(analizador.getNumero());

    }

}
