package Vista;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controlador.ControladorPanelLogin;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PanelLogin extends JPanel{
	private JTextField txtFUsuario;
	private JPasswordField txtFPasswd;
	private ControladorPanelLogin controladorpanellogin;
	public PanelLogin(ControladorPanelLogin controladorpanellogin) {
		setLayout(null);
		setBounds(100,100,500,400);
		
		txtFUsuario = new JTextField();
		txtFUsuario.setBounds(230, 133, 118, 20);
		add(txtFUsuario);
		txtFUsuario.setColumns(10);
		
		txtFPasswd = new JPasswordField();
		txtFPasswd.setBounds(230, 201, 118, 20);
		add(txtFPasswd);
		txtFPasswd.setColumns(10);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorpanellogin.accionadoBottonMostrarPanelGeneros(txtFUsuario.getText(),txtFPasswd.getPassword());
			}
		});
		btnAceptar.setBounds(185, 284, 131, 43);
		add(btnAceptar);
		
		JLabel lblNewLabel = new JLabel("USER");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(88, 133, 118, 23);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(88, 201, 228, 27);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGIN");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(200, 11, 205, 102);
		add(lblNewLabel_2);
	}
}
