import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {
	
	public MyGUI() {
		super("My GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Click me!");

		// ActionListener listener = new ActionListener();	NO
		ActionListener listener = new MyActionListener();

		theButton.addActionListener(listener);


		
		this.add(theButton);	// adding button
		
		this.pack(); // optimize sizing
		this.setVisible(true);		// please show up on the screen
	}
	
	public static void main(String[] args) {
		new MyGUI(); //create the frame
	}

  	// nested class for ActionListener
 	public static class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("You clicked me!");
		}
 	}
}

/*
	java.awt.*;
		ActionListener will listen to objects and response for us
		hears when an action occurs and shouts at us to do something
		you can't say new ActionListener() because it's interface not class
		--you have to implement ActionListener NOT new ActionListener()

	hard to understand if GUI itself is the listener
	--> nested class!!
		make a new class inside a class
*/