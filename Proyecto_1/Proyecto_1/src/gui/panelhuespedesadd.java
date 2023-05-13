package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class panelhuespedesadd extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public panelhuespedesadd() {
		getContentPane().setLayout(null);
		
		JPanel panelAgregar = new JPanel();
		panelAgregar.setLayout(null);
		panelAgregar.setBounds(0, 11, 638, 159);
		getContentPane().add(panelAgregar);
		
		JLabel lblNombrePanel = new JLabel("NUEVO HUESPED");
		lblNombrePanel.setForeground(SystemColor.textHighlight);
		lblNombrePanel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 11));
		lblNombrePanel.setBounds(10, 11, 128, 18);
		panelAgregar.add(lblNombrePanel);
		
		JLabel lblNombreCompleto_1 = new JLabel("Nombre Completo");
		lblNombreCompleto_1.setForeground(SystemColor.textHighlight);
		lblNombreCompleto_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblNombreCompleto_1.setBounds(10, 36, 128, 18);
		panelAgregar.add(lblNombreCompleto_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setCaretColor(SystemColor.activeCaption);
		textField.setBorder(new LineBorder(SystemColor.textHighlight, 1, true));
		textField.setBackground(Color.WHITE);
		textField.setBounds(10, 65, 286, 20);
		panelAgregar.add(textField);
		
		JLabel lblCorreo_1 = new JLabel("Correo");
		lblCorreo_1.setForeground(SystemColor.textHighlight);
		lblCorreo_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblCorreo_1.setBounds(10, 96, 128, 18);
		panelAgregar.add(lblCorreo_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setCaretColor(SystemColor.activeCaption);
		textField_1.setBorder(new LineBorder(SystemColor.textHighlight, 1, true));
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(10, 125, 286, 20);
		panelAgregar.add(textField_1);
		
		JLabel lblTelefono_1 = new JLabel("Telefono");
		lblTelefono_1.setForeground(SystemColor.textHighlight);
		lblTelefono_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblTelefono_1.setBounds(316, 36, 128, 18);
		panelAgregar.add(lblTelefono_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setCaretColor(SystemColor.activeCaption);
		textField_2.setBorder(new LineBorder(SystemColor.textHighlight, 1, true));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(316, 65, 286, 20);
		panelAgregar.add(textField_2);
		
		JLabel lblEdad_1 = new JLabel("Edad");
		lblEdad_1.setForeground(SystemColor.textHighlight);
		lblEdad_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblEdad_1.setBounds(316, 94, 128, 18);
		panelAgregar.add(lblEdad_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setCaretColor(SystemColor.activeCaption);
		textField_3.setBorder(new LineBorder(SystemColor.textHighlight, 1, true));
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(316, 123, 61, 20);
		panelAgregar.add(textField_3);
		
		JButton btnAgregarUsuario = new JButton("Guardar Huesped");
		btnAgregarUsuario.setForeground(Color.WHITE);
		btnAgregarUsuario.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		btnAgregarUsuario.setBorder(null);
		btnAgregarUsuario.setBackground(new Color(154, 205, 50));
		btnAgregarUsuario.setBounds(414, 123, 188, 23);
		panelAgregar.add(btnAgregarUsuario);
		
		setSize(new Dimension(664,217));
		setIconImage(null);
		setResizable(false);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
