import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {
	
	public MyGUI() {
		super("My GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Click me!");

		// when this button is pressed, do this code below
		theButton.addActionListener(new ActionListener() {	
			//class body goes here
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked me!");
			}
		});

		JButton button2 = new JButton("No, click me!");
		button2.addActionListener(new ActionListener() {	
			//class body goes here
			public void actionPerformed(ActionEvent e) {
				System.out.println("haha I win");
			}
		});

		this.setLayout(new FlowLayout());
		
		this.add(theButton);	// adding button
		this.add(button2);

		this.pack(); // optimize sizing
		this.setVisible(true);		// please show up on the screen
	}
	
	public static void main(String[] args) {
		new MyGUI(); //create the frame
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

	rather than declaring this class for ActionListener to use for just one line,
	we can instead make it an anonymous variable

	add another button but we haven't specified where it should appear
	--> it top on the other
		not like HTML, we have to specify
		setLayout
*/