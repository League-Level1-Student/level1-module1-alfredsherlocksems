package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Binary_Converter implements ActionListener {

	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JTextField TextSize = new JTextField(20);
	JButton button = new JButton("Convert from Binary");
	JLabel label = new JLabel();
	public Binary_Converter () {
		window.setVisible(true);
		window.add(panel);
		panel.add(TextSize);
		panel.add(label);
		panel.add(button);
		window.pack();
		button.addActionListener(this);
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
	


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String text = TextSize.getText();
		text = convert(text);
		label.setText(text);
		window.pack();
	}
}
	
