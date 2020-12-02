package Vista;

import javax.swing.JPanel;

import Controlador.ControladorPanelPelis;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelPelis extends JPanel {

	private ControladorPanelPelis controladorpanelpelis;

	public PanelPelis(ControladorPanelPelis controladorpanelpelis) {
		setLayout(null);

		JLabel lblNewLabel = new JLabel("PELIS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(190, 13, 128, 33);
		add(lblNewLabel);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(37, 101, 425, 192);
		add(textArea);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
		comboBox.setBounds(190, 57, 93, 33);
		add(comboBox);

		JButton btnNewButton = new JButton("CONTINUAR");
		btnNewButton.setBounds(352, 304, 110, 23);
		add(btnNewButton);

	}
}
