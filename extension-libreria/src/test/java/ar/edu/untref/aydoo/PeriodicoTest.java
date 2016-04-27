package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class PeriodicoTest {

	@Test
	public void nombrePeriodico() {
		Periodico periodico = new Periodico("Pagina12", Frecuencia.DIARIA);

		String nombre = periodico.getNombre();

		Assert.assertEquals("Pagina12", nombre);
	}
	
	@Test
	public void frecuenciaPeriodico() {
		Periodico periodico = new Periodico("Pagina12", Frecuencia.DIARIA);

		Frecuencia frecuencia = periodico.getFrecuencia();

		Assert.assertEquals(Frecuencia.DIARIA, frecuencia);
	}
	
	@Test
	public void precioPeriodico() {
		Periodico periodico = new Periodico("Pagina12", Frecuencia.DIARIA);
		
		periodico.setPrecio(12);
		double precio = periodico.getPrecio();

		Assert.assertEquals(12, precio, 0.1);
	}

}
