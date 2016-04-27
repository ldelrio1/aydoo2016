package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class AlquilerTest {

	@Test
	public void agregarProductoAAlquiler() {
		Alquiler alquiler = new Alquiler(TipoAlquiler.DIARIO,15);
		Libro libro = new Libro("Jobs");

		alquiler.agregarProducto(libro);

		Assert.assertEquals(true, alquiler.getListaDeProductos().contains(libro));
	}
	
	@Test
	public void verPrecioDeProductoEnAlquilerDiario() {
		Alquiler alquiler = new Alquiler(TipoAlquiler.DIARIO,10);
		Libro libro = new Libro("La metamorfosis");
		
		libro.setPrecio(10);
		alquiler.agregarProducto(libro);

		Assert.assertEquals(100, alquiler.getPrecio(), 0.01);
	}
	
	@Test
	public void verPrecioDeProductoEnAlquilerMensual() {
		Alquiler alquiler = new Alquiler(TipoAlquiler.MENSUAL,200);
		Libro libro = new Libro("La Odisea");
		
		libro.setPrecio(200);
		alquiler.agregarProducto(libro);

		Assert.assertEquals(200, alquiler.getPrecio(), 0.01);
	}
	
	@Test
	public void verPrecioDeProductoEnAlquilerCuatrimestral() {
		Alquiler alquiler = new Alquiler(TipoAlquiler.CUATRIMESTRAL,2);
		Libro libro = new Libro("El cartero");
		
		libro.setPrecio(200);
		alquiler.agregarProducto(libro);

		Assert.assertEquals(180, alquiler.getPrecio(), 0.01);
	}
}
