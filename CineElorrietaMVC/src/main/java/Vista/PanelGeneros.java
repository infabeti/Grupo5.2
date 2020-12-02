package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import Controlador.ControladorPanelGeneros;
import java.awt.Font;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class PanelGeneros extends JPanel {

	private JButton btnVolver;
	private JLabel lblGeneros;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros)
	{
		this.controladorPanelGeneros = controladorPanelGeneros;
		
		lblGeneros = new JLabel("SELECCION DE GENEROS");
		lblGeneros.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblGeneros.setBounds(36, 11, 379, 40);
		add(lblGeneros);
		
		btnVolver = new JButton("DRAMA");
		btnVolver.setBounds(10, 96, 121, 23);
		add(btnVolver);
		
		JButton btnVolver_1 = new JButton("CIENCIA FICCION");
		btnVolver_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVolver_1.setBounds(10, 130, 121, 23);
		add(btnVolver_1);
		
		JButton btnVolver_2 = new JButton("TERROR");
		btnVolver_2.setBounds(10, 164, 121, 23);
		add(btnVolver_2);
		
		JButton btnVolver_3 = new JButton("COMEDIA");
		btnVolver_3.setBounds(10, 198, 121, 23);
		add(btnVolver_3);
		
		JTextArea txtrPelisSeleccionadas = new JTextArea();
		txtrPelisSeleccionadas.setBounds(176, 95, 210, 91);
		add(txtrPelisSeleccionadas);
		
		JLabel lblNewLabel = new JLabel("PELIS SELECCIONADAS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(194, 62, 210, 23);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(".");
		lblNewLabel_1.setBounds(176, 238, 68, 14);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("SABADO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(176, 204, 89, 23);
		add(btnNewButton);
		
		JButton btnDomingo = new JButton("DOMINGO");
		btnDomingo.setBounds(297, 204, 89, 23);
		add(btnDomingo);
		
		JButton btnNewButton_1 = new JButton("CONTINUAR");
		btnNewButton_1.setBounds(327, 266, 113, 23);
		add(btnNewButton_1);
		
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnVolver.addActionListener(listenerBotonVolver(this.controladorPanelGeneros));
	}
	
	private ActionListener listenerBotonVolver(ControladorPanelGeneros controladorPanelGeneros) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Volver");
				controladorPanelGeneros.accionadoBottonVolverPanelGeneros();
			}
		};
	}
}
