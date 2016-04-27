package ar.edu.untref.aydoo;

public class Periodico extends Producto{
	private Frecuencia frecuencia;

	public Periodico(String nombre, Frecuencia frecuencia) {
		
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
