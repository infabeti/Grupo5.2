package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControladorPanelEditar;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelEditar extends JPanel {
	private ControladorPanelEditar controladorpaneleditar;

	
	public PanelEditar(ControladorPanelEditar controladorpaneleditar) {
		setBounds(150, 150, 530, 505);
		setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(26, 46, 472, 303);
		add(textArea);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(27, 400, 89, 54);
		add(btnAtras);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(126, 400, 89, 54);
		add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(225, 400, 89, 54);
		add(btnEliminar);
		
		JButton btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.setBounds(324, 400, 89, 54);
		add(btnAñadir);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(423, 400, 89, 54);
		add(btnGuardar);

	}
}
