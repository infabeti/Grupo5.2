package Vista;

import javax.swing.JPanel;

import Controlador.ControladorPanelAdminPelis;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelEditar extends JPanel {
	private ControladorPanelAdminPelis controladoradminpelis;
	private JTextField txtFGenero;
	private JTextField txtFTitulo;
	private JTextField txtFDuracion;
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblTitulo;
	private JLabel lblGenero;
	private JLabel lblDuracion;
	private JButton btnVolver;
	private JButton btnAceptar;
	
	public PanelEditar(ControladorPanelAdminPelis controladoradminpelis) {
		setBounds(150, 150, 530, 505);
		setLayout(null);
		
		lblNewLabel = new JLabel("Codigo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(52, 74, 75, 28);
		add(lblNewLabel);
		
		comboBox = new JComboBox();
		comboBox.setBounds(151, 74, 121, 27);
		add(comboBox);
		
		lblTitulo = new JLabel("Titulo:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTitulo.setBounds(52, 224, 75, 28);
		add(lblTitulo);
		
		lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGenero.setBounds(52, 147, 75, 28);
		add(lblGenero);
		
		lblDuracion = new JLabel("Duracion:");
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDuracion.setBounds(52, 310, 75, 28);
		add(lblDuracion);
		
		txtFGenero = new JTextField();
		txtFGenero.setBounds(151, 147, 169, 26);
		add(txtFGenero);
		txtFGenero.setColumns(10);
		
		txtFTitulo = new JTextField();
		txtFTitulo.setColumns(10);
		txtFTitulo.setBounds(151, 226, 169, 26);
		add(txtFTitulo);
		
		txtFDuracion = new JTextField();
		txtFDuracion.setColumns(10);
		txtFDuracion.setBounds(151, 312, 169, 26);
		add(txtFDuracion);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(52, 414, 96, 35);
		add(btnVolver);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(381, 414, 96, 35);
		add(btnAceptar);
		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	}
}
