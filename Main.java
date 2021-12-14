package Regex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
	
	//variables for the gui
	
	JLabel nameLabel;
  JLabel passwordLabel;
	JFrame frame;
	JPanel panel;
	JTextArea textAreaUserName;
	JTextArea textAreaPassword;

  String username = "ryan123";
  String password = "iloveshrimp";
	
	public Main() {
		
		//make the frame to hold all the panels
		frame = new JFrame();
		
		
		//features for the panel
		JButton button = new JButton("click me");

		nameLabel = new JLabel("Enter username");
		textAreaUserName = new JTextArea(5, 10);

    passwordLabel = new JLabel("Enter password");
		textAreaPassword = new JTextArea(5, 10);

		//action listeners (if this happens do this)
		button.addActionListener(this);

		
	    // add the listener to the jbutton to handle the "pressed" event
	    button.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        // display/center the jdialog when the button is pressed
	    	  
	 
	        String nameAttempt = textAreaUserName.getText().toString();
          String passwordAttempt = textAreaPassword.getText().toString();


          if (nameAttempt.equals(username) && passwordAttempt.equals(password)){
            JOptionPane.showMessageDialog(null, "Username and password entered correctly");
        }else if(nameAttempt.equals(username) && !passwordAttempt.equals(password)){
            JOptionPane.showMessageDialog(null, "username was correct password incorrect");

          }else if(!nameAttempt.equals(username) && passwordAttempt.equals(password)){
            JOptionPane.showMessageDialog(null, "username was incorrect password was correct");
          }else{
          JOptionPane.showMessageDialog(null, "stop trying to hack me!Â¬!!!!!CSDSDFSDFGSGSD");
          }

	      }
	    });
		
		
		
		
		
		//make a panel within the frame to add the button,textboxts, etc
		panel = new JPanel();
		
		//edit the values of the panel
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(nameLabel);
		panel.add(textAreaUserName);
		panel.add(passwordLabel);    
    panel.add(textAreaPassword);
		
		//edit the values for the frame
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Third Gui");
		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Main();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}