package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public class SuscripcionAnual extends Producto{

    private Frecuencia frecuencia;
    private Producto productoAnual;

    public SuscripcionAnual(Suscripcion unaSuscripcion) {
        super.setNombre(unaSuscripcion.getNombre());
        super.setPrecio(unaSuscripcion.getPrecio());
        frecuencia = unaSuscripcion.frecuencia;
        productoAnual = unaSuscripcion.productoSuscribible;
    }

    @Override
    public double getPrecio() {

        double precioUnitario = productoAnual.getPrecio();
        double precioUnitarioConDescuento =  precioUnitario - precioUnitario*0.2;
        return precioUnitarioConDescuento * frecuencia.obtenerCantidadDeDias();
    }
}
