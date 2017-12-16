//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		String nickels = JOptionPane.showInputDialog("how many nickels do you have?");
		int nickel =	Integer.parseInt(nickels);
		String dimes = JOptionPane.showInputDialog("how many dimes do you have?");
	int dime = Integer.parseInt(dimes);
		String quarters = JOptionPane.showInputDialog("how many quartetrs do you have?");
		int quarter =Integer.parseInt(quarters);
		JOptionPane.showMessageDialog(null, "you have " + (nickel * 5 + dime * 10 + quarter * 25) + " cents");
		// Ask the user how many nickels they have
		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable

		// Tell the user how much money they have

	}
}
