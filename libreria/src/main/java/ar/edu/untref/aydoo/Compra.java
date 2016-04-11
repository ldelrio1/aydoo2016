package ar.edu.untref.aydoo;

public class Compra {
	
	private String nombre;
	private double valor;
	private String mes;
	
	public Compra (String nombre, double valor, String mesCompra){
		this.mes = mesCompra;
		this.valor = valor;
		this.nombre = nombre;
	}
	
	public String getMesCompra(){
	
		return this.mes;
	}
		
	public String getNombre(){
		
		return this.nombre;
	}
	
	public double getValor(){
		
		return this.valor;
	}

}
