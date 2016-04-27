package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Alquiler extends Producto{

	private int cantidad;
	private TipoAlquiler tipoDeAlquiler;
	
	private List<Producto> productos;
	
	public Alquiler(TipoAlquiler tipo,int cantidad) {
		this.tipoDeAlquiler = tipo;
		this.cantidad = cantidad;
		productos = new LinkedList<Producto>();
		
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
		
	}
	
	public double getPrecio(){
		
		double precio = 0;
		
		for(Producto productoActual : productos){
			
			precio = productoActual.getPrecio();
		
			switch(tipoDeAlquiler){
			
				case DIARIO:
					if(cantidad > 3 && cantidad < 25){
						precio = precio * cantidad;
					}
				break;
				
				case CUATRIMESTRAL:
					precio = precio - (precio*0.1);
					
				break;
			default:
				break;
					
			}
		}	
		return precio;
	}
	
	public TipoAlquiler getTipoDeAlquiler(){
		
		return this.tipoDeAlquiler;
	}
	
	public int getCantidad(){
		return this.cantidad;
	}

	public List<Producto> getListaDeProductos() {
		return this.productos;
	}
}
