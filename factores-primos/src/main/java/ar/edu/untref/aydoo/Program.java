package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program 
{
	
    public static final void main(String args[])
    {
    	int numeroIngresado = Integer.parseInt(args[0]);
    	int numeroRecibido;
    	FactoresPrimos calcular = new FactoresPrimos();
    	
        if(args.length > 2){
        	System.out.println("Hay demasiados parametros");
        }
        else if(args.length == 0){
        	System.out.println("Debe ingresar los parametros correspondientes");
        }
        try{
        	
        	if (numeroIngresado < 2){
        		System.out.println("Debe ingresar un numero mayor que 1");
        	}{
            	numeroRecibido = numeroIngresado;
            	calcular.calcularPrimos(numeroRecibido);
            	calcular.calcularFactoresPrimos(numeroRecibido);
            	System.out.println("Factores primos " + numeroRecibido + ":" + 
            	calcular.imprimirFactoresPrimos());

        	}
        }catch(InputMismatchException e){
        	System.out.println("Debe ingresar un numero entero");
        }
    }	
}
