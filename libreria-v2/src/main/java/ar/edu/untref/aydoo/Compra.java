package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lucas on 23/06/16.
 */
public class Compra {

    private LinkedList<Producto> listaDeCompra;
    private Mes mesCompra;

    public Compra(Mes mes){
        setMes(mes);
        listaDeCompra = new LinkedList<>();
    }

    public void agregarProducto(Producto producto) {
        listaDeCompra.add(producto);
    }

    public Mes getMesCompra() {
        return mesCompra;
    }

    public void setMes(Mes mes) {
        mesCompra = mes;
    }

    public List<Producto> getProductos() {
        return listaDeCompra;
    }
}
