package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelBienvenida;
import java.awt.Font;

@SuppressWarnings("serial")
public class PanelBienvenida extends JPanel{
	private JLabel lblBienvenida;
	private ControladorPanelBienvenida controladorPanelBienvenida;
	
	public PanelBienvenida(ControladorPanelBienvenida controladorPanelBienvenida) {
		this.controladorPanelBienvenida = controladorPanelBienvenida;
		
		setLayout(null);
		
		lblBienvenida = new JLabel("BIENVENIDO");
		lblBienvenida.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblBienvenida.setBounds(191, 121, 269, 105);
		add(lblBienvenida);
		
		JLabel lblAlCineElorrieta = new JLabel("AL CINE ELORRIETA");
		lblAlCineElorrieta.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblAlCineElorrieta.setBounds(130, 173, 351, 105);
		add(lblAlCineElorrieta);
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		this.controladorPanelBienvenida.accionadoBottonMostrarPanelGeneros();
	}
}
