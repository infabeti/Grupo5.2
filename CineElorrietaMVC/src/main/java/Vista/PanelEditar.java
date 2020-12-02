package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControladorPanelEditar;

import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class PanelEditar extends JPanel {
	private JTextField textField;
	private ControladorPanelEditar controladorpaneleditar;

	/**
	 * Create the panel.
	 */
	public PanelEditar(ControladorPanelEditar controladorpaneleditar) {
		this.controladorpaneleditar = controladorpaneleditar;
		setLayout(null);
		setBounds(100,100,500,400);
		
		textField = new JTextField();
		textField.setBounds(245, 77, 210, 92);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NOMBRE PELI");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 77, 224, 56);
		add(lblNewLabel);
		
		JLabel lblGeneroPeli = new JLabel("GENERO PELI");
		lblGeneroPeli.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblGeneroPeli.setBounds(10, 212, 224, 67);
		add(lblGeneroPeli);

	}

}
