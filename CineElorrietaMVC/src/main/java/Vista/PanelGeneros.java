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
		setLayout(null);
		
		lblGeneros = new JLabel("SELECCION DE GENEROS");
		lblGeneros.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblGeneros.setBounds(8, 5, 359, 35);
		add(lblGeneros);
		
		btnVolver = new JButton("DRAMA");
		btnVolver.setBounds(8, 134, 169, 51);
		add(btnVolver);
		
		JButton btnVolver_1 = new JButton("CIENCIA FICCION");
		btnVolver_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnVolver_1.setBounds(8, 72, 169, 51);
		add(btnVolver_1);
		
		JButton btnVolver_2 = new JButton("TERROR");
		btnVolver_2.setBounds(8, 196, 169, 51);
		add(btnVolver_2);
		
		JButton btnVolver_3 = new JButton("COMEDIA");
		btnVolver_3.setBounds(8, 258, 169, 51);
		add(btnVolver_3);
		
		JTextArea txtrPelisSeleccionadas = new JTextArea();
		txtrPelisSeleccionadas.setBounds(187, 107, 241, 202);
		add(txtrPelisSeleccionadas);
		
		JLabel lblNewLabel = new JLabel("PELIS SELECCIONADAS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(224, 52, 276, 23);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Horas restantes");
		lblNewLabel_1.setBounds(223, 320, 177, 23);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("SABADO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(187, 73, 107, 23);
		add(btnNewButton);
		
		JButton btnDomingo = new JButton("DOMINGO");
		btnDomingo.setBounds(319, 73, 144, 23);
		add(btnDomingo);
		
		JButton btnNewButton_1 = new JButton("CONTINUAR");
		btnNewButton_1.setBounds(370, 333, 93, 23);
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
