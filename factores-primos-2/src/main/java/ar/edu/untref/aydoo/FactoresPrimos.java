package ar.edu.untref.aydoo;
import java.util.ArrayList;

public class FactoresPrimos {

	private int numeroRecibido;
	private ArrayList<Integer> numerosPrimos;
	private ArrayList<Integer> factoresPrimos;
	
	public FactoresPrimos(){
		
		numerosPrimos = new ArrayList<Integer>();
	    factoresPrimos = new ArrayList<Integer>();
	}
	
	/**
	 * @post
	 * Guarda en el arrayList numerosPrimos 
	 * todos los números primos que hay hasta el número ingresado
	 * */
	public void calcularPrimos(int numeroRecibido){
		
		this.numeroRecibido = numeroRecibido;
		
        for(int dividendo= 2;dividendo<(numeroRecibido+1);dividendo++){  
        		
        	int cantidadDeDivisores = 0;
        	for(int divisor= 1; divisor < dividendo+1; divisor++){
        		if( dividendo%divisor == 0 ){
        			cantidadDeDivisores++;
        		}
        	}
        	if(cantidadDeDivisores < 3){
        		this.numerosPrimos.add(dividendo);
        	} 
    	}
	}

	public void calcularFactoresPrimos(int numeroRecibido) {
		
		int recibidoAuxiliar;
		recibidoAuxiliar = numeroRecibido;
		for(int i= 0; i < this.numerosPrimos.size(); i++){
    		
    		while( recibidoAuxiliar % this.numerosPrimos.get(i)== 0){
    			
    			this.factoresPrimos.add(this.numerosPrimos.get(i));
    			recibidoAuxiliar = recibidoAuxiliar/this.numerosPrimos.get(i);
    		}
       	}
	}
	
	public String imprimirFactoresPrimos(String formato){
		
		String formatoMinuscula = formato.toLowerCase();
		String imprimir = "";
		if (formato == "" || formato == " "){
			imprimir = imprimirEnFormatoPretty();
		}
		else if(formatoMinuscula == "--format=pretty"){
			imprimir = imprimirEnFormatoPretty();
		}
		else if(formatoMinuscula == "--format=quiet"){
			imprimir = imprimirEnFormatoQuiet();
		}
		else{
			imprimir = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
		}
		
		return imprimir;
	}
	
	private String imprimirEnFormatoPretty(){
		
    	String resultado = " ";
    	String imprimir = "";
    	
    	for(int i = 0; i < this.factoresPrimos.size(); i++){
    		
    		resultado = resultado.concat(Integer.toString(factoresPrimos.get(i))) + " ";
    		
    	}
    	imprimir = "Factores primos " + this.numeroRecibido + ":" + resultado;
    	return imprimir;	
	}
	
	private String imprimirEnFormatoQuiet(){
		
    	String resultado = " ";
    	String imprimir = "";
    	
    	for(int i = this.factoresPrimos.size() - 1; i > -1; i--){
    		
    		resultado = resultado.concat(Integer.toString(factoresPrimos.get(i))) + "/n";		
    	}
    	imprimir = resultado;
    	return imprimir;	
	}
}
