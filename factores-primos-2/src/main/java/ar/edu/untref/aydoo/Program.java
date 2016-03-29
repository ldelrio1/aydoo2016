package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Program 
{
	
    public static final void main(String args[])
    {
    	int numeroIngresado = Integer.parseInt(args[0]);
    	int numeroRecibido;
    	FactoresPrimos calcular = new FactoresPrimos();
    	
        try{
			if( (args.length == 2) || (args[1] == " ")){
        		try{
        	
        			if (numeroIngresado < 2){
        				System.out.println("Debe ingresar un numero mayor que 1");
        			}else{
            			numeroRecibido = numeroIngresado;
            			calcular.calcularPrimos(numeroRecibido);
            			calcular.calcularFactoresPrimos(numeroRecibido);
            			String formato = args[1];
            			System.out.println(calcular.imprimirFactoresPrimos(formato));

        			}
        		}catch(InputMismatchException e){
        			System.out.println("Debe ingresar un numero entero");
        		}
			}
		}catch(ArrayIndexOutOfBoundsException e){
       		System.out.println("Debe ingresar los parametros correspondientes");
        }
    }	
}
