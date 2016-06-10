package ar.edu.untref.aydoo;


public class Program {
	
    public static final void main(String args[]){
    	
    	int numeroRecibido = Integer.parseInt(args[0]);
    	
    	String formato = "pretty";
    	String orden = "asc";
    	String nombreArchivo = null;
    	
        for (int i = 1; i < args.length; i++){
        	
        	if(args[i].startsWith("--fortmat=")){
        		
        		formato = args[i].substring(9);
        	}
        			
        	else if(args[i].startsWith("--sort:")){
        		orden = args[i].substring(7);
               	
        	}
        	else if(args[i].startsWith("--output-file=")){
        		nombreArchivo = args[i].substring(14);
       
        	}
        }
    	
    	if (numeroRecibido > 1){
    		
    		FactoresPrimos calcular = new FactoresPrimos();
        	
            calcular.calcularPrimos(numeroRecibido);
            
            Imprimir imprimirNumeros = new Imprimir();
            
            if(nombreArchivo != null){
            	
            	imprimirNumeros.imprimirArchivo(nombreArchivo,
            									numeroRecibido, 
            									formato,
            									calcular.calcularFactoresPrimos(numeroRecibido),
            									orden);
            }else{
            	
            	System.out.println(imprimirNumeros.imprimirFactoresPrimos(numeroRecibido, 
            																formato, 
            																calcular.calcularFactoresPrimos(numeroRecibido), 
            																orden));
            }
    	}
    	else{
    		System.out.println("No puede calcularse los factores primos de un numero menor a 1");
    	}
    	
		
    }	
}