package ar.edu.untref.aydoo.ManejadorDeArgumentos;

/**
 * Created by lucas on 11/06/16.
 */
public abstract class ManejadorDeArgumentos {

    protected ManejadorDeArgumentos siguienteManejadorDeArgumentos;

    public ManejadorDeArgumentos getSiguiente() {
        return this.siguienteManejadorDeArgumentos;
    }
    public void setSiguiente(ManejadorDeArgumentos a) {
        this.siguienteManejadorDeArgumentos = a;
    }
    public abstract void checkearArgumento(String unArgumento);

    public String getNumero(){ return getNumero(); }
    public String getOrden(){
        return getOrden();
    }
    public String getFormato(){
        return getFormato();
    }

}
