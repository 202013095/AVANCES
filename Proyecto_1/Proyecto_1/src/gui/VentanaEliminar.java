package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Rectangle;
import javax.swing.JLabel;

public class VentanaEliminar extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaEliminar() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 373, 204);
		getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(new Rectangle(17, 17, 17, 17));
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(90, 92, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBackground(Color.RED);
		btnEliminar.setBorder(null);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBounds(189, 92, 89, 23);
		panel.add(btnEliminar);
		
		JLabel lblNewLabel = new JLabel("?ESTA SEGURO DE QUE DESE ELIMINAR EL ELEMENTO?");
		lblNewLabel.setBounds(52, 54, 273, 14);
		panel.add(lblNewLabel);
	}
}
