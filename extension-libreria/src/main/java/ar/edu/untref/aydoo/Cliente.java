package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

	private String nombre;
	private String direccion;
	private List<Compra> listaDeCompras;

	public Cliente(String nombre) {
		this.setNombre(nombre);
		this.listaDeCompras = new LinkedList<Compra>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Compra> getListaDeCompras() {
		return listaDeCompras;
	}
	
	public void agregarCompra(Compra unaCompra){
		this.listaDeCompras.add(unaCompra);
	}

}
