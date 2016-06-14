package ar.edu.untref.aydoo.ManejadorDeArgumentos;

import ar.edu.untref.aydoo.Excepciones.ExcepcionArchivoInvalido;

/**
 * Created by lucas on 13/06/16.
 */
public class Archivo extends ManejadorDeArgumentos{

    private ManejadorDeArgumentos manejadorDeArgumentos;
    private final String funcionSalida = "--output-file=";
    private String archivo;

    @Override
    public void checkearArgumento(String arg) {

        String archivoRecibido = null;
        if (arg.startsWith(funcionSalida)){

            archivoRecibido = arg.substring(14);

            if (archivoRecibido.endsWith(".txt")){
                archivo = archivoRecibido;
            }else{
                throw new ExcepcionArchivoInvalido();
            }
        }else if(this.getSiguiente()!= null){
            this.getSiguiente().checkearArgumento(arg);
        }
    }

    public String getArchivo(){
        return archivo;
    }
}
