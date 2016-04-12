package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private ArrayList<List<Producto>> productosComprados;
    private String nombreCliente;
    private String direccion;
    
	public Cliente(String nombre, String direccion) {

		setDireccion(this.direccion);
		setNombreCliente(this.nombreCliente);
		
		productosComprados = new ArrayList<List<Producto>>(12);
		
		//Inicializo cada mes
		for (int i = 0; i < 12; i++){
			productosComprados.add(new ArrayList<Producto>());	
		}
	}
	
	public void setNombreCliente(String nombre){
		this.nombreCliente = nombre;
	}
	
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	
	public String getNombreCliente(){
		return this.nombreCliente;
	}
	
	public String getDireccionCliente(){
		return this.direccion;
	}

	public void comprar(Producto unProducto, String mes){
		if (unProducto.getTipo() == "Periodico"){
			for (int i= 0; i < productosComprados.size(); i ++){
				productosComprados.get(i).add(unProducto);
			}
		}
		else{
			productosComprados.get(getMes(mes)).add(unProducto);
		}
	}
	
	public List<Producto> getCompras(int nroMes){
		
		return productosComprados.get(nroMes);
	}
	
	public int getMes(String mes){
		
		int nroMes = 0;
		String mesEnMinusculas = mes.toLowerCase();
		switch(mesEnMinusculas){
			case "enero":
				nroMes = 1;
				break;
			
			case "febrero":
				nroMes = 2;
				break;
			
			case "marzo":
				nroMes = 3;
				break;
				
			case "abril":
				nroMes = 4;
				break;
			
			case "mayo":
				nroMes = 5;
				break;
			
			case "junio":
				nroMes = 6;
				break;
			
			case "julio":
				nroMes = 7;
				break;
			
			case "agosto":
				nroMes = 8;
				break;
			
			case "septiembre":
				nroMes = 9;
				break;
			
			case "octubre":
				nroMes = 10;
				break;
			
			case "noviembre":
				nroMes = 11;
				break;
			
			case "diciembre":
				nroMes = 12;
				break;
					
		}
		return nroMes;
	}
	
	

}
