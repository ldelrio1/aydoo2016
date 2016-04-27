package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ArticuloDeLibreriaTest {

	@Test
	public void articuloDeLibreriaGetNombre() {
		Producto articulo = new ArticuloDeLibreria("lapicera");

		String nombre = articulo.getNombre();

		Assert.assertEquals("lapicera", nombre);
	}
	
	@Test
	public void articuloDeLibreriaGetPrecio() {
		ArticuloDeLibreria articulo = new ArticuloDeLibreria("lapicera");
		
		articulo.setPrecio(5);
		double precio = articulo.getPrecio();

		Assert.assertEquals(6.05, precio, 0.01);
	}
	
	@Test
	public void articuloDeLibreriaGetPrecioConIVA() {
		ArticuloDeLibreria articulo = new ArticuloDeLibreria("lapicera");
		
		articulo.setPrecio(10);
		double precio = articulo.getPrecio();

		Assert.assertEquals(12.1, precio, 0.01);
	}

}
