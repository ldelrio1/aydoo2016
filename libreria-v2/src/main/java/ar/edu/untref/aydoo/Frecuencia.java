package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public enum Frecuencia {

    DIARIA(30),
    SEMANAL(4),
    QUINCENAL(2),
    MENSUAL(1);

    private int cantidadDeDias;

    private Frecuencia(int diasAlMes){
        cantidadDeDias = diasAlMes;
    }

    public int obtenerCantidadDeDias(){
        return cantidadDeDias;
    }
}
