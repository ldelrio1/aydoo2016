package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {
	
	private HacedorDeTe GreenHills;
	private Lechero Sancor;
	
	public HacedorDeTeConLeche(){
		GreenHills = new HacedorDeTe();
		Sancor = new Lechero();
	}
	
	public Vaso agregarEnVaso(Vaso vaso, int cantidadDeLeche){
		GreenHills.agregarEnVaso(vaso);
		Sancor.agregarEnVaso(vaso, cantidadDeLeche);
		return vaso;
	}
}
