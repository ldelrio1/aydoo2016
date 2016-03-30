package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

public class testMaquinaDeCafe {

	
	@Test
	public void testHacerCafeConLecheCon2DeAzucarVerificarCantidadAzucar(){
		
		Vaso vasoDeLucas = new Vaso(5);
		Expendedora maquina = new Expendedora(vasoDeLucas);
		vasoDeLucas = maquina.hacerCafeConLecheConNDeAzucar(2, 2, 2);
		
		Assert.assertEquals(2, vasoDeLucas.getCantidadDeAzucar());
		
	}
	
	@Test
	public void testHacerCafeConLecheCon2DeAzucarVerificarCafe(){
		
		Vaso vasoDeLucas = new Vaso(5);
		Expendedora maquina = new Expendedora(vasoDeLucas);
		vasoDeLucas = maquina.hacerCafeConLecheConNDeAzucar(2, 2, 2);
		
		Assert.assertEquals(2, vasoDeLucas.getCantidadDeCafe());
		
	}
	
	@Test
	public void testHacerCafeConLecheCon2DeAzucarVerificarLeche(){
		
		Vaso vasoDeLucas = new Vaso(5);
		Expendedora maquina = new Expendedora(vasoDeLucas);
		vasoDeLucas = maquina.hacerCafeConLecheConNDeAzucar(2, 2, 2);
		
		Assert.assertEquals(2, vasoDeLucas.getCantidadDeLeche());
	
	}
	
	@Test
	public void testHacerCafeConLecheCon2DeAzucarVerificarCapacidadVaso(){
		
		Vaso vasoDeLucas = new Vaso(5);
		Expendedora maquina = new Expendedora(vasoDeLucas);
		vasoDeLucas = maquina.hacerCafeConLecheConNDeAzucar(2, 3, 2);
		
		Assert.assertEquals(0, vasoDeLucas.getCapacidadVaso());
	
	}
	
	@Test
	public void testHacerTeConLecheCon2DeAzucarVerificarLeche(){
		
		Vaso vasoDeLucas = new Vaso(5);
		Expendedora maquina = new Expendedora(vasoDeLucas);
		vasoDeLucas = maquina.hacerTeConLecheConNDeAzucar(2, 3);
		
		Assert.assertEquals(3, vasoDeLucas.getCantidadDeLeche());
	
	}

	@Test
	public void testHacerCafeConLecheCon6CafeNoSeGuarda(){
		
		Vaso vasoDeLucas = new Vaso(5);
		Expendedora maquina = new Expendedora(vasoDeLucas);
		vasoDeLucas = maquina.hacerCafeConLecheConNDeAzucar(2, 6, 2);
		
		Assert.assertEquals(0, vasoDeLucas.getCantidadDeCafe());
		
	}

	@Test
	public void testHacerCafeConLecheCon4AzucarNoSeGuarda(){
		
		Vaso vasoDeLucas = new Vaso(5);
		Expendedora maquina = new Expendedora(vasoDeLucas);
		vasoDeLucas = maquina.hacerCafeConLecheConNDeAzucar(4, 1, 2);
		
		Assert.assertEquals(0, vasoDeLucas.getCantidadDeAzucar());
		
	}
}
