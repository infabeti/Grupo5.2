package Vista;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Controlador.ControladorPanelEditar;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PanelAdminPelis extends JPanel {
	private ControladorPanelEditar controladorpaneleditar;
	private JTextArea textArea;
	private JButton btnAtras;
	private JButton btnEditar;
	private JButton btnEliminar;
	private JButton btnAñadir;
	private JButton btnGuardar;

	public PanelAdminPelis(ControladorPanelEditar controladorpaneleditar) {
		setBounds(150, 150, 530, 505);
		setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(26, 46, 472, 303);
		add(textArea);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(27, 400, 89, 54);
		add(btnAtras);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(126, 400, 89, 54);
		add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(225, 400, 89, 54);
		add(btnEliminar);
		
		btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.setBounds(324, 400, 89, 54);
		add(btnAñadir);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(423, 400, 89, 54);
		add(btnGuardar);

		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}
}
