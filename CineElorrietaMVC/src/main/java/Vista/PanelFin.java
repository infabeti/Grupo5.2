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
		
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		lblFin = new JLabel("FIN");
		lblFin.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblFin.setBounds(210, 138, 269, 105);
		add(lblFin);
	}
}
