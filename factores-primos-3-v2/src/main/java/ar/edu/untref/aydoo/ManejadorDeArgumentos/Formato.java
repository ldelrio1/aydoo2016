package ar.edu.untref.aydoo.ManejadorDeArgumentos;

import ar.edu.untref.aydoo.ManejadorDeArgumentos.ManejadorDeArgumentos;

/**
 * Created by lucas on 11/06/16.
 */
public class Formato extends ManejadorDeArgumentos {

    private ManejadorDeArgumentos manejadorDeArgumentos;
    private String formatoRecibido = "--format=";
    private String formato;

    public Formato(){
        formato = "pretty";
    }

    @Override
    public void checkearArgumento(String arg) {
        if (arg.startsWith(formatoRecibido)){
            formato = arg.substring(9).toLowerCase();
        }
    }

    public String getFormato(){
        return formato;
    }
}
