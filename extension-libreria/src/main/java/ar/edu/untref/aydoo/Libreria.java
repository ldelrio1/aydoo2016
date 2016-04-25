package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Libreria {

	private List<Producto> listaDeProductos;
	private List<Cliente> listaDeClientes;
	private String nombre;

	public Libreria(String nombre) {
		this.nombre = nombre;
		this.listaDeProductos = new LinkedList<Producto>();
		this.listaDeClientes = new LinkedList<Cliente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void agregarProducto(Producto producto) {
		this.listaDeProductos.add(producto);
	}

	public List<Producto> getListaDeProductos() {
		return this.listaDeProductos;
	}

	public List<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public void agregarCliente(Cliente unCliente) {
		this.listaDeClientes.add(unCliente);
	}

	public double calcularMontoACobrar(Mes mes, Cliente unCliente) {
		double montoACobrar = 0;
		for (Cliente clienteActual : listaDeClientes) {
			List<Compra> compras = clienteActual.getListaDeCompras();
			for (Compra compraActual : compras) {
				if (compraActual.getMes().equals(mes)) {
					List<Producto> productos = compraActual.getListDeProductos();
					for(Producto productoActual: productos){
						montoACobrar = montoACobrar + productoActual.getPrecio();
					}
				}
			}
		}
		return montoACobrar;
	}

}
