package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class LibreriaTest {

	@Test
	public void createEmptyBookStore() {
		Libreria myBookStore = new Libreria("PanamaPapers");

		String name = myBookStore.getNombre();

		Assert.assertEquals("PanamaPapers", name);
	}
	
	@Test
	public void createBookStoreWithBook() {
		Libreria myBookStore = new Libreria("PanamaPapers");
		Producto book = new Libro("The Hobbit");
		
		myBookStore.agregarProducto(book);

		Assert.assertEquals(1, myBookStore.getListaDeProductos().size());
	}
	
	@Test
	public void createBookStoreWithMagazine() {
		Libreria myBookStore = new Libreria("PanamaPapers");
		Producto magazine = new Revista("El grafico", Frecuencia.MENSUAL);
		
		myBookStore.agregarProducto(magazine);

		Assert.assertEquals(1, myBookStore.getListaDeProductos().size());
	}
	
	@Test
	public void calcularMontoACobrarJuan() {
		Libreria libreria = new Libreria("PanamaPapers");
		Revista unaRevista = new Revista("El grafico", Frecuencia.NULA);
		Libro unLibro = new Libro("The Hobbit");
		ArticuloDeLibreria articulo = new ArticuloDeLibreria("lapicera");
		Cliente clienteJuan = new Cliente("Juan");
		Compra compra = new Compra(Mes.AGOSTO);

		
		unaRevista.setPrecio(30);
		unLibro.setPrecio(50);
		articulo.setPrecio(5);
		compra.agregarProducto(articulo);
		compra.agregarProducto(articulo);
		compra.agregarProducto(unLibro);
		compra.agregarProducto(unaRevista);
		clienteJuan.agregarCompra(compra);
		libreria.agregarCliente(clienteJuan);
		double resultado = libreria.calcularMontoACobrar(Mes.AGOSTO, clienteJuan);
		
		Assert.assertEquals(92.1, resultado,0.01);
	}
	
	@Test
	public void calcularMontoACobrarMariaConSuscripcionAnual() {

		Libreria libreria = new Libreria("PanamaPapers");
		Revista unaRevista = new Revista("Barcelona", Frecuencia.QUINCENAL);
		Revista diario = new Revista("Pagina12", Frecuencia.NULA);
		Cliente clienteMaria = new Cliente("Maria");
		Compra compra = new Compra(Mes.ENERO);
		SuscripcionAnual suscripcionRevista = new SuscripcionAnual();

		
		unaRevista.setPrecio(20);
		diario.setPrecio(12);
		suscripcionRevista.agregarProducto(unaRevista);
		compra.agregarProducto(suscripcionRevista);
		compra.agregarProducto(diario);
		clienteMaria.agregarCompra(compra);
		libreria.agregarCliente(clienteMaria);
		double resultado = libreria.calcularMontoACobrar(Mes.ENERO, clienteMaria);
		
		Assert.assertEquals(44, resultado,0.01);
	}
	
	@Test
	public void calcularMontoACobrarMariaSinSuscripcionAnual() {

		Libreria libreria = new Libreria("PanamaPapers");
		Revista unaRevista = new Revista("Barcelona", Frecuencia.QUINCENAL);
		Revista diario = new Revista("Pagina12", Frecuencia.NULA);
		Cliente clienteMaria = new Cliente("Maria");
		Compra compra = new Compra(Mes.ENERO);
		Suscripcion suscripcionRevista = new Suscripcion();

		
		unaRevista.setPrecio(20);
		diario.setPrecio(12);
		suscripcionRevista.agregarProducto(unaRevista);
		compra.agregarProducto(suscripcionRevista);
		compra.agregarProducto(diario);
		clienteMaria.agregarCompra(compra);
		libreria.agregarCliente(clienteMaria);
		double resultado = libreria.calcularMontoACobrar(Mes.ENERO, clienteMaria);
		
		Assert.assertEquals(52, resultado,0.01);
	}
	
	@Test
	public void calcularMontoACobrarMariaConSuscripcionAnualDePeriodico() {

		Libreria libreria = new Libreria("PanamaPapers");
		Revista diario = new Revista("Pagina12", Frecuencia.DIARIA);
		Cliente clienteMaria = new Cliente("Maria");
		Compra compra = new Compra(Mes.ENERO);
		SuscripcionAnual suscripcionPeriodico = new SuscripcionAnual();

		
		diario.setPrecio(12);
		suscripcionPeriodico.agregarProducto(diario);
		compra.agregarProducto(suscripcionPeriodico);
		clienteMaria.agregarCompra(compra);
		libreria.agregarCliente(clienteMaria);
		double resultado = libreria.calcularMontoACobrar(Mes.ENERO, clienteMaria);
		
		Assert.assertEquals(288, resultado,0.01);
	}
	
	@Test
	public void calcularMontoACobrarMariaSinSuscripcionAnualDePeriodico() {

		Libreria libreria = new Libreria("PanamaPapers");
		Revista diario = new Revista("Pagina12", Frecuencia.DIARIA);
		Cliente clienteMaria = new Cliente("Maria");
		Compra compra = new Compra(Mes.ENERO);
		Suscripcion suscripcionPeriodico = new Suscripcion();

		
		diario.setPrecio(12);
		suscripcionPeriodico.agregarProducto(diario);
		compra.agregarProducto(suscripcionPeriodico);
		clienteMaria.agregarCompra(compra);
		libreria.agregarCliente(clienteMaria);
		double resultado = libreria.calcularMontoACobrar(Mes.ENERO, clienteMaria);
		
		Assert.assertEquals(360, resultado,0.01);
	}
}
