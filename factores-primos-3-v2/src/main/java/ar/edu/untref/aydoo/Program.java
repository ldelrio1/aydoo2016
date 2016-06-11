package ar.edu.untref.aydoo;

/**
 * Created by lucas on 10/06/16.
 */
public class Program {

    public static final void main(String args[]) {


        CalculadorDeFactoresPrimos calculador = new CalculadorDeFactoresPrimos();
        System.out.println(calculador.calcularFactoresPrimos(args[0]));

    }

}
