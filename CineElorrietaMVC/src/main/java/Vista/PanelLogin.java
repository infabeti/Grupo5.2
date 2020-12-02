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
		textField.setBounds(189, 182, 118, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 256, 118, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.setBounds(63, 287, 131, 43);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CONFIRMAR\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(309, 287, 131, 43);
		add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("USER");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(222, 148, 118, 23);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(189, 218, 228, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(200, 69, 205, 102);
		add(lblNewLabel_2);
	}
}
