package ar.edu.untref.aydoo;
import ar.edu.untref.aydoo.ManejadorDeArgumentos.Formato;
import ar.edu.untref.aydoo.ManejadorDeArgumentos.ManejadorDeArgumentos;
import ar.edu.untref.aydoo.ManejadorDeArgumentos.Numero;
import ar.edu.untref.aydoo.ManejadorDeArgumentos.Orden;

/**
 * Created by lucas on 11/06/16.
 */
public class AnalizadorDeArgumentos {

    ManejadorDeArgumentos m1;
    ManejadorDeArgumentos m2;
    ManejadorDeArgumentos m3;

    public AnalizadorDeArgumentos(){

        m1 = new Numero();
        m2 = new Orden();
        m3 = new Formato();
    }

    public void analizarArgumentos(String[] args) {

        m1.setSiguiente(m2);
        m2.setSiguiente(m3);

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
}
