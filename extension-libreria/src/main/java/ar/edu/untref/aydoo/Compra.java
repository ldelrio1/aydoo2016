package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Compra {
	private Mes mes;
	private double cantidad;
	private List<Producto> listaDeProductos = new LinkedList<Producto>();
	

	public Compra(Mes mes) {
		this.mes = mes;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public List<Producto> getListDeProductos() {
		return listaDeProductos;
	}

	public void agregarProducto(Producto producto) {
		this.listaDeProductos.add(producto);
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}
}
