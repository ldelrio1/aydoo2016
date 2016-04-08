package ar.edu.untref.aydoo;


public class Provincia {

	private NombreProvincia nombre;
	private int cantidadDeVotos;
	
	public Provincia(NombreProvincia nombre){
		this.nombre = nombre;
		this.cantidadDeVotos = 0;
	}
	
	public NombreProvincia getNombre(){
		return this.nombre;
	}
	
	public void sumarVoto(){
		this.cantidadDeVotos++;
	}
	
	public int getCantidadDeVotos(){
		return this.cantidadDeVotos;
	}
}

