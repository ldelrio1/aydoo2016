package ar.edu.untref.aydoo;

import java.util.LinkedList;

public class CalculadorDeFactoresPrimos {

    private LinkedList<Integer> factoresPrimos = new LinkedList<>();
    private String resultado;

    /**
     * Excepcion de Ingreso Invalido puede mejorar
     */
    public void calcularFactoresPrimos(String numero) throws ExcepcionNumeroInvalido, ExcepcionIngresoInvalido {

        int numeroRecibido = 0;

        if(numero != null) {

            numeroRecibido = Integer.parseInt(numero);
            if (numeroRecibido > 1) {

                int dividendo = numeroRecibido;
                for (int divisor = 2; divisor < numeroRecibido; divisor++) {

                    while (dividendo % divisor == 0) {
                        dividendo = dividendo / divisor;
                        this.factoresPrimos.add(divisor);

                    }
                }
            } else {
                throw new ExcepcionNumeroInvalido();
            }
        }else{
            throw new ExcepcionIngresoInvalido();
        }
    }

    public String getResultadoDeFactoresPrimos(){

        resultado = "";
        for(int i = 0; i < factoresPrimos.size(); i ++){
            resultado = resultado + " " + factoresPrimos.get(i).toString();
        };
        return resultado;
    }

    public String getFactoresPrimos(String orden){

        String factoresPrimosOrdenados = null;

        if(orden == "asc"){
            factoresPrimosOrdenados = getResultadoDeFactoresPrimos();
        }else if(orden == "des"){
            factoresPrimosOrdenados = getFactoresPrimosDescandentes();
        }
        return factoresPrimosOrdenados;
    }

    private String getFactoresPrimosDescandentes(){

        String resultado = "";
        for(int i = factoresPrimos.size()-1; i > -1; i --){
            resultado = resultado + " " + factoresPrimos.get(i).toString();
        };
        return resultado;
    }

}

