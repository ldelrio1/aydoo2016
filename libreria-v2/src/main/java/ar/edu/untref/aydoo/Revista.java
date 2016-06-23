package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public class Revista extends Producto {

    public Revista(String nombre, double precio) {
        super.setNombre(nombre);
        super.setPrecio(precio);
    }

    @Override
    public boolean esSuscribible() {
        return true;
    }
}
