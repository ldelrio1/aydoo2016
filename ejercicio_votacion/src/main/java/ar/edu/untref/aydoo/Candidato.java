package ar.edu.untref.aydoo;

import java.util.ArrayList;

public class Candidato {

	private int cantidadDeVotos;
	private NombreCandidato nombreCandidato;
	private ArrayList <Provincia> provincias;
	
	
	public Candidato(NombreCandidato nombre){
		provincias = new ArrayList <Provincia>();
		inicializarProvincias();
		this.cantidadDeVotos = 0;
		this.nombreCandidato = nombre;
	}
	
	private void inicializarProvincias() {
		
		Provincia bsAs = new Provincia(NombreProvincia.BUENOS_AIRES); 
		provincias.add(bsAs);
		
		Provincia catamarca = new Provincia(NombreProvincia.CATAMARCA); 
		provincias.add(catamarca);
		
		Provincia chaco = new Provincia(NombreProvincia.CHACO); 
		provincias.add(chaco);
		
		Provincia chubut = new Provincia(NombreProvincia.CHUBUT); 
		provincias.add(chubut);
		
		Provincia cordoba = new Provincia(NombreProvincia.CORDOBA); 
		provincias.add(cordoba);
		
		Provincia corrientes = new Provincia(NombreProvincia.CORRIENTES); 
		provincias.add(corrientes);
		
		Provincia entre_rios = new Provincia(NombreProvincia.ENTRE_RIOS); 
		provincias.add(entre_rios);
		
		Provincia formosa = new Provincia(NombreProvincia.FORMOSA); 
		provincias.add(formosa);
		
		Provincia jujuy = new Provincia(NombreProvincia.JUJUY); 
		provincias.add(jujuy);
		
		Provincia la_pampa = new Provincia(NombreProvincia.LA_PAMPA); 
		provincias.add(la_pampa);
		
		Provincia la_rioja = new Provincia(NombreProvincia.LA_RIOJA); 
		provincias.add(la_rioja);
		
		Provincia mendoza = new Provincia(NombreProvincia.MENDOZA); 
		provincias.add(mendoza);
		
		Provincia misiones = new Provincia(NombreProvincia.MISIONES); 
		provincias.add(misiones);
		
		Provincia neuquen = new Provincia(NombreProvincia.NEUQUEN); 
		provincias.add(neuquen);
		
		Provincia rio_negro = new Provincia(NombreProvincia.RIO_NEGRO); 
		provincias.add(rio_negro);
		
		Provincia salta = new Provincia(NombreProvincia.SALTA); 
		provincias.add(salta);
		
		Provincia san_juan = new Provincia(NombreProvincia.SAN_JUAN); 
		provincias.add(san_juan);
		
		Provincia san_luis = new Provincia(NombreProvincia.SAN_LUIS); 
		provincias.add(san_luis);
		
		Provincia santa_cruz = new Provincia(NombreProvincia.SANTA_CRUZ); 
		provincias.add(santa_cruz);
		
		Provincia santa_fe = new Provincia(NombreProvincia.SANTA_FE); 
		provincias.add(santa_fe);
		
		Provincia santiago_del_estero = new Provincia(NombreProvincia.SANTIAGO_DEL_ESTERO); 
		provincias.add(santiago_del_estero);
		
		Provincia tierra_del_fuego = new Provincia(NombreProvincia.TIERRA_DEL_FUEGO); 
		provincias.add(tierra_del_fuego);
		
		Provincia tucuman = new Provincia(NombreProvincia.TUCUMAN); 
		provincias.add(tucuman);
		
		
		
		
	}

	
	public void sumarVotoProvincia(NombreProvincia provincia){
		
		for(int i = 0; i < provincias.size(); i++){
			if (provincias.get(i).getNombre()== provincia){
				provincias.get(i).sumarVoto();
				this.cantidadDeVotos++;
			}
		}
		
	}
	
	public int getCantidadDeVotosEnProvincia(NombreProvincia provincia){
		
		int cantidadDeVotos = 0;
		for(int i = 0; i < provincias.size(); i++){
			if (provincias.get(i).getNombre() == provincia){
				cantidadDeVotos = provincias.get(i).getCantidadDeVotos();
			}
		}
		return cantidadDeVotos;
	}
	
	public int getCantidadDeVotos(){
		
		return this.cantidadDeVotos;
	}
	
	public NombreCandidato getNombreCandidato(){
		return this.nombreCandidato;
	}
	
	
}
