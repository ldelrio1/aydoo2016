package ar.edu.untref.aydoo;

public class ArticuloDeLibreria extends Producto {
	
	private double IVA = 1.21;

	public ArticuloDeLibreria(String name) {
		this.setNombre(name);
	}

	public double getIVA() {
		return IVA;
	}

	public void setIva(double iva) {
		this.IVA = iva;
	}
	
	public double getPrecio(){
		double precioConIVA = super.getPrecio() * this.IVA;
		return precioConIVA;
	}

}
