package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {
	
	@Test
	public void factoresPrimosConNumero132() {
		
		int numeroRecibido = 132;
		String factorizacionDe132 = "2 2 3 11 ";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe132, 
							factoresPrimos.calcularFactoresPrimos(numeroRecibido));
	}
	
	@Test
	public void factoresPrimosConNumero360() {
		
		int numeroRecibido = 360;
		String factorizacionDe360 = "2 2 2 3 3 5 ";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe360, 
							factoresPrimos.calcularFactoresPrimos(numeroRecibido));	
	}
	
	@Test
	public void factoresPrimosConNumero18() {
		
		int numeroRecibido = 18;
		String factorizacionDe18 = "2 3 3 ";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe18, 
							factoresPrimos.calcularFactoresPrimos(numeroRecibido));	
	}
	
	@Test
	public void factoresPrimosConNumero1NoImprimeNumeros() {
		
		int numeroRecibido = 1;
		String factorizacionDe1 = "";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDe1, 
							factoresPrimos.calcularFactoresPrimos(numeroRecibido));	
	}
	
	@Test
	public void factoresPrimosConNumeroNegativoNoImprimeNumeros() {
		
		int numeroRecibido = -25;
		String factorizacionDeNegativo = "";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	
		Assert.assertEquals(factorizacionDeNegativo, 
							factoresPrimos.calcularFactoresPrimos(numeroRecibido));	
	}

	@Test
	public void imprimirEnFormatoPrettyFactoresPrimosConNumero70Ascendente() {
		
		int numeroRecibido = 70;
		String factorizacionDe70 = "Factores primos 70: 2 5 7 ";
		String formato = "pretty";
		String orden = "asc";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	Imprimir imprimirNumeros = new Imprimir();
    	
    	
    	
    	Assert.assertEquals(factorizacionDe70, 
    						imprimirNumeros.imprimirFactoresPrimos(numeroRecibido, 
    																formato,
    																factoresPrimos.calcularFactoresPrimos(numeroRecibido),
    																orden));
		
	}
	
	@Test
	public void imprimirEnFormatoPrettyFactoresPrimosConNumero70Descendente() {
		
		int numeroRecibido = 70;
		String factorizacionDe70 = "Factores primos 70: 7 5 2 ";
		String formato = "pretty";
		String orden = "des";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	Imprimir imprimirNumeros = new Imprimir();
    	
    	Assert.assertEquals(factorizacionDe70, 
    						imprimirNumeros.imprimirFactoresPrimos(numeroRecibido, 
    																formato,
    																factoresPrimos.calcularFactoresPrimos(numeroRecibido),
    																orden));
	}
	
	@Test
	public void imprimirEnFormatoPrettyFactoresPrimosConNumero132Descendente() {
		
		int numeroRecibido = 132;
		String factorizacionDe132 = "Factores primos 132: 11 3 2 2 ";
		String formato = "pretty";
		String orden = "des";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	Imprimir imprimirNumeros = new Imprimir();
    	
    	Assert.assertEquals(factorizacionDe132, 
    						imprimirNumeros.imprimirFactoresPrimos(numeroRecibido, 
    																formato,
    																factoresPrimos.calcularFactoresPrimos(numeroRecibido),
    																orden));
	}
		
	@Test
	public void imprimirEnFormatoQuietFactoresPrimosConNumero360Descendente() {
		
		int numeroRecibido = 360;
		String factorizacionDe360 = "5\n3\n3\n2\n2\n2\n";
		String formato = "quiet";
		String orden = "des";		
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	Imprimir imprimirNumeros = new Imprimir();
    	
		Assert.assertEquals(factorizacionDe360, 
							imprimirNumeros.imprimirFactoresPrimos(numeroRecibido, 
																	formato,
																	factoresPrimos.calcularFactoresPrimos(numeroRecibido),
																	orden));	
	}
	
	@Test
	public void imprimirEnFormatoQuietFactoresPrimosConNumero360Ascendente() {
		
		int numeroRecibido = 360;
		String factorizacionDe360 = "2\n2\n2\n3\n3\n5\n";
		String formato = "quiet";
		String orden = "asc";		
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	Imprimir imprimirNumeros = new Imprimir();
    	
		Assert.assertEquals(factorizacionDe360, 
							imprimirNumeros.imprimirFactoresPrimos(numeroRecibido, 
																	formato,
																	factoresPrimos.calcularFactoresPrimos(numeroRecibido),
																	orden));	
	}
	
	@Test
	public void pideImprimirEnFormatoEquivocado() {
		
		int numeroRecibido = 360;
		String formato = "dfghg";
		String orden = "asc";
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularPrimos(numeroRecibido);
    	Imprimir imprimirNumeros = new Imprimir();
    	
		Assert.assertEquals("Formato no aceptado. Las opciones posibles son: pretty o quiet.", 
							imprimirNumeros.imprimirFactoresPrimos(numeroRecibido, 
																	formato, 
																	factoresPrimos.calcularFactoresPrimos(numeroRecibido),
																	orden));	
	}
}
