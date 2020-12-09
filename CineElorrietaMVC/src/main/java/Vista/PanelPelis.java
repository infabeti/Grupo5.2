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

	private JTextArea txtAreaPelis;
	private JComboBox<Integer> cmbXPelis;
	private ControladorPanelPelis controladorpanelpelis;

	public PanelPelis(ControladorPanelPelis controladorpanelpelis) {
		setLayout(null);
		setBounds(100,100,500,400);

		JLabel lblNewLabel = new JLabel("PELIS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(190, 13, 128, 33);
		add(lblNewLabel);

		txtAreaPelis = new JTextArea();
		txtAreaPelis.setBounds(37, 101, 425, 192);
		add(txtAreaPelis);

		cmbXPelis = new JComboBox<Integer>();
		cmbXPelis.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cmbXPelis.setBounds(190, 57, 93, 33);
		add(cmbXPelis);

		JButton btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(37, 304, 115, 42);
		add(btnAtras);
		
		JButton btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(347, 306, 115, 42);
		add(btnContinuar);
	}
	
	public JTextArea GetTxtAreaPelis()
	{
		return txtAreaPelis;
	}
	
	public JComboBox<Integer> GetPanelCombo()
	{
		return cmbXPelis;
	}
	
}
