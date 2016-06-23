package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public class Suscripcion extends Producto{

    protected Frecuencia frecuencia;
    protected Producto productoSuscribible;

    public Suscripcion(Producto unProducto, Frecuencia tipoDeFrecuencia) {
        super.setNombre(unProducto.getNombre());
        super.setPrecio(unProducto.getPrecio());

        validarProducto(unProducto);
        productoSuscribible = unProducto;
        frecuencia = tipoDeFrecuencia;
    }

    protected void validarProducto(Producto unProducto) {
        if (unProducto.esSuscribible() == false){
            throw new ExcepcionDeProductoNoSuscribible();
        }
    }

    public double getPrecio(){
        double precioUnitario = productoSuscribible.getPrecio();
        return  precioUnitario * frecuencia.obtenerCantidadDeDias();
    }
}
