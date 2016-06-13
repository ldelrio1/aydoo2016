package ar.edu.untref.aydoo.ManejadorDeArgumentos;

import ar.edu.untref.aydoo.ManejadorDeArgumentos.ManejadorDeArgumentos;

/**
 * Created by lucas on 11/06/16.
 */
public class Orden extends ManejadorDeArgumentos {

    private final String ordenRecibido = "--sort:";
    private String opcionOrden;
    private ManejadorDeArgumentos manejadorDeArgumentos;


    public Orden(){
        opcionOrden = "asc";

    }

    @Override
    public void checkearArgumento(String arg) {
        if (arg.startsWith(ordenRecibido) && !Character.isDigit(arg.charAt(0))){
            opcionOrden = arg.substring(7).toLowerCase();
        }
        else if(this.getSiguiente()!= null){
            this.getSiguiente().checkearArgumento(arg);
        }
    }

    public String getOrden(){
        return opcionOrden;
    }
}
