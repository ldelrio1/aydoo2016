package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by lucas on 23/06/16.
 */
public class Cliente {

    private String nombreCliente;
    private String apellidoCliente;
    private String direccionCliente;
    private Map<Mes, LinkedList<Producto> > productosComprados;

    public Cliente (String nombre, String apellido, String direccion){
        nombreCliente = nombre;
        apellidoCliente = apellido;
        direccionCliente = direccion;
        productosComprados = new HashMap<>();
    }

    public String obtenerNombreDelCliente(){
        return nombreCliente;
    }

    public String obtenerApellidoDelCliente(){
        return apellidoCliente;
    }

    public String obtenerDireccionDelCliente(){
        return direccionCliente;
    }

    public void ingresarCompra(Compra unaCompra){

        Mes mesCompra = unaCompra.getMesCompra();
        LinkedList<Producto> listaDeCompras;
        listaDeCompras = productosComprados.get(mesCompra);

        if (listaDeCompras == null){
            listaDeCompras = new LinkedList<>();
        }

        for(Producto productoActual : unaCompra.getProductos()){
            listaDeCompras.add(productoActual);
        }
        productosComprados.put(unaCompra.getMesCompra(),listaDeCompras);
    }

    public LinkedList<Producto> getProductosCompradosEnMes(Mes mesCompra){

        return productosComprados.get(mesCompra);
    }
}
