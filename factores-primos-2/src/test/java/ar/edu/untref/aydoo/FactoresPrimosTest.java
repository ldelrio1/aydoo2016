package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {
	
	@Test
	public void testFactoresPrimosConNumero132() {
		
		int numeroRecibido = 132;
		String factorizacionDe132 = "Factores primos 132: 2 2 3 11 ";
		String formato = "--format=pretty";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe132, factoresPrimos.imprimirFactoresPrimos(formato));
		
	}

	@Test
	public void testImprimirEnFormatoPrettyFactoresPrimosConNumero70() {
		
		int numeroRecibido = 70;
		String factorizacionDe70 = "Factores primos 70: 2 5 7 ";
		String formato = "--format=pretty";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos(numeroRecibido);
		
    	Assert.assertEquals(factorizacionDe70, factoresPrimos.imprimirFactoresPrimos(formato));
		
	}
	
	@Test
	public void testFactoresPrimosConNumero360() {
		
		int numeroRecibido = 360;
		String factorizacionDe360 = "Factores primos 360: 2 2 2 3 3 5 ";
		String formato = "--format=pretty";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe360, factoresPrimos.imprimirFactoresPrimos(formato));	
	}
	
	@Test
	public void testImprimirSinFormatoDesignadoFactoresPrimosConNumero360() {
		
		int numeroRecibido = 360;
		String factorizacionDe360 = "Factores primos 360: 2 2 2 3 3 5 ";
		String formato = "";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe360, factoresPrimos.imprimirFactoresPrimos(formato));	
	}
	
	@Test
	public void testImprimirEnFormatoQuietFactoresPrimosConNumero360() {
		
		int numeroRecibido = 360;
		String factorizacionDe360 = " 5/n3/n3/n2/n2/n2/n";
		String formato = "--format=quiet";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe360, factoresPrimos.imprimirFactoresPrimos(formato));	
	}
	
	@Test
	public void testPideImprimirEnFormatoEquivocado() {
		
		int numeroRecibido = 360;
		String formato = "dfghg";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	factoresPrimos.calcularFactoresPrimos(numeroRecibido);
    	
		Assert.assertEquals("Formato no aceptado. Las opciones posibles son: pretty o quiet.", factoresPrimos.imprimirFactoresPrimos(formato));	
	}
}
