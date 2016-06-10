package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Imprimir {

	public String imprimirFactoresPrimos(int numero, String formato, String factoresPrimos, String orden){
		
		String imprimir;
		
		switch (formato.toLowerCase()){
		
			case ("pretty"):
				imprimir = imprimirEnFormatoPretty(numero, factoresPrimos, orden);
			break;
			
			case ("quiet"):
				imprimir = imprimirEnFormatoQuiet(factoresPrimos, orden);
			break;
			
			default:
				imprimir = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
			break;	
		}
			
		return imprimir;
	}
	

	private String imprimirEnFormatoPretty(int numeroRecibido, String factoresPrimos, String orden){
		
    	String imprimir = "";
    	
    	if (orden == "asc"){
    		
    		imprimir = "Factores primos " + numeroRecibido + ": " + factoresPrimos;
        	
    	}
    	else if (orden == "des"){
    		
    		imprimir = "Factores primos " + numeroRecibido + ": " + ordenDescendente(factoresPrimos);
    	}
    	
    	return imprimir;	
	}
	
	private String imprimirEnFormatoQuiet(String factoresPrimos, String orden){
		
    	String imprimir = "";
    	
    	if (orden == "asc"){
    		
    		imprimir = cadenaEnVertical(factoresPrimos);
    		
    	}
    	else if (orden == "des"){
    		
    		String primosDescendentes = ordenDescendente(factoresPrimos);
    		
    		imprimir = cadenaEnVertical(primosDescendentes);	
    		
    	}
    	
    	return imprimir;	
	}
	
	private String ordenDescendente(String factoresPrimos){
		
		String numerosInvertidos = "";
			
    	StringTokenizer cadena = new StringTokenizer(factoresPrimos);
    	Stack<String> pila = new Stack<String>();
    	while (cadena.hasMoreTokens()) {
    	
    		pila.push(cadena.nextToken());
    	}
    	while (!pila.empty()){
    		numerosInvertidos = numerosInvertidos.concat(pila.pop() + " ");		
    	
    	}
    	
		return numerosInvertidos;
	}
	
	private String cadenaEnVertical(String cadena){
		
		String cadenaEnVertical = "";
		
		for(int i = 0; i < cadena.length(); i ++){
    		
    		if (cadena.charAt(i) != ' '){
    			cadenaEnVertical = cadenaEnVertical.concat(cadena.charAt(i) + "\n");
    		}
    	
		}
		return cadenaEnVertical;
	}
	
	public void imprimirArchivo(String nombreArchivo, int numeroRecibido, String formato, String factoresPrimos, String orden){
		
		File txt = new File (nombreArchivo);
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(txt));
					
			PrintWriter escribir = new PrintWriter(bw); 
			escribir.write(imprimirFactoresPrimos(numeroRecibido, formato, factoresPrimos, orden));
			
			escribir.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
