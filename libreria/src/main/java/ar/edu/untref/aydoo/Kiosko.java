package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;


public class Kiosko {
	
    private List<Cliente> clientes;
	
	public Kiosko(){
		
		clientes = new ArrayList<Cliente>();
	}
	
	public void agregarCliente(Cliente unCliente) {
		clientes.add(unCliente);
	}

	public String calcularMontoACobrar(String mes, Cliente cliente) {
		
		Cliente clientePedido = null;
		List <Compra> compras = new ArrayList<>();
		List <Double> valores = new ArrayList<>();
		double montoTotal = 0;
		
		//Verifica si existe el cliente
		for (int i = 0; i < clientes.size(); i++){
			
			if (cliente == clientes.get(i)){
				clientePedido = clientes.get(i);	
			}
		}
				
		compras = clientePedido.getCompras();
		
		for(int i = 0; i < compras.size(); i++){
			
			if (compras.get(i).getMesCompra() == mes){
				
				valores.add(compras.get(i).getValor());
				montoTotal += compras.get(i).getValor();
				
			}
		}
		  
		return mensaje(valores, montoTotal, mes);
	}
	
	private String mensaje(List <Double> valores, double montoTotal, String mes){
		String mensaje;
		String precios = "";
		
		if ( valores == null){
			mensaje = "Cliente no encontrado";
		}
		else{
			for( int i = 0; i < valores.size(); i ++){
				if (i == valores.size()-1){
					precios += " " + valores.get(i); 
				}else{
					precios += " " + valores.get(i) + " " + "+";
				
				}
			}
			
			mensaje = "Monto a cobrarle por " + mes.toLowerCase() + ":" + precios + " = $" + montoTotal;
		}	
		return mensaje;
	}
}
