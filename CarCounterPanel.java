
//Date:29/06/21
//Class:CSC110
//Description:Car Counter Panel stores info that is called into Car Counter





package Ch6;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class CarCounterPanel extends JPanel {
	    
	    Random gen = new Random();
	    
	    
	    
	    private int carCount;
	   //
	    private JLabel carLabel;
		private JTextField carTextField;
		private JButton carButton;
		private JLabel makeLabel;
		private JTextField makeTextField;
		private JButton carPassengerButton;
		private JLabel carPassengerLabel;
		private JTextField carPassengerTextField;

	 	//Constructor:  Sets up the Panel  
		public CarCounterPanel()
	   {
		  //setLayout(new BorderLayout());
		  carCount = 0;
		  //setLayout (new BoxLayout (this, BoxLayout.X_AXIS));
			
		  //create panel components
		  carLabel = new JLabel ("Number of cars: " );
		  carTextField = new JTextField (" ------- ");
		  makeLabel = new JLabel ("Car make:");
		  makeTextField = new JTextField ();
		  carButton = new JButton("Push here!");
		  carPassengerButton = new JButton("Estimate Passengers");
		  carPassengerLabel = new JLabel(" Passengers: ");
		  carPassengerTextField = new JTextField();
	     //add components to panel.  order is important
			add(carLabel);
			add(carTextField);
			add(makeLabel);
			add(makeTextField);
			add(carButton, BorderLayout.CENTER);
			add(carPassengerLabel);
			add(carPassengerTextField);
			add(carPassengerButton);
	        
	      //connect event handler to event source
	      carButton.addActionListener(new ButtonListener());
		  carPassengerButton.addActionListener(new ButtonListener());
		  
	      carTextField.setPreferredSize(new Dimension(130, 20));
	      makeTextField.setPreferredSize(new Dimension(230, 20));
	      carPassengerTextField.setPreferredSize(new Dimension(230, 20));
	      //carPassengerLabel.setPreferredSize(new Dimension(0, 1));
	         
		  //configure panel.  
	      setBackground(Color.cyan);
	      setPreferredSize(new Dimension(300, 200));
		  carTextField.setText(Integer.toString(0));
	   }

	   //private internal class that is a listener for button push (action) events.
		//also called an event handler
		private class ButtonListener implements ActionListener
	   {
	      public void actionPerformed (ActionEvent event)
	      {
				
			//update the counter and the textField with the button is pushed
	    	  carCount = gen.nextInt(50); 
	    	  
	    	  //carCount++;
	    	  double carpassenger;
	          
	    	  carpassenger = carCount * 2;
	    	  
	    	  carTextField.setText(Integer.toString(carCount));
	           
	           
	           if(carCount%2==0) {
	           setBackground(Color.yellow);
	           makeTextField.setText("Cheverolet");
	           
	         }	
	           else {
	        	   setBackground(Color.green);
	               makeTextField.setText("Ford");
	           }
	        ;
	         carPassengerTextField.setText(Double.toString(carpassenger));
	      }//end of ActionPerformed method
			
	   }//end of ButtonListener
		
	}//end of CarCounterPanel


