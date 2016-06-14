package ar.edu.untref.aydoo.ManejadorDeArgumentos;


import ar.edu.untref.aydoo.ExcepcionOrdenInvalido;

/**
 * Created by lucas on 11/06/16.
 */
public class Orden extends ManejadorDeArgumentos {

    private final String funcionOrden = "--sort:";
    private String orden;
    private ManejadorDeArgumentos manejadorDeArgumentos;


    public Orden(){
        orden = "asc";

    }

    @Override
    public void checkearArgumento(String arg) {

        String ordenRecibido = null;
        if (arg.startsWith(funcionOrden)){

            ordenRecibido = arg.substring(7).toLowerCase();

            if (ordenRecibido.equals("asc")|| ordenRecibido.equals("des")){
                orden = ordenRecibido;
            }else{
                throw new ExcepcionOrdenInvalido();
            }
        }
        else if(this.getSiguiente()!= null){
            this.getSiguiente().checkearArgumento(arg);
        }
    }

    public String getOrden(){
        return orden;
    }
}
