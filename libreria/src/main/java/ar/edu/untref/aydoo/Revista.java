package ar.edu.untref.aydoo;

public class Revista extends Producto {
	
	public Revista(String nombreRevista, String mes, double monto) {
		super(nombreRevista);
		super.setTipo("Revista");
	}
}
