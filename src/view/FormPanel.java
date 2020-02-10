package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Translator;

public class FormPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel instructions = new JLabel("Enter post to convert to mammet speech.");
	private JTextArea inputBox = new JTextArea(10,40);
	
	private JButton submit = new JButton("Submit");
	private JButton clear = new JButton("Clear");
	
	private JTextArea outputBox = new JTextArea(10,40);

	public FormPanel() {
		super();
		add(instructions);
		add(inputBox);
		add(submit);
		add(clear);
		add(outputBox);
		
		ClearButtonListener cbl = new ClearButtonListener();
		clear.addActionListener(cbl);
		
		SubmitButtonListener sbl = new SubmitButtonListener();
		submit.addActionListener(sbl);
	}
	class ClearButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			inputBox.setText("");
			outputBox.setText("");
		}
		
	}
	
	class SubmitButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Translator tl = new Translator(inputBox.getText());
			outputBox.setText(tl.getOutput());
		}
		
	}
	
}
	

