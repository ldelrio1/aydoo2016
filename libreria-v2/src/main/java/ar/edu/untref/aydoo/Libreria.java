package ar.edu.untref.aydoo;

import java.util.LinkedList;

/**
 * Created by lucas on 23/06/16.
 */
public class Libreria {

    private LinkedList<Cliente> listaDeClientes;
    private String nombreLibreria;

    public Libreria(String nombre){

        nombreLibreria = nombre;
        listaDeClientes = new LinkedList<>();
    }

    public String getNombreLibreria(){
        return nombreLibreria;
    }

    public double calcularMontoACobrar(Mes mes, Cliente unCliente){

        verificarCliente(unCliente);
        double montoACobrar = 0;

        LinkedList<Producto> productosComprados;
        productosComprados = unCliente.getProductosCompradosEnMes(mes);

        if (productosComprados == null){
            montoACobrar = 0;
        }else {
            for(Producto productoActual : productosComprados){
                montoACobrar += productoActual.getPrecio();
            }
        }

        return montoACobrar;
    }

    public void agregarCliente(Cliente unCliente) {

        if(!listaDeClientes.contains(unCliente)){
            listaDeClientes.add(unCliente);
        }
    }

    private void verificarCliente(Cliente clienteAVerificar){

        if(!listaDeClientes.contains(clienteAVerificar)){
            throw new ExcepcionClienteDesconocido();
        }
    }
}
