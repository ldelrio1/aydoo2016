package ar.edu.untref.aydoo;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
	
    private List<Compra> compras;
    private String nombreCliente;

	public Cliente(String nombre) {
		
		compras = new ArrayList<Compra>();
		this.nombreCliente = nombre;
	}
	
	public String getNombreCliente(){
		
		return this.nombreCliente;
	}

	public void comprar(Compra unProducto) {
		
		compras.add(unProducto);
		
	}
	
	public List<Compra> getCompras(){
		
		return compras;
	}

}
