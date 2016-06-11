package ar.edu.untref.aydoo;
import java.util.LinkedList;

public class CalculadorDeFactoresPrimos {

    private LinkedList<Integer> factoresPrimos = new LinkedList<>();

    /**
     * Excepcion de Ingreso Invalido puede mejorar
     */
    public LinkedList<Integer> calcularFactoresPrimos(String numero) throws ExcepcionNumeroInvalido {

        int numeroRecibido = 0;
        numeroRecibido = Integer.parseInt(numero);

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

