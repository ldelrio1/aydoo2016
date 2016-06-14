package ar.edu.untref.aydoo.ManejadorDeArgumentos;

import ar.edu.untref.aydoo.ExcepcionFormatoInvalido;

/**
 * Created by lucas on 11/06/16.
 */
public class Formato extends ManejadorDeArgumentos {

    private ManejadorDeArgumentos manejadorDeArgumentos;
    private final String funcionFormato = "--format=";
    private String formato;

    public Formato(){
        formato = "pretty";
    }

    @Override
    public void checkearArgumento(String arg) {

        String formatoRecibido = null;
        if (arg.startsWith(funcionFormato)){

            formatoRecibido = arg.substring(9).toLowerCase();

            if (formatoRecibido.equals("pretty")|| formatoRecibido.equals("quiet")){
                formato = formatoRecibido;
            }else{
                throw new ExcepcionFormatoInvalido();
            }
        }else if(this.getSiguiente()!= null){
            this.getSiguiente().checkearArgumento(arg);
        }
    }

    public String getFormato(){
        return formato;
    }
}
