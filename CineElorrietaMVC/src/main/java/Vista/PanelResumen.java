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
	
	public PanelResumen(ControladorPanelResumen controladorpanelresumen) {
		setLayout(null);
		setBounds(100,100,500,400);
		
		JLabel lblNewLabel = new JLabel("SABADO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(53, 10, 148, 43);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DOMINGO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(288, 8, 165, 46);
		add(lblNewLabel_1);
		
		JButton btnAtras = new JButton("CANCELAR");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAtras.setBounds(67, 323, 101, 37);
		add(btnAtras);
		
		JButton btnNewButton_1 = new JButton("CONTINUAR");
		btnNewButton_1.setBounds(341, 323, 93, 37);
		add(btnNewButton_1);
		
		JTextArea txtASabado = new JTextArea();
		txtASabado.setBounds(10, 65, 227, 234);
		add(txtASabado);
		
		JTextArea txtADomingo = new JTextArea();
		txtADomingo.setBounds(247, 65, 243, 234);
		add(txtADomingo);
	}
}
