package modelo;

import java.util.ArrayList;
import java.util.Map;

public class Factura {
	
	private Map<String,Boolean> pagosServicios;
	private ArrayList<String> serviciosTomados;
	private Map<String,Integer> precioServicio;
	private Map<String,Boolean> servicioRecibido;
	private int precioTotal;
	private boolean paziSalvo;
	
	public Factura(Map<String,Boolean> serv, ArrayList<String> ser, Map<String,Integer> precios, int pt ) {
		pagosServicios=serv;
		serviciosTomados=ser;
		precioServicio=precios;
		precioTotal=pt;
		paziSalvo=false;
	}
	
	public void aniadirServicio(String servicio, Boolean pago, int precio, boolean recibido) {
		
		pagosServicios.put(servicio,pago);
		serviciosTomados.add(servicio);
		precioServicio.put(servicio, precio);
		servicioRecibido.put(servicio, recibido);
		addprecio(precio);
		
	}
	
	public void addprecio(int precio) {
		precioTotal+=precio;
	}
	
	public void eliminarServicio(String servicio) {
		
		if (servicioRecibido.get(servicio) & !pagosServicios.get(servicio)) {
			precioTotal-=precioServicio.get(servicio);
			pagosServicios.remove(servicio);
			serviciosTomados.remove(servicio);
			precioServicio.remove(servicio);
		}
		
	}
	
	public void evaluarpazysalvo() {
		
		paziSalvo=true;
		
		for (Boolean valor : pagosServicios.values()) {
		    if (!valor){
		    	paziSalvo=false;
		    }
		}
	}
	
	public Map<String, Boolean> getPagosServicios() {
		return pagosServicios;
	}
	public void setPagosServicios(Map<String, Boolean> pagosServicios) {
		this.pagosServicios = pagosServicios;
		}
	
	
	public Map<String, Integer> getPrecioServicio() {
		return precioServicio;
	}

	public void setPrecioServicio(Map<String, Integer> precioServicio) {
		this.precioServicio = precioServicio;
	}

	public ArrayList<String> getServiciosTomados() {
		return serviciosTomados;
	}
	public void setServiciosTomados(ArrayList<String> serviciosTomados) {
		this.serviciosTomados = serviciosTomados;
	}
	public int getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	public boolean isPaziSalvo() {
		return paziSalvo;
	}
	public void setPaziSalvo(boolean paziSalvo) {
		this.paziSalvo = paziSalvo;
	}
	
}
