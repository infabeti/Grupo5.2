package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelBienvenida;
import java.awt.Font;

@SuppressWarnings("serial")
public class PanelBienvenida extends JPanel{
	private JLabel lblBienvenida;
	private JLabel lblAlCineElorrieta;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	
	public PanelBienvenida(ControladorPanelBienvenida controladorPanelBienvenida) {
		
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		lblBienvenida = new JLabel("BIENVENIDO");
		lblBienvenida.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblBienvenida.setBounds(141, 121, 269, 105);
		add(lblBienvenida);
		
		lblAlCineElorrieta = new JLabel("AL CINE ELORRIETA");
		lblAlCineElorrieta.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblAlCineElorrieta.setBounds(85, 182, 351, 105);
		add(lblAlCineElorrieta);
	}
}
