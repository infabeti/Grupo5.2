package Vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelFin;
import java.awt.Font;

@SuppressWarnings("serial")
public class PanelFin extends JPanel{
	private JLabel lblFin;
	private ControladorPanelFin controladorPanelFin;
	
	public PanelFin(ControladorPanelFin controladorPanelFin) {
		this.controladorPanelFin = controladorPanelFin;
		
		setLayout(null);
		
		lblFin = new JLabel("FIN");
		lblFin.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblFin.setBounds(246, 139, 269, 105);
		add(lblFin);
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
		this.controladorPanelFin.accionadoBottonMostrarPanelFin();
	}
}
