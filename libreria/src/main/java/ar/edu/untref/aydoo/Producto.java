package ar.edu.untref.aydoo;

public class Producto {
	
	private String nombreProducto;
	private double valor;
	private String tipo;
	
	public Producto (String nombre){
		
		this.nombreProducto = nombre;
	}
	
	public void setValor(double valor){
		
		this.valor = valor;
	}
	
	public void setTipo(String tipoProducto){
		this.tipo = tipoProducto;
	}
	
	public String getTipo(){
		return this.tipo;
	}
		
	public String getNombre(){
		
		return this.nombreProducto;
	}
	
	public double getValor(){
		
		return this.valor;
	}

}
