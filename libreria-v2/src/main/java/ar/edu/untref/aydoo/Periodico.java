package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public class Periodico extends Producto {

    public Periodico(String nombre, double precio) {
        super.setNombre(nombre);
        super.setPrecio(precio);
    }

    @Override
    public boolean esSuscribible() {
        return true;
    }
}
