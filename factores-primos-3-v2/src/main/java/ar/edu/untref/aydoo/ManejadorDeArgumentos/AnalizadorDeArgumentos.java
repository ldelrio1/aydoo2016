package ar.edu.untref.aydoo;
import ar.edu.untref.aydoo.ManejadorDeArgumentos.*;

/**
 * Created by lucas on 11/06/16.
 */
public class AnalizadorDeArgumentos {

    ManejadorDeArgumentos m1;
    ManejadorDeArgumentos m2;
    ManejadorDeArgumentos m3;
    ManejadorDeArgumentos m4;

    public AnalizadorDeArgumentos(){

        m1 = new Numero();
        m2 = new Orden();
        m3 = new Formato();
        m4 = new Archivo();
    }

    public void analizarArgumentos(String[] args) {

        m1.setSiguiente(m2);
        m2.setSiguiente(m3);
        m3.setSiguiente(m4);

        for(int argumento = 0; argumento < args.length; argumento++){
            String argumentoActual = args[argumento];

            m1.checkearArgumento(argumentoActual);
        }
    }

    public String getNumero(){
        return m1.getNumero();
    }

    public String getOrden(){
        return m2.getOrden();
    }

    public String getFormato(){
        return m3.getFormato();
    }

    public String getArchivo(){
        return m4.getArchivo();
    }
}
