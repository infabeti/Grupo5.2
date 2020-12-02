package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControladorPanelLogin;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PanelLogin extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private ControladorPanelLogin controladorpanellogin;
	public PanelLogin(ControladorPanelLogin controladorpanellogin) {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(169, 103, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 172, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(10, 244, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CONFIRMAR\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(336, 244, 104, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("USER");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(189, 79, 118, 23);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(166, 134, 228, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(169, 11, 155, 69);
		add(lblNewLabel_2);
	}
}
