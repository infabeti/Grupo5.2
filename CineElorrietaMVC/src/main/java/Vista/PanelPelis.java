package Vista;

import javax.swing.JPanel;

import Controlador.ControladorPanelPelis;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PanelPelis extends JPanel {

	private ControladorPanelPelis controladorpanelpelis;
	private JButton btnAtras;
	private JButton btnContinuar;
	private JLabel lblPelis;
	private JTextArea txtAreaPelis;
	private JComboBox cmbXPelis;

	public PanelPelis(ControladorPanelPelis controladorpanelpelis) {

		setLayout(null);
		setBounds(150, 150, 530, 505);

		lblPelis = new JLabel("PELIS");
		lblPelis.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblPelis.setBounds(190, 13, 128, 33);
		add(lblPelis);

		txtAreaPelis = new JTextArea();
		txtAreaPelis.setBounds(37, 101, 425, 240);
		add(txtAreaPelis);

		cmbXPelis = new JComboBox();
		cmbXPelis.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cmbXPelis.setBounds(190, 57, 93, 33);
		add(cmbXPelis);

		btnAtras = new JButton("ATRAS");
		btnAtras.setBounds(37, 388, 139, 42);
		add(btnAtras);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(323, 388, 139, 42);
		add(btnContinuar);
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorpanelpelis.accionadoBottonVolverPanelPelis();
			}
		});
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorpanelpelis.accionadoBottonAceptarPanelPelis();
			}
		});

	}
}
