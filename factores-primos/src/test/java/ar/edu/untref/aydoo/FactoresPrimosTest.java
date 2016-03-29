package ar.edu.untref.aydoo;
import org.junit.Test;

import org.junit.Assert;

public class FactoresPrimosTest {

	
	@Test
	public void testFactoresPrimosConNumero132() {
		
		int numeroRecibido = 132;
		String factorizacionDe132 = "Factores primos 132: 2 3 3 11";
		String factorizacion = "";
		boolean factorizacionCorrecta;
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos();
		factorizacion = factoresPrimos.imprimirFactoresPrimos();
		
		factorizacionCorrecta = factorizacion.equals(factorizacionDe132);
		
		Assert.assertTrue(factorizacionCorrecta);
		
	}

	@Test
	public void testFactoresPrimosConNumero70() {
		
		int numeroRecibido = 70;
		String factorizacionDe70 = "Factores primos 70: 2 5 7";
		String factorizacion = "";
		boolean factorizacionCorrecta;
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos();
		
    	factorizacion = factoresPrimos.imprimirFactoresPrimos();
		factorizacionCorrecta = factorizacion.equals(factorizacionDe70);
		
		Assert.assertTrue(factorizacionCorrecta);
		
	}
	
	@Test
	public void testFactoresPrimosConNumero360() {
		
		int numeroRecibido = 360;
		String factorizacionDe360 = "Factores primos 360: 2 2 2 3 3 5";
		String factorizacion = "";
		boolean factorizacionCorrecta;
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos();
    	
		factorizacion = factoresPrimos.imprimirFactoresPrimos();
		factorizacionCorrecta = factorizacion.equals(factorizacionDe360);
		
		Assert.assertTrue(factorizacionCorrecta);
		
	}


}
