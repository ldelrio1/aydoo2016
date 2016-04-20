package ar.edu.untref.aydoo;
import java.util.ArrayList;

public class FactoresPrimos {

	private ArrayList<Integer> numerosPrimos;
	
	public FactoresPrimos(){
		
		numerosPrimos = new ArrayList<Integer>();
	}
	
	/**
	 * @post
	 * Guarda en el arrayList numerosPrimos 
	 * todos los numeros primos que hay hasta el numero ingresado
	 * */
	public void calcularPrimos(int numeroRecibido){
		
		
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

	public String calcularFactoresPrimos(int numeroRecibido) {
		
		int recibidoAuxiliar;
		recibidoAuxiliar = numeroRecibido;
		
		String factoresPrimos = "";
				
		for(int i= 0; i < this.numerosPrimos.size(); i++){
    		
    		while( recibidoAuxiliar % this.numerosPrimos.get(i)== 0){
    			
    			factoresPrimos += Integer.toString(this.numerosPrimos.get(i)) + " ";
    			recibidoAuxiliar = recibidoAuxiliar/this.numerosPrimos.get(i);
    		}
       	}
		
		return factoresPrimos;
	}
}
