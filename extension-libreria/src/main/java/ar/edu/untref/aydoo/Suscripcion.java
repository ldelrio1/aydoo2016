package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Suscripcion extends Producto {
	private List<Producto> productos;
	
	public Suscripcion() {
		productos = new LinkedList<Producto>();
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	public double getPrecio() {
		double precio = 0;
		Frecuencia frecuencia = Frecuencia.NULA;

		for (Producto productoActual : productos) {
			
			if(productoActual instanceof Revista){				
				frecuencia = ((Revista) productoActual).getFrecuencia();
			}else if(productoActual instanceof Periodico){
				frecuencia = ((Periodico) productoActual).getFrecuencia();
			}
			
			switch (frecuencia) {
			case DIARIA:
				precio = precio + productoActual.getPrecio() * 30;
				break;
			case SEMANAL:
				precio = precio + productoActual.getPrecio() * 4;
				break;
			case QUINCENAL:
				precio = precio + productoActual.getPrecio() * 2;
				break;
			case MENSUAL:
				precio = precio + productoActual.getPrecio() * 1;
				break;
			default:
				precio = precio + productoActual.getPrecio() * 1;
				break;
			}
		}
		return precio;
	}

	public List<Producto> getListaDeProductos() {
		return this.productos;
	}
	
}
