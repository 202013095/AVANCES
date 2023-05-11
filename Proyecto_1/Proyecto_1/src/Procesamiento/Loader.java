package Procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.Adicion;
import modelo.Cama;
import modelo.Habitacion;
import modelo.ItemMenu;
import modelo.Usuario;

public class Loader
{
		
	public static Map<String, Adicion> cargarAdiciones() throws IOException
	{
		Map<String, Adicion> adiciones = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\Downloads\\Proyecto_1\\Proyecto_1\\data\\adiciones"));
		
		String linea = br.readLine();
		while (linea != null) 
		{
			String[] partes = linea.split(";");

			String nombre = partes[0];
			float precio = Float.valueOf(partes[1]);
				
			Adicion laAdicion = adiciones.get(nombre);
				
			if (laAdicion == null)
			{
				laAdicion = new Adicion(nombre, precio);
				adiciones.put(nombre, laAdicion);	
			}
			
			linea = br.readLine(); 
		}
		br.close();
		
		//System.out.println(adiciones.keySet());
		//System.out.println(adiciones.get("TV").getPrecio());
		
		return adiciones;
	}
	
	public static Map<String, Cama> cargarCamas() throws IOException
	{
		Map<String, Cama> camas = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\Downloads\\Proyecto_1\\Proyecto_1\\data\\camas"));
		
		String linea = br.readLine();
		while (linea != null) 
		{
			String[] partes = linea.split(";");

			String nombre = partes[0];
			float precio = Float.valueOf(partes[1]);
			int capacidad = Integer.parseInt(partes[2]);
				
			Cama laCama = camas.get(nombre);					
			
			if (laCama == null){
				laCama = new Cama(nombre, capacidad, precio);
				camas.put(nombre, laCama);
			}
			
			linea = br.readLine();
		}
		br.close();
		
		//System.out.println(camas.keySet());
		//System.out.println(camas.get("Doble").getCapacidad());
		
		return camas;
	}
	
	public static void cargarHabitaciones() throws FileNotFoundException, IOException
	{
		Map<Integer, Habitacion> habitaciones = new HashMap<>();
	
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\Downloads\\Proyecto_1\\Proyecto_1\\data\\habitaciones"));
	
		String linea = br.readLine();
		while (linea != null) 
		{
			String[] partes = linea.split(";");
					
			int id = Integer.parseInt(partes[0]);
			String tipo = partes[1];
			float precioBase = Float.valueOf(partes[2]);
			int capacidad = 0;
			int capacidadKids = 0;
			float precioFinal = precioBase;

			ArrayList<Cama> listaCamas = new ArrayList<>();
			ArrayList<Adicion> listaAdiciones = new ArrayList<>();
			
			Habitacion laHabitacion = habitaciones.get(id);
			
			String[] camas = partes[3].split(",");
			
			for (String cama : camas) 
			{
				listaCamas.add(cargarCamas().get(cama));
				capacidad+=cargarCamas().get(cama).getCapacidad();
				precioFinal+=cargarCamas().get(cama).getPrecio();
			}
			
			String[] kids = partes[4].split(",");
			
			for (String kid : kids) 
			{
				if (kid!="") 
				{
					capacidadKids++;
				}
				
			}
			
			String[] adiciones = partes[5].split(",");
			
			for (String adicion : adiciones) 
			{
				listaAdiciones.add(cargarAdiciones().get(adicion));
				precioFinal+=cargarAdiciones().get(adicion).getPrecio();
			}
			
			//Crea la habitacion
			if (laHabitacion == null)
			{
				laHabitacion = new Habitacion(id, tipo, listaCamas, listaAdiciones, capacidad, capacidadKids, precioBase, precioFinal);
				habitaciones.put(id, laHabitacion);
			}
			
			linea = br.readLine(); 

		} 
		br.close();
		System.out.println(habitaciones.keySet());
		System.out.println(habitaciones.get(3).getPrecioFinal());
		System.out.println(habitaciones.get(3).getCapacidad());
		System.out.println(habitaciones.get(16).getCapacidadKids());
	}

	public static ArrayList<List<String>> cargarDescuentos() throws IOException
	{
		ArrayList<List<String>> info = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\Downloads\\Proyecto_1\\Proyecto_1\\data\\descuento"));
		
		String linea = br.readLine();
		while (linea != null) 
		{
			List<String> datos = new ArrayList<>();
			
			String[] partes = linea.split(";");

			String fechaInit = partes[0];
			String fechaFinit = partes[1];
			String descuento = partes[2];					
			
			datos.add(fechaInit);
			datos.add(fechaFinit);
			datos.add(descuento);
			
			info.add(datos);
			
			linea = br.readLine();
		}
		br.close();
		//System.out.println(info.size());
		return info;
	}
	
	public static Map<String, String> cargarPlatosyBebidas() throws IOException
	{
		Map<String, String> info = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\Downloads\\Proyecto_1\\Proyecto_1\\data\\platos"));
		
		String linea = br.readLine();
		while (linea != null) 
		{
			
			String[] partes = linea.split(";");
			
			String nombre = partes[0];
			String contrasena = partes[1];
			String nombre = partes[2];
			String tipoUsuario = partes[3];
			String correo = partes[4];
			
		
		}
		br.close();
		//System.out.println(info.size());
		return info;
	}
	
	
	public static Map<String, Usuario> cargarUsuarios() throws IOException
	{
		Map<String, Usuario> usuarios = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\Downloads\\Proyecto_1\\Proyecto_1\\data\\usuarios"));
		
		String linea = br.readLine();
		while (linea != null) 
		{
			String[] partes = linea.split(";");

			String login = partes[0];
			String contrasena = partes[1];
			String nombre = partes[2];
			String tipoUsuario = partes[3];
			String correo = partes[4];
			
				
			Usuario elUsuario = usuarios.get(login);
				
			if (elUsuario == null)
			{
				elUsuario = new Usuario(login, contrasena, nombre, tipoUsuario, correo);
				usuarios.put(login, elUsuario);	
			}
			
			linea = br.readLine(); 
		}
		br.close();
		
		//System.out.println(usuarios.keySet());
		//System.out.println(usuarios.get("jslin").getNombre());
		
		return usuarios;
	}
	
	public static Map<String,ItemMenu> cargarPlatosBebidas() throws IOException
	{
		Map<String,ItemMenu> items = new HashMap<>();
		
BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\Downloads\\Proyecto_1\\Proyecto_1\\data\\platos"));
		
		String linea = br.readLine();
		while (linea != null) 
		{
			String[] partes = linea.split(";");

			String nombre = partes[0];
			int precio = Integer.parseInt(partes[1]);
			String habitacion = partes[2];
			String tipo = partes[3];
			
			ItemMenu Item = new ItemMenu(nombre,habitacion,tipo,precio);
			
			items.put(nombre,Item);
			
			linea = br.readLine(); 
		}
		br.close();
		
		
		return items;
	}
	
}
