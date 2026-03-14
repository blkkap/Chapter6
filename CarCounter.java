
//Date:29/06/21
//Class:CSC110
//Description:CarCounter tester






package Ch6;
import javax.swing.JFrame;

public class CarCounter {

	public static void main(String[] args) {
		//Create frame and panel
	      JFrame frame = new JFrame("Car Counter");
	      CarCounterPanel panel = new CarCounterPanel();

		  //set frame behavior
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			
		  //place panel in frame
	      frame.getContentPane().add(panel);
			
		  //format frame and make available/visible
	      frame.pack();
	      frame.setVisible(true);

	}

}
