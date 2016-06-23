package ar.edu.untref.aydoo;

/**
 * Created by lucas on 23/06/16.
 */
public abstract class Producto {

    private String nombre;
    private double precio;

    public Producto (String nombre, double precio){
        setNombre(nombre);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
