package ar.edu.untref.aydoo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CalculadorDeFactoresPrimos {

	private LinkedList<Integer> factoresPrimos = new LinkedList<>();

	public LinkedList<Integer> calcularFactoresPrimos(int numeroRecibido) {

        if (numeroRecibido > 1) {

            int dividendo = numeroRecibido;

            for (int divisor = 2; divisor < numeroRecibido; divisor++) {

                while (dividendo % divisor == 0) {
                    dividendo = dividendo / divisor;
                    this.factoresPrimos.add(divisor);
                }
            }
            return this.factoresPrimos;

        }else{
            throw new ExcepcionNumeroInvalido();
        }
    }

}
