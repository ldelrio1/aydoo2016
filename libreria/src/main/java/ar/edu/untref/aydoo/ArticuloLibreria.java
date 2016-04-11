package ar.edu.untref.aydoo;

public class ArticuloLibreria extends Compra {
	
	
	public ArticuloLibreria (String nombre, String mes, double monto, int cantidad){
		
		super(nombre, mes);
		super.setValor((monto *cantidad) + calcularRecargo(monto, cantidad));
		
	}
	
	public double calcularRecargo(double monto, int cantidad){
		
		double recargo = (monto* cantidad) * 0.21;
		return recargo;
	}
	
	
}
