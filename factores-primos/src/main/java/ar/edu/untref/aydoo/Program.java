package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program 
{

	static long numeroRecibido;
	
	private ArrayList<Integer> numerosPrimos;
	private ArrayList<Integer> factoresPrimos;
	
	public Program(){
		numeroRecibido = 0;

		numerosPrimos = new ArrayList<Integer>();
	    factoresPrimos = new ArrayList<Integer>();
	}
	
	/**
	 * @post
	 * Guarda en el arrayList numerosPrimos 
	 * todos los números primos que hay hasta el número ingresado
	 * */
	public void calcularPrimos(){
		
		if (numeroRecibido < 2){
    		System.out.println("Debe ingresar un número mayor que 1");
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

	private void calcularFactoresPrimos() {
		
		long recibidoAuxiliar;
		recibidoAuxiliar = numeroRecibido;

		for(int i= 0; i < this.numerosPrimos.size(); i++){
    		
    		while( recibidoAuxiliar % this.numerosPrimos.get(i)== 0){
    			
    			this.factoresPrimos.add(this.numerosPrimos.get(i));
    			recibidoAuxiliar = recibidoAuxiliar/this.numerosPrimos.get(i);
    		}
       	}
	}
	
	private void imprimirFactoresPrimos(){
		
    	String resultado = " ";
    	
    	for(int i = 0; i < this.factoresPrimos.size(); i++){
    		
    		resultado = resultado.concat(Integer.toString(factoresPrimos.get(i))) + " ";
    		
    	}
		
    	System.out.println("Factores Primos " + numeroRecibido + ":" + resultado);

	}
	
	
    public static final void main(String arg[])
    {
        Program ejecutar = new Program();
        
        try{
        	Scanner numeroIngresado = new Scanner(System.in);
        	numeroRecibido = numeroIngresado.nextInt();
        	
        	if (numeroRecibido < 2){
        		System.out.println("Debe ingresar un número mayor que 1");
        	}else{
        		ejecutar.calcularPrimos();
        		ejecutar.calcularFactoresPrimos();
        		ejecutar.imprimirFactoresPrimos();
        	}
        }catch(InputMismatchException e){
        	System.out.println("Debe ingresar un número entero");
        }
        
    }	
}
