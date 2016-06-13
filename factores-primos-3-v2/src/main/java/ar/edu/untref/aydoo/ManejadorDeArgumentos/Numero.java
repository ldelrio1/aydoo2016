package ar.edu.untref.aydoo.ManejadorDeArgumentos;

import ar.edu.untref.aydoo.ManejadorDeArgumentos.ManejadorDeArgumentos;

/**
 * Created by lucas on 11/06/16.
 */
public class Numero extends ManejadorDeArgumentos {

    private String numero;

    @Override
    public void checkearArgumento(String numeroArg) {

        if ((numeroArg   != null) && (Character.isDigit(numeroArg.charAt(0)))){
            this.numero = numeroArg;

        }else if(this.getSiguiente()!= null){
            this.getSiguiente().checkearArgumento(numeroArg);
        }
    }

    public String getNumero(){

        return numero;
    }

}
