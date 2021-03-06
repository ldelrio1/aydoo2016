package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public class ArticuloDeLibreria extends Producto {

    private double iva;

    public ArticuloDeLibreria(String nombre, double precio, int cantidad) {
        super.setNombre(nombre);
        if (cantidad > 0){
            super.setPrecio(precio * cantidad);
        }else {
            throw new ExcepcionCantidadIncorrecta();
        }
        iva = 0.21;
    }

    public void setIva(double ivaIngresado){
        iva = ivaIngresado * 0.01;
    }

    public double getPrecio (){
        double precioDeLista = super.getPrecio();
        double precioFinal = super.getPrecio() + (precioDeLista*iva);
        return precioFinal;
    }
}
