package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class RevistaTest {

	@Test
	public void nombreDeRevista() {
		Producto revista = new Revista("El Grafico", Frecuencia.MENSUAL);

		String nombre = revista.getNombre();

		Assert.assertEquals("El Grafico", nombre);
	}
	
	@Test
	public void precioDeRevista() {
		Producto revista = new Revista("El Grafico", Frecuencia.MENSUAL);
		
		revista.setPrecio(30);
		double precio = revista.getPrecio();

		Assert.assertEquals(30, precio, 0.1);
	}
	
	@Test
	public void frecuenciaDeRevista() {
		Revista revista = new Revista("El Grafico", Frecuencia.MENSUAL);
	
		Frecuencia frecuencia = revista.getFrecuencia();

		Assert.assertEquals(Frecuencia.MENSUAL, frecuencia);
	}

}
