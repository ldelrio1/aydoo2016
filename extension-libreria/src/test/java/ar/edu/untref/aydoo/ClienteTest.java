package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void crearCliente() {
		Cliente cliente = new Cliente("Gonza");

		String nombre = cliente.getNombre();

		Assert.assertEquals("Gonza", nombre);
	}
	
	@Test
	public void crearClienteConDireccion() {
		Cliente cliente = new Cliente("Gonza");

		cliente.setDireccion("calle falsa 123");
		String direccion = cliente.getDireccion();

		Assert.assertEquals("calle falsa 123", direccion);
	}
	
	@Test
	public void clienteConCompraYQueExista() {
		Cliente cliente = new Cliente("Gonza");
		Producto libro = new Libro("El Hobbit");
		Compra compra = new Compra(Mes.ENERO);
		
		compra.agregarProducto(libro);
		cliente.agregarCompra(compra);

		Assert.assertEquals(1, cliente.getListaDeCompras().size());
	}
	
	@Test
	public void clienteConCompra() {
		Cliente cliente = new Cliente("Gonza");
		Producto libro = new Libro("El Hobbit");
		Compra compra = new Compra(Mes.ENERO);
		
		compra.agregarProducto(libro);
		cliente.agregarCompra(compra);

		Assert.assertEquals(true, cliente.getListaDeCompras().contains(compra));
	}

}
