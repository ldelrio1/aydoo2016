package ar.edu.untref.aydoo;

public class Expendedora {
	
	private Vaso vaso;
	private HacedorDeCafeConLeche maquinaCafe;
	private HacedorDeTeConLeche maquinaTe;
	
	public Expendedora(Vaso vaso){
		this.vaso = vaso;
		maquinaCafe = new HacedorDeCafeConLeche();
		maquinaTe = new HacedorDeTeConLeche();
	}
	
	public Vaso hacerCafeConLecheConNDeAzucar(int cucharadasDeAzucar, 
			int cantidadDeCafe, int cantidadDeLeche){
		
		vaso = maquinaCafe.agregarEnVaso(vaso, cantidadDeCafe, cantidadDeLeche);
		vaso.agregarAzucar(cucharadasDeAzucar);
		return vaso;
	}
	
	public Vaso hacerTeConLecheConNDeAzucar(int cucharadasDeAzucar, 
			 int cantidadDeLeche){
		
		vaso = maquinaTe.agregarEnVaso(vaso, cantidadDeLeche);
		vaso.agregarAzucar(cucharadasDeAzucar);
		return vaso;
	}
	
}
