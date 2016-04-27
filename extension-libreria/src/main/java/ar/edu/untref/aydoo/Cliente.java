package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Cliente {

	private String nombre;
	private String direccion;
	private List<Compra> listaDeCompras;
	private Mes [] arregloDeMeses;

	public Cliente(String nombre, String direccion) {
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.listaDeCompras = new LinkedList<Compra>();
		
		arregloDeMeses = new Mes[12];
		arregloDeMeses[0] = Mes.ENERO;
		arregloDeMeses[1] = Mes.FEBRERO;
		arregloDeMeses[2] = Mes.MARZO;
		arregloDeMeses[3] = Mes.ABRIL;
		arregloDeMeses[4] = Mes.MAYO;
		arregloDeMeses[5] = Mes.JUNIO;
		arregloDeMeses[6] = Mes.JULIO;
		arregloDeMeses[7] = Mes.AGOSTO;
		arregloDeMeses[8] = Mes.SEPTIEMBRE;
		arregloDeMeses[9] = Mes.OCTUBRE;
		arregloDeMeses[10] = Mes.NOVIEMBRE;
		arregloDeMeses[11] = Mes.DICIEMBRE;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String name) {
		this.nombre = name;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Compra> getListaDeCompras() {
		return listaDeCompras;
	}
	
	public void agregarCompra(Compra unaCompra){
		
		this.listaDeCompras.add(unaCompra);
			
		this.completarSuscripcion(unaCompra);
		
		this.completarAlquiler(unaCompra);
		
	}
	
	private void completarAlquiler(Compra unaCompra) {
		
		for(int i = 0; i < unaCompra.getListDeProductos().size(); i++){
			
			if(unaCompra.getListDeProductos().get(i) instanceof Alquiler){
				
				TipoAlquiler tipo;
				tipo = ((Alquiler)unaCompra.getListDeProductos().get(i)).getTipoDeAlquiler();				
				
				@SuppressWarnings("unused")
				int cantidad = 0;
				switch(tipo){
					
					case MENSUAL:
						cantidad = ((Alquiler)unaCompra.getListDeProductos().get(i)).getCantidad();
					break;
					case CUATRIMESTRAL:
						cantidad = (((Alquiler)unaCompra.getListDeProductos().get(i)).getCantidad())*4;
					break;
				default:
					break;
					
				}
				
				int nroDeMes = 0;
				for (int nroMes = 0; nroMes < arregloDeMeses.length; nroMes++){
					if(arregloDeMeses[nroMes]== unaCompra.getMes()){
						nroDeMes = nroMes;
					}
				}
				
				for (int j = nroDeMes + 1; j < arregloDeMeses.length; j++){
						
					Compra otraCompra = new Compra(arregloDeMeses[j]);
					otraCompra.agregarProducto(unaCompra.getListDeProductos().get(i));
					listaDeCompras.add(otraCompra);
					cantidad --; 
				}
			}
		}	
	}

	private void completarSuscripcion(Compra unaCompra){
		
		for(int i = 0; i < unaCompra.getListDeProductos().size(); i++){
			
			if(unaCompra.getListDeProductos().get(i) instanceof SuscripcionAnual){
				
				for (int j = 0; j < arregloDeMeses.length; j++){
					
					if(arregloDeMeses[j] == unaCompra.getMes() && j++ < arregloDeMeses.length){
						j++;
					}
					Compra otraCompra = new Compra(arregloDeMeses[j]);
					otraCompra.agregarProducto(unaCompra.getListDeProductos().get(i));
					listaDeCompras.add(otraCompra);
				}
			}
		}
	}
	
}
