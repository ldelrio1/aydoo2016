package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Partido {

	private String nombrePartido;
	public ArrayList <Candidato> candidatos;

	
	public Partido(String nombre){
		this.nombrePartido = nombre;
		candidatos = new ArrayList <Candidato>();
		inicializarCandidatos(nombre);

	}
	
	private void inicializarCandidatos(String nombre) {
		
		switch(nombre){
		
			case "Frente para la Victoria":
				Candidato candidatoScioli = new Candidato(NombreCandidato.SCIOLI);
				candidatos.add(candidatoScioli);	
			break;
			
			case "Cambiemos":
				Candidato candidatoMacri = new Candidato(NombreCandidato.MACRI);
				candidatos.add(candidatoMacri);
			
				Candidato candidatoSanz = new Candidato(NombreCandidato.SANZ);
				candidatos.add(candidatoSanz);
			
				Candidato candidatoCarrio = new Candidato(NombreCandidato.CARRIO);
				candidatos.add(candidatoCarrio);	
			break;
				
			case "Unidos por una Nueva Alternativa":
				Candidato candidatoMassa = new Candidato(NombreCandidato.MASSA);
				candidatos.add(candidatoMassa);
				
				Candidato candidatoDeLaSota = new Candidato(NombreCandidato.DE_LA_SOTA);
				candidatos.add(candidatoDeLaSota);	
			break;
			
			case "Progresistas":
				Candidato candidatoStolbizer = new Candidato(NombreCandidato.STOLBIZER);
				candidatos.add(candidatoStolbizer);
			break;
			
			case "Frente de Izquierda y de los Trabajadores":
				Candidato candidatoDelCaño = new Candidato(NombreCandidato.DEL_CAÑO);
				candidatos.add(candidatoDelCaño);
				
				Candidato candidatoAltamira = new Candidato(NombreCandidato.ALTAMIRA);
				candidatos.add(candidatoAltamira);
			break;
			
			case "Compromiso Federal":
				Candidato candidatoRodriguezSaa = new Candidato(NombreCandidato.RODRIGUEZ_SAA);
				candidatos.add(candidatoRodriguezSaa);
			break;
			
			case "Frente Popular":
				Candidato candidatoDeGennaro = new Candidato(NombreCandidato.DE_GENNARO);
				candidatos.add(candidatoDeGennaro);
			break;
			
			case "Nuevo MAS":
				Candidato candidatoCastañeira = new Candidato(NombreCandidato.CASTAÑEIRA);
				candidatos.add(candidatoCastañeira);
			break;
			
			case "MST":
				Candidato candidatoBodart = new Candidato(NombreCandidato.BODART);
				candidatos.add(candidatoBodart);
			break;
			
			case "Partido Popular":
				Candidato candidatoYattah = new Candidato(NombreCandidato.YATTAH);
				candidatos.add(candidatoYattah);
			break;
			
			case "Movimiento de Accion Vecinal":
				Candidato candidatoAlbarracin = new Candidato(NombreCandidato.ALBARRACIN);
				candidatos.add(candidatoAlbarracin);
			break;
		}
		
		
	}

	public void sumarVoto(int candidato, NombreProvincia provincia){
		
			candidatos.get(candidato).sumarVotoProvincia(provincia);
				
	}
	
	public int getVotosCandidato(int candidato){
		return candidatos.get(candidato).getCantidadDeVotos();
	}
	
	public int getVotosCandidatoEnProvincia(int candidato, NombreProvincia provincia){
		return candidatos.get(candidato).getCantidadDeVotosEnProvincia(provincia);
	}
	
	public int getTotalVotosPartido(){
		int totalVotos = 0;
		
		for (int i = 0; i < candidatos.size(); i ++){
				
			totalVotos += candidatos.get(i).getCantidadDeVotos();
			
		}
		return totalVotos;
	}
	
	public NombreCandidato getNombreCandidato(int posicion){
		return this.candidatos.get(posicion).getNombreCandidato();
	} 
	
	public int getCantidadDeCandidatos(){
		return candidatos.size();
	}
	
	public String getNombrePartido(){
		return this.nombrePartido;
	}
	
	
}
