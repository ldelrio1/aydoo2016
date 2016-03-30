package ar.edu.untref.aydoo;

public class Vaso {
	
	private int capacidad;
	private int cantidadDeAzucar;
	private int cantidadDeLeche;
	private int cantidadDeCafe;
	private int sacosDeTe;
	
	public Vaso(int capacidadVaso){
		
		this.capacidad = capacidadVaso;
		this.cantidadDeAzucar = 0;
		this.cantidadDeLeche = 0;
		this.cantidadDeCafe = 0;
		this.sacosDeTe = 0;
	}
		
	public void agregarAzucar(int cucharadasDeAzucar){
		if ((this.cantidadDeAzucar < 3) && (cucharadasDeAzucar + this.cantidadDeAzucar < 4)){
			this.cantidadDeAzucar += cucharadasDeAzucar;
		}
		else{
			System.out.println("Ya se agregó suficiente azucar");
		}
		
	}
	
	public void agregarLeche(int cantidadDeLeche){
		if((cantidadDeLeche <= this.capacidad) && 
				(this.cantidadDeLeche + cantidadDeLeche <= this.capacidad)){
			this.cantidadDeLeche += cantidadDeLeche;
			this.capacidad = this.capacidad - cantidadDeLeche;
		}
		else{
			System.out.println("La leche ya fue agregada");
		}
	}
	
	public void agregarCafe(int cantidadDeCafe){
		if((cantidadDeCafe <= this.capacidad) && 
				(this.cantidadDeCafe + cantidadDeCafe <= this.capacidad)){
			this.cantidadDeCafe += cantidadDeCafe;
			this.capacidad -= cantidadDeCafe;
		}
		else{
			System.out.println("El cafe ya fue agregado");
		}
	}

	public void agregarTe() {
		if(this.sacosDeTe == 0){
			this.sacosDeTe ++;
		}
		else{
			System.out.println("El te ya fue agregado");
		}
		
	}
	
	public int getCantidadDeAzucar(){
		return this.cantidadDeAzucar;
	}
	
	public int getCantidadDeCafe(){
		return this.cantidadDeCafe;
	}
	
	public int getCantidadDeLeche(){
		return this.cantidadDeLeche;
	}
	
	public int getCapacidadVaso(){
		return this.capacidad;
	}
	
}
