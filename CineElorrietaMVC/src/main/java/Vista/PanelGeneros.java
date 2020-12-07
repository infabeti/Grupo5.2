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

	private JButton btnDrama;
	private JLabel lblGeneros;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros)
	{
		this.controladorPanelGeneros = controladorPanelGeneros;
		controladorPanelGeneros.setCurrentDia(0);
		setLayout(null);
		setBounds(100,100,500,400);
		
		lblGeneros = new JLabel("SELECCION DE GENEROS");
		lblGeneros.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblGeneros.setBounds(69, 11, 359, 35);
		add(lblGeneros);
		
		btnDrama = new JButton("DRAMA");
		btnDrama.setBounds(8, 134, 169, 51);
		btnDrama.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonGenroPanelGeneros(1);
			}
		});
		add(btnDrama);
		
		JButton btnCienciaFiccion = new JButton("CIENCIA FICCION");
		btnCienciaFiccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonGenroPanelGeneros(2);
			}
		});
		btnCienciaFiccion.setBounds(8, 72, 169, 51);
		add(btnCienciaFiccion);
		
		JButton btnTerror = new JButton("TERROR");
		btnTerror.setBounds(8, 196, 169, 51);
		btnTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonGenroPanelGeneros(4);
			}
		});
		add(btnTerror);
		
		JButton btnComedia = new JButton("COMEDIA");
		btnComedia.setBounds(8, 258, 169, 51);
		btnComedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonGenroPanelGeneros(3);
			}
		});
		add(btnComedia);
		
		JTextArea txtrPelisSeleccionadas = new JTextArea();
		txtrPelisSeleccionadas.setBounds(187, 107, 241, 202);
		add(txtrPelisSeleccionadas);
		
		JLabel lblNewLabel = new JLabel("PELIS SELECCIONADAS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(224, 44, 276, 23);
		add(lblNewLabel);
		
		JLabel lblHorasRestantes = new JLabel("Horas restantes");
		lblHorasRestantes.setBounds(223, 320, 177, 23);
		add(lblHorasRestantes);
		
		JButton btnSabado = new JButton("SABADO");
		btnSabado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.setCurrentDia(0);
			}
		});
		btnSabado.setBounds(187, 73, 122, 23);
		add(btnSabado);
		
		JButton btnDomingo = new JButton("DOMINGO");
		btnDomingo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.setCurrentDia(1);
			}
		});
		btnDomingo.setBounds(319, 73, 144, 23);
		add(btnDomingo);
		
		JButton btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(362, 346, 93, 23);
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonAceptarPanelGeneros();
			}
		});
		add(btnContinuar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(8, 346, 93, 23);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonVolverPanelGeneros();
			}
		});
		add(btnVolver);
		
	}
}
