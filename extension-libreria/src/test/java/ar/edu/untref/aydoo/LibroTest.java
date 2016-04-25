package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class LibroTest {

	@Test
	public void nombreDelLibro() {
		Libro libro = new Libro("El Hobbit");

		String nombre = libro.getNombre();

		Assert.assertEquals("El Hobbit", nombre);
	}
	
	@Test
	public void precioDelLibro() {
		Libro libro = new Libro("El Hobbit");
		
		libro.setPrecio(50);
		double precio = libro.getPrecio();

		Assert.assertEquals(50, precio, 0.01);
	}

}
