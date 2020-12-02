package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Vista extends JFrame{

	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setVisible(true);
	}
	
	public void mostrarPanel(JPanel panel) {
		this.setContentPane(panel);
		this.setPreferredSize(panel.getSize());
		this.pack();
		this.setPreferredSize(null);
	}
	
}
