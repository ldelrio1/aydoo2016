package ar.edu.untref.aydoo;

public class Libro extends Compra {
	
	public Libro(String nombreLibro, String mes, double monto) {
		super(nombreLibro, mes);
		super.setValor(monto);
	}
	
	
	
}
