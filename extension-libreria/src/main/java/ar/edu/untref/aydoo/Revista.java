package ar.edu.untref.aydoo;

public class Revista extends Producto {
	
	private Frecuencia frecuencia;

	public Revista(String nombre, Frecuencia frecuencia) {
		this.setNombre(nombre);
		this.setFrecuencia(frecuencia);
	}

	public Frecuencia getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Frecuencia frecuencia) {
		this.frecuencia = frecuencia;
	}

}
