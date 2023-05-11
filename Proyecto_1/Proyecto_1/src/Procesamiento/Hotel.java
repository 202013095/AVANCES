package Procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import modelo.Adicion;
import modelo.Administrador;
import modelo.Habitacion;
import modelo.ItemMenu;
import modelo.Usuario;

	public class Hotel
	{

		/*Attributes*/
		
		private Map <String, Habitacion> habitaciones;
		private Map <String, Usuario> usuario;
		private Map <String, Adicion> adicion;
		private Map <String, ItemMenu> menu;
		private Usuario ActualUser;

		/*Constructors*/
		
		public Hotel () throws IOException
		{
			this.habitaciones = null;
			this.usuario = Loader.cargarUsuarios();
			this.menu = Loader.cargarPlatosyBebidas();
			this.adicion= null;
		}
		
		
		public Map<String, Usuario> getUsuario() {
			return usuario;
		}

		public void setUsuario(Map<String, Usuario> usuario) {
			this.usuario = usuario;
		}

		/*Login*/
		public String comparelogin(String logininput, String pass) {
			String booli= null;
			
			for (int i = 0; i < usuario.size(); i++) {
				Usuario userinfo =usuario.get(i);
				if ((userinfo.getLogin().equals(logininput))&(userinfo.getPassword().equals(pass))){
					booli= userinfo.getNombre();
					ActualUser=userinfo;
				}
			}
			return booli;
		}
		
		/*EMPLEADDO MENU*/
		

		
		/*Mostrar opciones USUARIOS*/
		
		public int conocerUsuario() {
			int menu=0;
			if (ActualUser.getTipoUsuario().equals("admin")){
				menu=1;
			}
			else if (ActualUser.getTipoUsuario().equals("recepcionista")){
				menu=2;
			}
			else if (ActualUser.getTipoUsuario().equals("empleado")){
				menu=3;
			}
			return menu;
		}
		
		public String[] mostrarMenu() {
			return ActualUser.ShowOptions();			
		}
	
		
		public void OpcionesAdmin (int input){ 
			
			if (input==1) {
				Administrador.modificarPrecioHabitaciones();	
			}
			else if (input==2) {
				Administrador.modificarPrecioUnaHabitacion();	
			}
			
			else if (input==3) {
				Administrador.AdicionesHabitaciones();	
			}
			else if (input==4) {
				Administrador.CamasEnHabitacines();	
			}
			else if (input==5) {
				Administrador.PrecioHabitaciones();	
			}
			else if (input==6) {
				Administrador.AgrgarHabitacion();	
			}
			else if (input==7) {
				Administrador.GuardarCambios();	
			}
			else if (input==8) {
				Administrador.ReturnOptionInput(5);	
			}
			
		}
		
	public void OpcionesRecepcionista (int input){ 
			
			if (input==1) {	
				System.out.println("Falta implementacion");
			}
			else if (input==2) {	
				System.out.println("Falta implementacion");
			}
			
			else if (input==3) {
				System.out.println("Falta implementacion");
			}
			else if (input==4) {
				System.out.println("Falta implementacion");
			}
			else if (input==5) {
				System.out.println("Falta implementacion");
	
			}
			else if (input==6) {	
				System.out.println("Falta implementacion");
			}
			else if (input==7) {
				System.out.println("Falta implementacion");
			}
			else if (input==8) {
				System.out.println("Falta implementacion");
			}
			
		}
	
	public void OpcionesEmpleado (int input){ 
		
		if (input==1) {	
			System.out.println("Falta implementacion");
		}
		else if (input==2) {	
			System.out.println("Falta implementacion");
		}
		
		else if (input==3) {
			System.out.println("Falta implementacion");
		}
		else if (input==4) {
			System.out.println("Falta implementacion");
		}
		else if (input==5) {
			System.out.println("Falta implementacion");

		}
		else if (input==6) {
			System.out.println("Falta implementacion");
		}
		else if (input==7) {
			System.out.println("Falta implementacion");
		}
		else if (input==8) {	
			System.out.println("Falta implementacion");
		}
		
	}

}
	



