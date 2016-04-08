package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Voto {
	
	private NombreCandidato nombreCantidato;
	private NombreProvincia nombreProvincia;
					
	public void votar(NombreCandidato nombreCandidato, NombreProvincia miProvincia,
			ArrayList <Partido> partidos){
		
		sumarVoto(nombreCandidato, miProvincia, partidos);
		
		this.nombreProvincia = miProvincia;
		this.nombreCantidato = nombreCandidato;
		
	}
	
	public NombreProvincia getProvincia(){
		
		return this.nombreProvincia;
	}
	
	public NombreCandidato getCandidato(){
		
		return this.nombreCantidato;
	}


	private void sumarVoto(NombreCandidato nombreCandidato, NombreProvincia miProvincia, 
			ArrayList <Partido> partidos){
		
		boolean votoConcretado = false;		
		if (!votoConcretado){
			for(int i = 0; i < partidos.size(); i ++){
				for(int j = 0; j < partidos.get(i).getCantidadDeCandidatos(); j++){
				
					if(partidos.get(i).getNombreCandidato(j) == nombreCandidato){
				
						partidos.get(i).sumarVoto(j, miProvincia);
						votoConcretado = true;
					}
				}
			}
		}
	}
		
}
