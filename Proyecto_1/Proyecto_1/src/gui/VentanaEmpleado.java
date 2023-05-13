package gui;

import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;

import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;

import Procesamiento.Hotel;
import modelo.ItemMenu;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class VentanaEmpleado extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public VentanaEmpleado(Hotel hotel) {
		
		//atributos
		
		int pago=0;
		
		//GUI
		setResizable(false);
		setTitle("EMPLEADO");
		getContentPane().setLayout(null);
		
		JPanel panelBusquedaFactura = new JPanel();
		panelBusquedaFactura.setLayout(null);
		panelBusquedaFactura.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		panelBusquedaFactura.setBorder(new TitledBorder(new LineBorder(new Color(0, 120, 215), 1, true), "BUSCAR FACTURA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 120, 215)));
		panelBusquedaFactura.setBounds(10, 51, 275, 177);
		getContentPane().add(panelBusquedaFactura);
		
		textField = new JTextField();
		textField.setForeground(SystemColor.textHighlight);
		textField.setColumns(10);
		textField.setBounds(26, 95, 223, 20);
		panelBusquedaFactura.add(textField);
		
		JLabel lblNewLabel = new JLabel("Buscar Habitacion");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel.setBounds(26, 126, 91, 15);
		panelBusquedaFactura.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar Nombre");
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(26, 25, 78, 15);
		panelBusquedaFactura.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setForeground(SystemColor.textHighlight);
		textField_1.setColumns(10);
		textField_1.setBounds(26, 44, 223, 20);
		panelBusquedaFactura.add(textField_1);
		
		JLabel lblBuscarMiembro = new JLabel("Buscar Miembro");
		lblBuscarMiembro.setForeground(SystemColor.textHighlight);
		lblBuscarMiembro.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblBuscarMiembro.setBounds(26, 75, 83, 15);
		panelBusquedaFactura.add(lblBuscarMiembro);
		
		textField_2 = new JTextField();
		textField_2.setForeground(SystemColor.textHighlight);
		textField_2.setColumns(10);
		textField_2.setBounds(26, 143, 91, 20);
		panelBusquedaFactura.add(textField_2);
		
		JButton btnNewButton = new JButton("BUSCAR FACTURA");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(132, 142, 117, 23);
		panelBusquedaFactura.add(btnNewButton);
		
		JPanel panelSeleccionFactura = new JPanel();
		panelSeleccionFactura.setLayout(null);
		panelSeleccionFactura.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		panelSeleccionFactura.setBorder(new TitledBorder(new LineBorder(new Color(0, 120, 215), 1, true), "SELECCIONAR FACTURA", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
		panelSeleccionFactura.setBounds(10, 231, 275, 332);
		getContentPane().add(panelSeleccionFactura);
		
		JScrollPane Facturas = new JScrollPane();
		Facturas.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Facturas.setToolTipText("sdfsdf");
		Facturas.setBounds(20, 23, 234, 264);
		panelSeleccionFactura.add(Facturas);
		
		JButton btnSeleccionar = new JButton("SELECCIONAR");
		btnSeleccionar.setForeground(Color.WHITE);
		btnSeleccionar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnSeleccionar.setBorder(null);
		btnSeleccionar.setBackground(SystemColor.textHighlight);
		btnSeleccionar.setBounds(137, 298, 117, 23);
		panelSeleccionFactura.add(btnSeleccionar);
		
		JPanel panelAdicionServicio = new JPanel();
		panelAdicionServicio.setBorder(new TitledBorder(new LineBorder(new Color(0, 120, 215), 1, true), "AGREGAR SERVICIO", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
		panelAdicionServicio.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		panelAdicionServicio.setBounds(289, 51, 436, 512);
		getContentPane().add(panelAdicionServicio);
		panelAdicionServicio.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setBounds(24, 25, 50, 15);
		lblNewLabel_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		panelAdicionServicio.add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setForeground(SystemColor.textHighlight);
		textField_3.setColumns(10);
		textField_3.setBounds(24, 44, 274, 20);
		panelAdicionServicio.add(textField_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Habitacion");
		lblNewLabel_1_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBounds(308, 25, 89, 15);
		panelAdicionServicio.add(lblNewLabel_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setForeground(SystemColor.textHighlight);
		textField_4.setColumns(10);
		textField_4.setBounds(308, 44, 99, 20);
		panelAdicionServicio.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Miembros del Grupo");
		lblNewLabel_1_1_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBounds(24, 75, 191, 15);
		panelAdicionServicio.add(lblNewLabel_1_1_1_1);
		
		JScrollPane Facturas_1 = new JScrollPane();
		Facturas_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Facturas_1.setToolTipText("sdfsdf");
		Facturas_1.setBounds(24, 97, 383, 58);
		panelAdicionServicio.add(Facturas_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Servicios adquiridos");
		lblNewLabel_1_1_1_1_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_1.setBounds(24, 380, 191, 15);
		panelAdicionServicio.add(lblNewLabel_1_1_1_1_1);
		
		JScrollPane ServiciosAdquiridos = new JScrollPane();
		ServiciosAdquiridos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ServiciosAdquiridos.setBounds(24, 402, 383, 58);
		
	
		//BOTON GUARDAR EN FACTURAS
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnGuardar.setBorder(null);
		btnGuardar.setBackground(new Color(154, 205, 50));
		btnGuardar.setBounds(290, 471, 117, 23);
		panelAdicionServicio.add(btnGuardar);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Servicios");
		lblNewLabel_1_1_1_1_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_1_1_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1_2.setBounds(24, 166, 191, 15);
		panelAdicionServicio.add(lblNewLabel_1_1_1_1_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(24, 185, 383, 184);
		panelAdicionServicio.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(50, 205, 50));
		tabbedPane.addTab("Restaurante", null, panel_1, null);
		panel_1.setLayout(null);
		
		//TEXTO DEL PRECIO
		
		JFormattedTextField precioTxt = new JFormattedTextField();
		precioTxt.setEditable(false);
		precioTxt.setBounds(62, 37, 93, 20);
		panel_1.add(precioTxt);
		
		
		//PANEL PLATOS
		
		JComboBox<String> comboBox = new JComboBox();
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				Object opcionSeleccionadaObj = comboBox.getSelectedItem();
				if (opcionSeleccionadaObj != null) {
				    precioTxt.setText(String.valueOf(hotel.getPrecioPlato(opcionSeleccionadaObj.toString())));
				} 
			}
		});
		comboBox.setBounds(10, 86, 358, 23);
		
	//CODIGO DE PLATOS 
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
	
		ArrayList<String> elementos = new ArrayList<>();
		
		for (int i = 0; i < hotel.getMenuFull().size(); i++) {
		    String elemento = hotel.getMenuFull().get(i);
		    elementos.add(elemento);}
		    
		    comboBoxModel.addAll(elementos);
		    comboBox.setModel(comboBoxModel);
		
		//FILTRO MENU HABITACION
		
		//Botonplatospara habitacion
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Habitacion");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				if (rdbtnNewRadioButton.isSelected()) {
					
					DefaultComboBoxModel<String> comboBoxModel2 = new DefaultComboBoxModel<>();
					ArrayList<String> elementos2 = new ArrayList<>();
					
					for (int i = 0; i < hotel.getMenuHabitacion().size(); i++) {
					    String elemento =  hotel.getMenuHabitacion().get(i);
					    elementos2.add(elemento);
					    }
					comboBoxModel2.addAll(elementos2);
					comboBox.setModel(comboBoxModel2);
				}
				
				else {
					
					DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
					
					ArrayList<String> elementos = new ArrayList<>();
					
					for (int i = 0; i < hotel.getMenuFull().size(); i++) {
					    String elemento = hotel.getMenuFull().get(i);
					    elementos.add(elemento);}
					    
					    comboBoxModel.addAll(elementos);
					    comboBox.setModel(comboBoxModel);
					
				}
				
			}
		});
		rdbtnNewRadioButton.setBounds(96, 7, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		
		
		panel_1.add(comboBox);
		
		//BOTON PAGO
		JRadioButton btnPago = new JRadioButton("Pago");
		btnPago.setBounds(214, 7, 109, 23);
		panel_1.add(btnPago);
		
		
		
		
		
		
		JLabel lblPlatos = new JLabel("Platos");
		lblPlatos.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblPlatos.setForeground(SystemColor.textHighlight);
		lblPlatos.setBounds(10, 61, 109, 14);
		panel_1.add(lblPlatos);
		
		JLabel lblNewLabel_3_1 = new JLabel("Caracteristicas");
		lblNewLabel_3_1.setForeground(SystemColor.textHighlight);
		lblNewLabel_3_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblNewLabel_3_1.setBounds(10, 10, 109, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JButton btnSeleccionar_1_1 = new JButton("AGREGAR");
		btnSeleccionar_1_1.setForeground(Color.WHITE);
		btnSeleccionar_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnSeleccionar_1_1.setBorder(null);
		btnSeleccionar_1_1.setBackground(new Color(30, 144, 255));
		btnSeleccionar_1_1.setBounds(251, 122, 117, 23);
		panel_1.add(btnSeleccionar_1_1);
		
	
		
		JLabel lblDiadd_1_1_1_2_1_1 = new JLabel("Precio");
		lblDiadd_1_1_1_2_1_1.setForeground(SystemColor.textHighlight);
		lblDiadd_1_1_1_2_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblDiadd_1_1_1_2_1_1.setBounds(10, 37, 73, 15);
		panel_1.add(lblDiadd_1_1_1_2_1_1);
		
		JButton btnSeleccionar_1_1_2 = new JButton("AGREGAR");
		btnSeleccionar_1_1_2.setForeground(Color.WHITE);
		btnSeleccionar_1_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnSeleccionar_1_1_2.setBorder(null);
		btnSeleccionar_1_1_2.setBackground(new Color(30, 144, 255));
		btnSeleccionar_1_1_2.setBounds(125, 123, 117, 23);
		panel_1.add(btnSeleccionar_1_1_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Spa", null, panel_2, null);
		panel_2.setLayout(null);
		
		JRadioButton btnPago_1 = new JRadioButton("Pago");
		btnPago_1.setBounds(93, 6, 49, 23);
		panel_2.add(btnPago_1);
		
		JLabel lblHoraYDia = new JLabel("Hora y dia");
		lblHoraYDia.setBounds(10, 35, 73, 15);
		lblHoraYDia.setForeground(SystemColor.textHighlight);
		lblHoraYDia.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		panel_2.add(lblHoraYDia);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Caracteristicas");
		lblNewLabel_3_1_2.setBounds(10, 9, 73, 15);
		lblNewLabel_3_1_2.setForeground(SystemColor.textHighlight);
		lblNewLabel_3_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		panel_2.add(lblNewLabel_3_1_2);
		
		JButton btnSeleccionar_1_1_1 = new JButton("AGREGAR");
		btnSeleccionar_1_1_1.setForeground(Color.WHITE);
		btnSeleccionar_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnSeleccionar_1_1_1.setBorder(null);
		btnSeleccionar_1_1_1.setBackground(new Color(30, 144, 255));
		btnSeleccionar_1_1_1.setBounds(251, 6, 117, 23);
		panel_2.add(btnSeleccionar_1_1_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(10, 72, 73, 20);
		panel_2.add(formattedTextField);
		
 		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(93, 72, 73, 20);
		panel_2.add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_1_1 = new JFormattedTextField();
		formattedTextField_1_1.setBounds(176, 72, 73, 20);
		panel_2.add(formattedTextField_1_1);
		
		JFormattedTextField formattedTextField_1_1_1 = new JFormattedTextField();
		formattedTextField_1_1_1.setBounds(10, 125, 73, 20);
		panel_2.add(formattedTextField_1_1_1);
		
		JFormattedTextField formattedTextField_1_1_1_1 = new JFormattedTextField();
		formattedTextField_1_1_1_1.setBounds(93, 125, 73, 20);
		panel_2.add(formattedTextField_1_1_1_1);
		
		JLabel lblDiadd = new JLabel("Dia (DD)");
		lblDiadd.setForeground(SystemColor.textHighlight);
		lblDiadd.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblDiadd.setBounds(10, 56, 73, 15);
		panel_2.add(lblDiadd);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(219, 125, 30, 20);
		panel_2.add(spinner);
		
		JLabel lblDiadd_1 = new JLabel("Dia (DD)");
		lblDiadd_1.setForeground(SystemColor.textHighlight);
		lblDiadd_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblDiadd_1.setBounds(93, 57, 73, 15);
		panel_2.add(lblDiadd_1);
		
		JLabel lblDiadd_1_1 = new JLabel("Año (AAAA)");
		lblDiadd_1_1.setForeground(SystemColor.textHighlight);
		lblDiadd_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblDiadd_1_1.setBounds(176, 57, 73, 15);
		panel_2.add(lblDiadd_1_1);
		
		JLabel lblDiadd_1_1_1 = new JLabel("HORA (HH)");
		lblDiadd_1_1_1.setForeground(SystemColor.textHighlight);
		lblDiadd_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblDiadd_1_1_1.setBounds(10, 99, 73, 15);
		panel_2.add(lblDiadd_1_1_1);
		
		JLabel lblDiadd_1_1_1_1 = new JLabel("Entrada");
		lblDiadd_1_1_1_1.setForeground(SystemColor.textHighlight);
		lblDiadd_1_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblDiadd_1_1_1_1.setBounds(10, 112, 73, 15);
		panel_2.add(lblDiadd_1_1_1_1);
		
		JLabel lblDiadd_1_1_1_1_1 = new JLabel("Salida");
		lblDiadd_1_1_1_1_1.setForeground(SystemColor.textHighlight);
		lblDiadd_1_1_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblDiadd_1_1_1_1_1.setBounds(93, 113, 73, 15);
		panel_2.add(lblDiadd_1_1_1_1_1);
		
		JLabel lblDiadd_1_1_1_2 = new JLabel("PERSONAS ");
		lblDiadd_1_1_1_2.setForeground(SystemColor.textHighlight);
		lblDiadd_1_1_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblDiadd_1_1_1_2.setBounds(176, 113, 73, 15);
		panel_2.add(lblDiadd_1_1_1_2);
		
		JLabel lblDiadd_1_1_1_2_1 = new JLabel("Precio");
		lblDiadd_1_1_1_2_1.setForeground(SystemColor.textHighlight);
		lblDiadd_1_1_1_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblDiadd_1_1_1_2_1.setBounds(261, 57, 73, 15);
		panel_2.add(lblDiadd_1_1_1_2_1);
		
		JFormattedTextField formattedTextField_1_1_2 = new JFormattedTextField();
		formattedTextField_1_1_2.setEditable(false);
		formattedTextField_1_1_2.setBounds(261, 72, 93, 20);
		panel_2.add(formattedTextField_1_1_2);
		
		JButton btnSeleccionar_1_2 = new JButton("EDITAR");
		btnSeleccionar_1_2.setForeground(new Color(30, 144, 255));
		btnSeleccionar_1_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnSeleccionar_1_2.setBorder(new LineBorder(SystemColor.textHighlight, 1, true));
		btnSeleccionar_1_2.setBackground(new Color(255, 255, 255));
		btnSeleccionar_1_2.setBounds(151, 471, 117, 23);
		panelAdicionServicio.add(btnSeleccionar_1_2);
		
		JButton btnSeleccionar_1_3 = new JButton("SELECCIONAR");
		btnSeleccionar_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeleccionar_1_3.setForeground(Color.WHITE);
		btnSeleccionar_1_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnSeleccionar_1_3.setBorder(null);
		btnSeleccionar_1_3.setBackground(SystemColor.textHighlight);
		btnSeleccionar_1_3.setBounds(24, 472, 117, 23);
		panelAdicionServicio.add(btnSeleccionar_1_3);

		//SCROLL SERVICIOS
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(34, 406, 373, 48);
		
		//CODIGO DE PLATOS 
		
				DefaultListModel<String> lista = new DefaultListModel<>();
				JList<String> listaServicios = new JList<>(lista);
				
				for (int i = 0; i < hotel.getMenuFull().size(); i++) {
				    String elemento = hotel.getMenuFull().get(i);
				    lista.addElement(elemento);
				    }

				listaServicios.repaint();
				scrollPane.setViewportView(listaServicios);
		panelAdicionServicio.add(scrollPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 725, 45);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("NOMBRE EMPLEADO");
		lblNewLabel_2.setBounds(606, 17, 109, 17);
		lblNewLabel_2.setFont(new Font("Prompt Medium", Font.PLAIN, 11));
		lblNewLabel_2.setForeground(SystemColor.menu);
		panel.add(lblNewLabel_2);
		
		
		setSize(new Dimension(750,600));
		setIconImage(null);
		setResizable(false);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	}

