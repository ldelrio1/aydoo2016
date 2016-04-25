package ar.edu.untref.aydoo;

public class SuscripcionAnual extends Suscripcion {
	private double descuento = 0.8;

	public double getPrecio() {
		return super.getPrecio() * descuento;
	}
}
