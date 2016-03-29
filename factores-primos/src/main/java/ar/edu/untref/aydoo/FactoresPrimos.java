package ar.edu.untref.aydoo;
import java.util.ArrayList;

public class FactoresPrimos {

	
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
		
		
		if (numeroRecibido < 2){
    		System.out.println("Debe ingresar un numero mayor que 1");
    	}    	
    	else{	
    		
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
	
	public String imprimirFactoresPrimos(){
		
    	String resultado = " ";
    	
    	for(int i = 0; i < this.factoresPrimos.size(); i++){
    		
    		resultado = resultado.concat(Integer.toString(factoresPrimos.get(i))) + " ";
    		
    	}
    	return resultado;
		
	}
}
