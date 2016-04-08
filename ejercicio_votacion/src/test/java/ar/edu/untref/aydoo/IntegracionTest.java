package ar.edu.untref.aydoo;
import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

	
	@Test
	public void testEmisionDeVoto(){
		
				
		JuntaElectoral laJunta = new JuntaElectoral();
		laJunta.votar(NombreCandidato.SCIOLI, NombreProvincia.BUENOS_AIRES);
		laJunta.votar(NombreCandidato.SCIOLI, NombreProvincia.BUENOS_AIRES);
		laJunta.votar(NombreCandidato.SCIOLI, NombreProvincia.BUENOS_AIRES);
		
		Assert.assertEquals(3, laJunta.getCantidadDeVotos());
		
	}
	
	@Test
	public void testEmisionDeVotosDistintos(){
		
		JuntaElectoral laJunta = new JuntaElectoral();
		laJunta.votar(NombreCandidato.SCIOLI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.MACRI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.MASSA, NombreProvincia.CATAMARCA);
		
		Assert.assertEquals(3, laJunta.getCantidadDeVotos());
		
	}
	
	@Test
	public void testCalculoCandidatoGanador1Candidato(){
		
		JuntaElectoral laJunta = new JuntaElectoral();
		laJunta.votar(NombreCandidato.SCIOLI, NombreProvincia.BUENOS_AIRES);
		
		Assert.assertEquals(NombreCandidato.SCIOLI, laJunta.getCandidatoMasVotadoEnNacion());
		
	}
	
	@Test
	public void testCalculoCandidatoGanador1CandidatoStolbizer(){
		
				
		JuntaElectoral laJunta = new JuntaElectoral();
		laJunta.votar(NombreCandidato.STOLBIZER, NombreProvincia.BUENOS_AIRES);
		
		Assert.assertEquals(NombreCandidato.STOLBIZER, laJunta.getCandidatoMasVotadoEnNacion());
		
	}
	
	
	@Test
	public void testCalculoCandidatoGanardorConEmisionDeVariosVotos(){
		JuntaElectoral laJunta = new JuntaElectoral();
				
		laJunta.votar(NombreCandidato.SCIOLI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.MACRI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.MACRI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.MACRI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.SCIOLI, NombreProvincia.BUENOS_AIRES);
				
		Assert.assertEquals(NombreCandidato.MACRI, laJunta.getCandidatoMasVotadoEnNacion());
		
	}
	
	@Test
	public void testPartidoMasVotadoEnProvinciaDeBuenosAires(){
		JuntaElectoral laJunta = new JuntaElectoral();
				
		laJunta.votar(NombreCandidato.SCIOLI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.MACRI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.MACRI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.MACRI, NombreProvincia.BUENOS_AIRES);
		
		laJunta.votar(NombreCandidato.SCIOLI, NombreProvincia.BUENOS_AIRES);
				
		Assert.assertEquals("Cambiemos", laJunta.getPartidoMasVotadoEnProvincia(NombreProvincia.BUENOS_AIRES));
		
	}
	
	
}
