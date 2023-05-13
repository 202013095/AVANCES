package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;

public class Error extends JFrame {
	public Error() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("El usuario o contraseña no coincide");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 239, 130);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		getContentPane().add(lblNewLabel);
		
		setSize(new Dimension(250,170));
		setIconImage(null);
		setResizable(false);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
