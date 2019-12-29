package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		addNumbers.addActionListener(e->add());
		randNumber.addActionListener(e->rand());
		tellAJoke.addActionListener(e->joke());
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	public void add() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	public void rand() {
		int r = new Random().nextInt(50)+1;
		System.out.println("You found a randomly generated number: "+r+"\nThank God you didn't eat it.");
	}
	public void joke() {
		String a = "What is the best thing about Switzerland?\n\nI don't know, but the flag is a huge plus.";
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
