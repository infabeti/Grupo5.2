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
	private JButton btnCienciaFiccion;
	private JButton btnTerror;
	private JButton btnComedia;
	private JTextArea txtrPelisSeleccionadas;
	private JLabel lblPelisSeleccionadas;
	private JLabel lblHorasRestantes;
	private JButton btnSabado;
	private JButton btnDomingo;
	private JButton btnContinuar;
	private JButton btnVolver;
	private ControladorPanelGeneros controladorPanelGeneros;
	
	public PanelGeneros(ControladorPanelGeneros controladorPanelGeneros)
	{
		
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
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
		
		btnCienciaFiccion = new JButton("CIENCIA FICCION");
		btnCienciaFiccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonGenroPanelGeneros(2);
			}
		});
		btnCienciaFiccion.setBounds(8, 72, 169, 51);
		add(btnCienciaFiccion);
		
		btnTerror = new JButton("TERROR");
		btnTerror.setBounds(8, 196, 169, 51);
		btnTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonGenroPanelGeneros(4);
			}
		});
		add(btnTerror);
		
		btnComedia = new JButton("COMEDIA");
		btnComedia.setBounds(8, 258, 169, 51);
		btnComedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonGenroPanelGeneros(3);
			}
		});
		add(btnComedia);
		
		txtrPelisSeleccionadas = new JTextArea();
		txtrPelisSeleccionadas.setBounds(205, 107, 295, 202);
		add(txtrPelisSeleccionadas);
		
		lblPelisSeleccionadas = new JLabel("PELIS SELECCIONADAS");
		lblPelisSeleccionadas.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPelisSeleccionadas.setBounds(224, 44, 276, 23);
		add(lblPelisSeleccionadas);
		
		lblHorasRestantes = new JLabel("Horas restantes:");
		lblHorasRestantes.setBounds(215, 327, 177, 23);
		add(lblHorasRestantes);
		
		btnSabado = new JButton("SABADO");
		btnSabado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.setCurrentDia(0);
			}
		});
		btnSabado.setBounds(200, 73, 122, 23);
		add(btnSabado);
		
		btnDomingo = new JButton("DOMINGO");
		btnDomingo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.setCurrentDia(1);
			}
		});
		btnDomingo.setBounds(356, 72, 144, 23);
		add(btnDomingo);
		
		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(373, 422, 101, 23);
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonAceptarPanelGeneros();
			}
		});
		add(btnContinuar);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(35, 422, 101, 23);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorPanelGeneros.accionadoBottonVolverPanelGeneros();
			}
		});
		add(btnVolver);
		
		
	}
	
	public JTextArea GetTextArea()
	{
		return txtrPelisSeleccionadas;
	}
	
	public JLabel getLabelHoras()
	{
		return lblHorasRestantes;
	}
	
}
