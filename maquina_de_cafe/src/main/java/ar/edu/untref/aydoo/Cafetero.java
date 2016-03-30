package ar.edu.untref.aydoo;

public class Cafetero {
	
	public Vaso agregarEnVaso(Vaso vaso, int cantidadDeCafe){
		vaso.agregarCafe(cantidadDeCafe);
		return vaso;
	}
}
