package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelHabitaciones extends  JPanel{
	
	private JPanel jpVerHabitaciones;
	private JPanel jpmodificarHabitaciones;
	private JLabel[][] tableroLabel;
	
	private JLabel lbCamas;
	private JLabel lbAdiciones;
	
	private JButton btEditar;
	private JButton btGuardar;
	private JButton btCrearNuevaTarifa;
	private JButton btInhabilitar;
	private JTextField textSencilla;
	private JTextField textDoble;
	private JTextField textQueen;
	private JTextField textKing;
	private JTextField textKids;
	private JRadioButton btSencilla;
	private JRadioButton btDoble;
	private JRadioButton btQueen;
	private JRadioButton btKing;
	private JRadioButton btKids;
	private JRadioButton btTv;
	private JRadioButton btBalcon;
	private JRadioButton btCocina;
	private JRadioButton btNevera;
	private JRadioButton btSofa;

	

	
	public PanelHabitaciones() 
	{	
		Color Azul = new Color(40, 130, 255);
		Color Verde = new Color(100, 200, 70);
		Color Rojo = new Color(200, 50, 50);


		setBorder(BorderFactory.createTitledBorder(""));
        setPreferredSize(new Dimension(550, 450));
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Azul));        
		setLayout(new BorderLayout());
		
		//-----------------PANELES-----------------//
		jpVerHabitaciones = new JPanel();
		jpmodificarHabitaciones = new JPanel();
		
		//-----------------PANEL 1-----------------//
		jpVerHabitaciones.setBorder(BorderFactory.createTitledBorder("Ver Habitaciones"));
		jpVerHabitaciones.setPreferredSize(new Dimension(270, 170));
		jpVerHabitaciones.setBackground(Color.WHITE);
		jpVerHabitaciones.setLayout(new GridLayout(10,10));
		
		tableroLabel = new JLabel[10][10];
					                       		       
        for (int i = 0; i < 10; i++)
			for (int ii = 0; ii < 10; ii++)
			{
				JLabel habitacion = new JLabel(""+i+ii);				
				habitacion.setPreferredSize(new Dimension(270/10, 270/10));				
				//habitacion.addMouseListener(this);	
				habitacion.setBackground(Color.WHITE);
				//habitacion.setForeground(Azul);
				habitacion.setBorder(BorderFactory.createLineBorder(Color.black));

				habitacion.setOpaque(true);
				tableroLabel[i][ii] = habitacion;		        
				jpVerHabitaciones.add(habitacion);
			}
        
        
		//-----------------PANEL 2-----------------//
        jpmodificarHabitaciones.setBorder(BorderFactory.createTitledBorder("Modificar Habitaciones"));
        jpmodificarHabitaciones.setPreferredSize(new Dimension(540, 150));
        jpmodificarHabitaciones.setBackground(Color.WHITE);
        //jpmodificarHabitaciones.setLayout(new GridLayout(10,10));               
        
        lbCamas = new JLabel("Camas y cantidad");
        lbCamas.setPreferredSize(new Dimension(500, 15));
        lbCamas.setForeground(Azul);
        
        lbAdiciones = new JLabel("Adiciones");
        lbAdiciones.setPreferredSize(new Dimension(500, 15));
        lbAdiciones.setForeground(Azul);
        
        btSencilla = new JRadioButton("Sencilla",false);
        btSencilla.setPreferredSize(new Dimension(65, 20));
        btSencilla.setBorder(BorderFactory.createLineBorder(Azul));
        btSencilla.setBackground(Color.WHITE);
        btSencilla.setForeground(Azul);

        textSencilla = new JTextField();
        textSencilla.setPreferredSize(new Dimension(35, 20));
        textSencilla.setBorder(BorderFactory.createLineBorder(Azul));
		
        btDoble = new JRadioButton("Doble",false);
        btDoble.setPreferredSize(new Dimension(60, 20));
        btDoble.setBorder(BorderFactory.createLineBorder(Azul));
        btDoble.setBackground(Color.WHITE);
        btDoble.setForeground(Azul);
		
        textDoble = new JTextField();
        textDoble.setPreferredSize(new Dimension(35, 20));
        textDoble.setBorder(BorderFactory.createLineBorder(Azul));		
        
		btQueen = new JRadioButton("Queen",false);
		btQueen.setPreferredSize(new Dimension(60, 20));
		btQueen.setBorder(BorderFactory.createLineBorder(Azul));
		btQueen.setBackground(Color.WHITE);
		btQueen.setForeground(Azul);

		textQueen = new JTextField();
		textQueen.setPreferredSize(new Dimension(35, 20));
		textQueen.setBorder(BorderFactory.createLineBorder(Azul));		
		
		btKing = new JRadioButton("King",false);
		btKing.setPreferredSize(new Dimension(50, 20));
		btKing.setBorder(BorderFactory.createLineBorder(Azul));
		btKing.setBackground(Color.WHITE);
		btKing.setForeground(Azul);
		
		textKing = new JTextField();
		textKing.setPreferredSize(new Dimension(35, 20));
		textKing.setBorder(BorderFactory.createLineBorder(Azul));			
		
		btKids = new JRadioButton("Kids",false);
		btKids.setPreferredSize(new Dimension(50, 20));
		btKids.setBorder(BorderFactory.createLineBorder(Azul));
		btKids.setBackground(Color.WHITE);
		btKids.setForeground(Azul);
		
		textKids = new JTextField();
		textKids.setPreferredSize(new Dimension(35, 20));
		textKids.setBorder(BorderFactory.createLineBorder(Azul));			
		
		
		
		btTv = new JRadioButton("Tv",false);
		btTv.setPreferredSize(new Dimension(50, 20));
		btTv.setBorder(BorderFactory.createLineBorder(Azul));
		btTv.setBackground(Color.WHITE);
		btTv.setForeground(Azul);
		
		btBalcon = new JRadioButton("Balcon",false);
		btBalcon.setPreferredSize(new Dimension(60, 20));
		btBalcon.setBorder(BorderFactory.createLineBorder(Azul));
		btBalcon.setBackground(Color.WHITE);
		btBalcon.setForeground(Azul);
		
		btCocina = new JRadioButton("Cocina",false);
		btCocina.setPreferredSize(new Dimension(60, 20));
		btCocina.setBorder(BorderFactory.createLineBorder(Azul));
		btCocina.setBackground(Color.WHITE);
		btCocina.setForeground(Azul);
		
		btNevera = new JRadioButton("Nevera",false);
		btNevera.setPreferredSize(new Dimension(65, 20));
		btNevera.setBorder(BorderFactory.createLineBorder(Azul));
		btNevera.setBackground(Color.WHITE);
		btNevera.setForeground(Azul);
		
		btSofa = new JRadioButton("Sofa",false);
		btSofa.setPreferredSize(new Dimension(60, 20));
		btSofa.setBorder(BorderFactory.createLineBorder(Azul));
		btSofa.setBackground(Color.WHITE);
		btSofa.setForeground(Azul);
		
		
		btEditar = new JButton("Editar");
		btEditar.setForeground(Color.WHITE);
		btEditar.setBackground(Azul.darker());

		btGuardar = new JButton("Guardar");
		btGuardar.setForeground(Color.WHITE);
		btGuardar.setBackground(Azul);

		btCrearNuevaTarifa = new JButton("Crear Nueva Tarifa");
		btCrearNuevaTarifa.setForeground(Color.WHITE);
		btCrearNuevaTarifa.setBackground(Verde);

		btInhabilitar = new JButton("Inhabilitar habitación");
		btInhabilitar.setForeground(Color.WHITE);
		btInhabilitar.setBackground(Rojo);
		
		jpmodificarHabitaciones.add(lbCamas);
		jpmodificarHabitaciones.add(btSencilla);
		jpmodificarHabitaciones.add(textSencilla);
		jpmodificarHabitaciones.add(btDoble);
		jpmodificarHabitaciones.add(textDoble);
		jpmodificarHabitaciones.add(btQueen);
		jpmodificarHabitaciones.add(textQueen);
		jpmodificarHabitaciones.add(btKing);
		jpmodificarHabitaciones.add(textKing);
		jpmodificarHabitaciones.add(btKids);
		jpmodificarHabitaciones.add(textKids);
		
		jpmodificarHabitaciones.add(lbAdiciones);
		jpmodificarHabitaciones.add(btTv);
		jpmodificarHabitaciones.add(btBalcon);
		jpmodificarHabitaciones.add(btCocina);
		jpmodificarHabitaciones.add(btNevera);
		jpmodificarHabitaciones.add(btSofa);
		
		jpmodificarHabitaciones.add(btEditar);
		jpmodificarHabitaciones.add(btGuardar);
		//jpmodificarHabitaciones.add(btCrearNuevaTarifa);
		jpmodificarHabitaciones.add(btInhabilitar);
		
		add(jpVerHabitaciones, BorderLayout.CENTER);
		add(jpmodificarHabitaciones, BorderLayout.SOUTH);
	}

}
