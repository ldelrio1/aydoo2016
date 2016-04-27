package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class SuscripcionAnualTest {

	@Test
	public void suscripcionAnualFrecuenciaMensual() {
		SuscripcionAnual suscripcion = new SuscripcionAnual();
		Revista revista = new Revista("Barcelona", Frecuencia.MENSUAL);

		revista.setPrecio(100);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(80, suscripcion.getPrecio(), 0.1);
	}

	@Test
	public void suscripcionAnualFrecuenciaDiaria() {
		SuscripcionAnual suscripcion = new SuscripcionAnual();
		Revista revista = new Revista("Barcelona", Frecuencia.DIARIA);

		revista.setPrecio(100);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(2400, suscripcion.getPrecio(), 0.1);
	}
	
	@Test
	public void suscripcionAnualFrecuenciaAnual() {
		SuscripcionAnual suscripcion = new SuscripcionAnual();
		Revista revista = new Revista("Barcelona", Frecuencia.ANUAL);

		revista.setPrecio(100);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(80, suscripcion.getPrecio(), 0.1);
	}
	
	@Test
	public void suscripcionAnualFrecuenciaSemanal() {
		SuscripcionAnual suscripcion = new SuscripcionAnual();
		Revista revista = new Revista("Barcelona", Frecuencia.SEMANAL);

		revista.setPrecio(100);
		suscripcion.agregarProducto(revista);

		Assert.assertEquals(320, suscripcion.getPrecio(), 0.1);
	}

}
