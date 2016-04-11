package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

	
	@Test
	public void casoVentaDeUnLibroEnEnero(){
		
		Kiosko elKiosko = new Kiosko();
		Cliente juan = new Cliente("Juan");
		elKiosko.agregarCliente(juan);
		
		Compra producto1 = new Compra("El Hobbit", 50.0, "Enero");
		Libro elHobbit = new Libro("El Hobbit", 50.0, "Enero");
		producto1 = elHobbit;	
		juan.comprar(producto1);
		
		
		Assert.assertEquals("Monto a cobrarle por enero: 50.0 = $50.0", 
				elKiosko.calcularMontoACobrar("Enero",juan));
	}
	
	@Test
	public void casoVentaDeUnLibroEnEneroyFebrero(){
		
		Kiosko elKiosko = new Kiosko();
		Cliente juan = new Cliente("Juan");
		elKiosko.agregarCliente(juan);
		
		Compra producto1 = new Compra("El Hobbit", 50.0, "Enero");
		Libro elHobbit = new Libro("El Hobbit", 50, "Enero");
		producto1 = elHobbit;
		
		Compra producto2 = new Compra("La Metamorfosis", 70, "Febrero");
		Libro laMetamorfosis = new Libro("La Metamorfosis", 70, "Febrero");
		producto1 = elHobbit;
		producto2 = laMetamorfosis;
		
		juan.comprar(producto1);
		juan.comprar(producto2);
		
		
		Assert.assertEquals("Monto a cobrarle por febrero: 70.0 = $70.0", 
				elKiosko.calcularMontoACobrar("Febrero",juan));;
	}
	
	@Test
	public void casoVentaDeDosLibrosEnFebrero(){
		
		Kiosko elKiosko = new Kiosko();
		Cliente juan = new Cliente("Juan");
		elKiosko.agregarCliente(juan);
		
		Compra producto1 = new Compra("El Hobbit", 50.0, "Febrero");
		Libro elHobbit = new Libro("El Hobbit", 50, "Febrero");
		producto1 = elHobbit;
		
		Compra producto2 = new Compra("La Metamorfosis", 70, "Febrero");
		Libro laMetamorfosis = new Libro("La Metamorfosis", 70, "Febrero");
		producto1 = elHobbit;
		producto2 = laMetamorfosis;
		
		juan.comprar(producto1);
		juan.comprar(producto2);
		
		
		Assert.assertEquals("Monto a cobrarle por febrero: 50.0 + 70.0 = $120.0", 
				elKiosko.calcularMontoACobrar("Febrero",juan));;
	}
}
