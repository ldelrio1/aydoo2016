package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class SuscripcionTest {

	@Test
	public void agregarProductoASuscripcion() {
		Suscripcion suscripcion = new Suscripcion();
		Libro libro = new Libro("Jobs");

		suscripcion.agregarProducto(libro);

		Assert.assertEquals(true, suscripcion.getListaDeProductos().contains(libro));
	}
	
	@Test
	public void getPrecioDeSuscripcion() {
		Suscripcion suscripcion = new Suscripcion();
		Revista revista = new Revista("El Grafico", Frecuencia.MENSUAL);
		
		revista.setPrecio(30);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(30, suscripcion.getPrecio(),0.1);
	}
	
	
	@Test
	public void getPrecioDeSuscripcionMensualFrecuenciaDiaria() {
		Suscripcion suscripcion = new Suscripcion();
		Revista revista = new Revista("El Grafico", Frecuencia.DIARIA);
		
		revista.setPrecio(30);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(900, suscripcion.getPrecio(),0.1);
	}
	
	@Test
	public void getPrecioDeSuscripcionMensualFrecuenciaAnual() {
		Suscripcion suscripcion = new Suscripcion();
		Revista revista = new Revista("El Grafico", Frecuencia.ANUAL);
		
		revista.setPrecio(30);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(30, suscripcion.getPrecio(),0.1);
	}
	
	@Test
	public void getPrecioDeSuscripcionMensualFrecuenciaSemanal() {
		Suscripcion suscripcion = new Suscripcion();
		Revista revista = new Revista("El Grafico", Frecuencia.SEMANAL);
		
		revista.setPrecio(30);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(120, suscripcion.getPrecio(),0.1);
	}
	
	@Test
	public void getPrecioDeSuscripcionMensualFrecuenciaNula() {
		Suscripcion suscripcion = new Suscripcion();
		Revista revista = new Revista("El Grafico", Frecuencia.NULA);
		
		revista.setPrecio(30);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(30, suscripcion.getPrecio(),0.1);
	}
	
	@Test
	public void getPrecioDeSuscripcionMensualFrecuenciaQuincenal() {
		Suscripcion suscripcion = new Suscripcion();
		Revista revista = new Revista("El Grafico", Frecuencia.QUINCENAL);
		
		revista.setPrecio(30);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(60, suscripcion.getPrecio(),0.1);
	}

}
