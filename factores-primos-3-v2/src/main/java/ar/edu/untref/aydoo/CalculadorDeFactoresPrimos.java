package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class CalculadorDeFactoresPrimos {

    private LinkedList<Integer> factoresPrimos = new LinkedList<>();
    private String resultado;

    /**
     * Excepcion de Ingreso Invalido puede mejorar
     */
    public void calcularFactoresPrimos(String numero) throws ExcepcionNumeroInvalido {

        int numeroRecibido = 0;
        if(numero != null){
            numeroRecibido = Integer.parseInt(numero);

            if (numeroRecibido > 1) {

                int dividendo = numeroRecibido;
                for (int divisor = 2; divisor < numeroRecibido; divisor++) {

                    while (dividendo % divisor == 0) {
                        dividendo = dividendo / divisor;
                        this.factoresPrimos.add(divisor);

                    }
                }
            }

        }else{
            throw new ExcepcionNumeroInvalido();
        }

    }

    public String getResultadoDeFactoresPrimos(){

        resultado = "";
        for(int i = 0; i < factoresPrimos.size(); i ++){
            resultado = resultado + " " + factoresPrimos.get(i).toString();
        };
        return resultado;
    }


}

