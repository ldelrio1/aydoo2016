package ar.edu.untref.aydoo;

public class Compra {
	
	private String nombreProducto;
	private double valor;
	private String mes;
	
	public Compra (String nombre, String mesCompra){
		
		this.mes = mesCompra;
		this.nombreProducto = nombre;
	}
	
	public void setValor(double valor){
		
		this.valor = valor;
	}
	
	
	public String getMesCompra(){
	
		return this.mes;
	}
		
	public String getNombre(){
		
		return this.nombreProducto;
	}
	
	public double getValor(){
		
		return this.valor;
	}

}
