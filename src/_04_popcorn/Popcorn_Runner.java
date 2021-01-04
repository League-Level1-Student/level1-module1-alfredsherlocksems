package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Runner {

	public static void main(String[] args) {
		
		String flavour = JOptionPane.showInputDialog("What flavour of popcorn would you like?");
		Popcorn popcorn = new Popcorn(flavour);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		String cookTime = JOptionPane.showInputDialog("How many minutes would you like the popcorn to cook for?");
		int cookTime1 = Integer.parseInt(cookTime);
		microwave.setTime(cookTime1);
		microwave.startMicrowave();
		popcorn.applyHeat();
		popcorn.eat();
		

	}
}
