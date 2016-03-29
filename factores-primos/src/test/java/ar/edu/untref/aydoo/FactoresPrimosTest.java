package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {
	
	@Test
	public void testFactoresPrimosConNumero132() {
		
		int numeroRecibido = 132;
		String factorizacionDe132 = " 2 2 3 11 ";
		
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe132, factoresPrimos.imprimirFactoresPrimos());
		
	}

	@Test
	public void testFactoresPrimosConNumero70() {
		
		int numeroRecibido = 70;
		String factorizacionDe70 = " 2 5 7 ";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos(numeroRecibido);
		
    	Assert.assertEquals(factorizacionDe70, factoresPrimos.imprimirFactoresPrimos());
		
	}
	
	@Test
	public void testFactoresPrimosConNumero360() {
		
		int numeroRecibido = 360;
		String factorizacionDe360 = " 2 2 2 3 3 5 ";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe360, factoresPrimos.imprimirFactoresPrimos());	
	}


}
