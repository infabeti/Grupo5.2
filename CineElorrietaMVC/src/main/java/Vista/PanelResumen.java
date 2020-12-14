package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

import Controlador.ControladorPanelResumen;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PanelResumen extends JPanel{
	
	private ControladorPanelResumen controladorpanelresumen;
	private JLabel lblSabado;
	private JLabel lblDomingo;
	private JButton btnAtras;
	private JButton btnAceptar;
	private JTextArea txtASabado;
	private JTextArea txtADomingo;
	
	public PanelResumen(ControladorPanelResumen controladorpanelresumen) {
		setLayout(null);
		setBounds(150, 150, 530, 505);
		
		lblSabado = new JLabel("SABADO");
		lblSabado.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblSabado.setBounds(53, 10, 148, 43);
		add(lblSabado);
		
		lblDomingo = new JLabel("DOMINGO");
		lblDomingo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblDomingo.setBounds(288, 8, 165, 46);
		add(lblDomingo);
		
		btnAtras = new JButton("CANCELAR");
		btnAtras.setBounds(99, 403, 101, 37);
		add(btnAtras);
		
		btnAceptar = new JButton("CONTINUAR");
		btnAceptar.setBounds(360, 403, 93, 37);
		add(btnAceptar);
		
		txtASabado = new JTextArea();
		txtASabado.setBounds(27, 65, 227, 280);
		add(txtASabado);
		
		txtADomingo = new JTextArea();
		txtADomingo.setBounds(264, 65, 243, 280);
		add(txtADomingo);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorpanelresumen.accionadoBottonAceptarPanelResumen();
			}
		});
		
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controladorpanelresumen.accionadoBottonVolverPanelResumen();
			}
		});
	}
	
	public JTextArea[] getTextAreas()
	{
		JTextArea[] ListaTextos = {txtASabado, txtADomingo};
		return ListaTextos;
	}
}
