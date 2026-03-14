
//Class: CSC110
//Date: 04/07/21
//Description:We will use this starting file to show an example of reading and writing to stream files.





package Ch6;
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;


public class FileRDemo {

	public static void main(String[] args) throws IOException  {
		
				DecimalFormat dFmt = new DecimalFormat("0.##");
			
		        //declare and instantiate the input file object and open the file
				Scanner inFile = new Scanner(new FileReader("src/Ch6/StudentGrades.txt"));
				PrintWriter outFile= new PrintWriter("src/ch6/GradeReport.txt");
					
				String line; //variable to put each line as read
				String name;
				int exam1, exam2, exam3;
				double avg = 0;
				/*use while because don't know how many lines in the file
				  hasNextLine returns false when the end of the file is reached. */
		
				
				outFile.println("Java class grade report");
				outFile.println("------------------------- \n");
				
				System.out.println("Java class grade report");
				System.out.println("------------------------- \n");
                
				while ( inFile.hasNextLine())
				{
						//read a line of text from the file
						line = inFile.nextLine();
						Scanner tokens = new Scanner(line);
						tokens.useDelimiter(",");
						
						name = tokens.next(); 
						exam1 = tokens.nextInt(); 
						exam2 = tokens.nextInt(); 
						exam3 = tokens.nextInt(); 
						avg = ((exam1 + exam2 + exam3)/3.0);
						
						//System.out.println(line);
						//write the same line back out to the console - we aren't doing anything too fancy here
						
						
						
						
						System.out.println( name + " has an exam average of " + dFmt.format(avg));
						outFile.println( name + " has an exam average of " + dFmt.format(avg));

				}
			    //close the file
                  inFile.close();
                  outFile.close();
	}

}


//Donald Duck,90,80,90
//Minnie Mouse,90,98,92
//Homer Simpson,60,70,75


//Java class grade report
//-------------------------

//Donald Duck,90,80,90
//Minnie Mouse,90,98,92
//Homer Simpson,60,70,75


//Java class grade report
//------------------------- 

//Donald Duck has an exam average of 86.67
//Minnie Mouse has an exam average of 93.33
//Homer Simpson has an exam average of 68.33
