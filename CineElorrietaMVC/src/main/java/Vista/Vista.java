package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Vista extends JFrame{

	public Vista() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(150, 150, 540, 565);
		this.setVisible(true);
	}
	
	public void mostrarPanel(JPanel panel) {
		this.setContentPane(panel);
		this.setPreferredSize(panel.getSize());
		this.pack();
		this.setPreferredSize(null);
	}
	
}
