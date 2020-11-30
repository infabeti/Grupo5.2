package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelResumen extends JPanel{
	public PanelResumen() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SABADO");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(53, 10, 148, 43);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DOMINGO");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(247, 8, 165, 46);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("CANCELAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(53, 248, 101, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CONTINUAR");
		btnNewButton_1.setBounds(294, 248, 93, 23);
		add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 65, 181, 136);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(247, 65, 181, 136);
		add(textArea_1);
	}
}
