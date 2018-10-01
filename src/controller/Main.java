package controller;

import javax.swing.SwingUtilities;

import view.CalculatorUI;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {	
			@Override
			public void run() {
				new CalculatorUI();
			}
		});
	}

}
