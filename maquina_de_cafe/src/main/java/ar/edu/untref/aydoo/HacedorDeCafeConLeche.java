package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {

	private Cafetero Nescafe;
	private Lechero Sancor;
	
	public HacedorDeCafeConLeche(){
		Nescafe = new Cafetero();
		Sancor = new Lechero();
	}
	
	public Vaso agregarEnVaso(Vaso vaso, int cantidadDeCafe, int cantidadDeLeche){
		Nescafe.agregarEnVaso(vaso, cantidadDeCafe);
		Sancor.agregarEnVaso(vaso, cantidadDeLeche);
		return vaso;
	}
}
