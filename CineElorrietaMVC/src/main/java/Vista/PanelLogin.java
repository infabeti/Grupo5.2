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
	private JButton btnAceptar;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JLabel lblLogin;
	private ControladorPanelLogin controladorpanellogin;
	public PanelLogin(ControladorPanelLogin controladorpanellogin) {
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		txtFUsuario = new JTextField();
		txtFUsuario.setBounds(230, 133, 118, 20);
		add(txtFUsuario);
		txtFUsuario.setColumns(10);
		
		txtFPasswd = new JPasswordField();
		txtFPasswd.setBounds(230, 201, 118, 20);
		add(txtFPasswd);
		txtFPasswd.setColumns(10);
		
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorpanellogin.accionadoBottonMostrarPanelGeneros(txtFUsuario.getText(),txtFPasswd.getPassword());
			}
		});
		btnAceptar.setBounds(185, 284, 131, 43);
		add(btnAceptar);
		
		lblUsuario = new JLabel("USER");
		lblUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblUsuario.setBounds(88, 133, 118, 23);
		add(lblUsuario);
		
		lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPassword.setBounds(88, 201, 228, 27);
		add(lblPassword);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblLogin.setBounds(200, 11, 205, 102);
		add(lblLogin);
	}
}
