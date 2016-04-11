package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

	
	@Test
	public void casoVentaDeUnLibroEnEnero(){
		
		Kiosko elKiosko = new Kiosko();
		Cliente juan = new Cliente("Juan");
		elKiosko.agregarCliente(juan);
		
		Compra producto1 = new Compra("El Hobbit", "Enero");
		Libro elHobbit = new Libro("El Hobbit", "Enero", 50);
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
		
		Compra producto1 = new Compra("El Hobbit", "Enero");
		Libro elHobbit = new Libro("El Hobbit", "Enero", 50);
		producto1 = elHobbit;
		
		Compra producto2 = new Compra("La Metamorfosis", "Febrero");
		Libro laMetamorfosis = new Libro("La Metamorfosis", "Febrero", 70);
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
		
		Compra producto1 = new Compra("El Hobbit", "Febrero");
		Libro elHobbit = new Libro("El Hobbit", "Febrero", 50);
		producto1 = elHobbit;
		
		Compra producto2 = new Compra("La Metamorfosis", "Febrero");
		Libro laMetamorfosis = new Libro("La Metamorfosis", "Febrero", 70);
		producto1 = elHobbit;
		producto2 = laMetamorfosis;
		
		juan.comprar(producto1);
		juan.comprar(producto2);
		
		Assert.assertEquals("Monto a cobrarle por febrero: 50.0 + 70.0 = $120.0", 
				elKiosko.calcularMontoACobrar("Febrero",juan));;
	}
	
	@Test
	public void casoVentaDeDosLibrosYDosLapicerasEnFebrero(){
		
		Kiosko elKiosko = new Kiosko();
		Cliente juan = new Cliente("Juan");
		elKiosko.agregarCliente(juan);
		
		Compra producto1 = new Compra("El Hobbit", "Febrero");
		Libro elHobbit = new Libro("El Hobbit", "Febrero", 50);
		producto1 = elHobbit;
		
		Compra producto2 = new Compra("La Metamorfosis","Febrero");
		Libro laMetamorfosis = new Libro("La Metamorfosis", "Febrero", 70);
		producto1 = elHobbit;
		producto2 = laMetamorfosis;
		
		Compra producto3 = new Compra("LapiceraBic", "Febrero");
		ArticuloLibreria lapicera = new ArticuloLibreria("LapiceraBic","Febrero", 5, 2);
		producto3 = lapicera;
		
		juan.comprar(producto1);
		juan.comprar(producto2);
		juan.comprar(producto3);
		
		Assert.assertEquals("Monto a cobrarle por febrero: 50.0 + 70.0 + 12.1 = $132.1", 
				elKiosko.calcularMontoACobrar("Febrero",juan));;
	}
}
