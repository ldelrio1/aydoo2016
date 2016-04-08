package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class JuntaElectoral{
	
	private ArrayList<Voto> votos;
	private ArrayList <Partido> partidos;

	public JuntaElectoral(){	
		votos = new ArrayList <Voto>();
		partidos = new ArrayList <Partido>();
		inicializarPartidos();
	}
	
	public void inicializarPartidos(){
		Partido partidoFPV = new Partido("Frente para la Victoria");
		partidos.add(partidoFPV);
		
		Partido partidoCambiemos = new Partido("Cambiemos");
		partidos.add(partidoCambiemos);
		
		Partido partidoUNA = new Partido ("Unidos por una Nueva Alternativa");
		partidos.add(partidoUNA);
		
		Partido partidoProgresistas = new Partido ("Progresistas");
		partidos.add(partidoProgresistas);
		
		Partido partidoFIT = new Partido("Frente de Izquierda y de los Trabajadores");
		partidos.add(partidoFIT);
		
		Partido partidoCompromisoFederal  = new Partido ("Compromiso Federal");
		partidos.add(partidoCompromisoFederal);
		
		Partido partidoFrentePopular = new Partido ("Frente Popular");
		partidos.add(partidoFrentePopular);
		
		Partido partidoNuevoMAS = new Partido("Nuevo MAS");
		partidos.add(partidoNuevoMAS);
		
		Partido partidoMST = new Partido("MST");
		partidos.add(partidoMST);
		
		Partido partidoPartidoPopular = new Partido("Partido Popular");
		partidos.add(partidoPartidoPopular);
		
		Partido partidoMovimientoDeAccionVecinal = new Partido("Movimiento de Accion Vecinal");
		partidos.add(partidoMovimientoDeAccionVecinal);
	}
	
	
	public void votar(NombreCandidato miCandidato, NombreProvincia miProvincia){
		Voto miVoto = new Voto();
		miVoto.votar(miCandidato, miProvincia, partidos);
		votos.add(miVoto);
	}
	
		
	public NombreCandidato getCandidatoMasVotadoEnNacion(){
		
		int cantidadDeVotos = 0;
		int partido = 0;
		int candidato = 0;
		
		for(int i = 0; i < partidos.size(); i++){
			
			for(int j = 0; j < partidos.get(i).getCantidadDeCandidatos(); j++){
				
				if(partidos.get(i).getVotosCandidato(j) > cantidadDeVotos){
					cantidadDeVotos = partidos.get(i).getVotosCandidato(j);
					partido = i;
					candidato = j;
				}
			}	
		}
		return partidos.get(partido).getNombreCandidato(candidato);
	}
	
	public String getPartidoMasVotadoEnProvincia(NombreProvincia provincia){
		
		String partido = null;
		int cantidadDeVotosEnProvincia = 0;
		
		for(int i = 0; i < partidos.size(); i++){
			
			for(int j = 0; j < partidos.get(i).getCantidadDeCandidatos(); j++){
				
				int cantidadDeVotosPartido = 0;
				cantidadDeVotosPartido += partidos.get(i).getVotosCandidatoEnProvincia(j, provincia);
				
				if(cantidadDeVotosPartido > cantidadDeVotosEnProvincia){
					cantidadDeVotosEnProvincia = cantidadDeVotosPartido;
					partido = partidos.get(i).getNombrePartido();
				}	
			}
		}		
		
		return partido;
	}
	
	public int getCantidadDeVotos(){
		return votos.size();
	}
}
