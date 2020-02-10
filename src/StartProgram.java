import javax.swing.JFrame;
import javax.swing.JPanel;

import view.FormPanel;

public class StartProgram {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new FormPanel();
		
		frame.add(panel);
		frame.setSize(500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
