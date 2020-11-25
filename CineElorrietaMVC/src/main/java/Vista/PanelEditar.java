package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelEditar extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelEditar() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(258, 11, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NOMBRE PELI");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 31, 224, 56);
		add(lblNewLabel);
		
		JLabel lblGeneroPeli = new JLabel("GENERO PELI");
		lblGeneroPeli.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblGeneroPeli.setBounds(10, 144, 224, 67);
		add(lblGeneroPeli);

	}

}
