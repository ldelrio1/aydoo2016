package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class CalculadorDeFactoresPrimosTest {

	CalculadorDeFactoresPrimos calculadorDeFactoresPrimos = new CalculadorDeFactoresPrimos();

	@Test
	public void factoresPrimosConNumero132() {
		
		int numeroRecibido = 132;
        LinkedList<Integer> factorizacionDe132 = new LinkedList<>();
        factorizacionDe132.add(2);
        factorizacionDe132.add(2);
        factorizacionDe132.add(3);
        factorizacionDe132.add(11);

		Assert.assertEquals(factorizacionDe132,
							calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido));
	}
	
	@Test
	public void factoresPrimosConNumero360() {
		
		int numeroRecibido = 360;
        LinkedList<Integer> factorizacionDe360 = new LinkedList<>();
        factorizacionDe360.add(2);
        factorizacionDe360.add(2);
        factorizacionDe360.add(2);
        factorizacionDe360.add(3);
        factorizacionDe360.add(3);
        factorizacionDe360.add(5);

		Assert.assertEquals(factorizacionDe360, 
							calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido));
	}
	
	@Test
	public void factoresPrimosConNumero18() {
		
		int numeroRecibido = 18;
        LinkedList<Integer> factorizacionDe18 = new LinkedList<>();
        factorizacionDe18.add(2);
        factorizacionDe18.add(3);
        factorizacionDe18.add(3);

		Assert.assertEquals(factorizacionDe18, 
							calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido));
	}
	
	@Test(expected = ExcepcionNumeroInvalido.class)
	public void factoresPrimosConNumero1NoImprimeNumeros() {
		
		int numeroRecibido = 1;
        LinkedList<Integer> factorizacionDe1 = new LinkedList<>();

        Assert.assertEquals(factorizacionDe1,
							calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido));
	}
	
	@Test(expected = ExcepcionNumeroInvalido.class)
	public void factoresPrimosConNumeroNegativoNoImprimeNumeros() {
		
		int numeroRecibido = -25;
        LinkedList<Integer> factorizacionDeNegativo = new LinkedList<>();

		Assert.assertEquals(factorizacionDeNegativo,
							calculadorDeFactoresPrimos.calcularFactoresPrimos(numeroRecibido));
	}

}
