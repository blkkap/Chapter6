
//Date: 04/07/21
//Class:CSC110
// Description: List/files of famous computer scientist 


package Ch6;
import java.io.*;
import java.util.Scanner;

public class FamousCS {

	public static void main(String[] args)  throws IOException  {
		// TODO Auto-generated method stub
		
		Scanner inFile = new Scanner(new FileReader("src/Ch6/names.txt"));
		PrintWriter outFile= new PrintWriter("src/ch6/CSreport.txt");

		
		
		String line;
		String firstname , lastname;
		String claim;
		int count = 0;
		
		while(inFile.hasNextLine()) {
			
			line = inFile.nextLine();
			Scanner tokens = new Scanner(line);
			tokens.useDelimiter(",");
			
			firstname = tokens.next();
			lastname = tokens.next();
			claim = tokens.next();
			
			
			System.out.println(firstname.charAt(0) + "." + lastname + " " + claim);
			outFile.println(firstname.charAt(0) + "." + lastname + " " + claim);
			//System.out.println(line);
			 count++;
						
		}
			System.out.println("There are " + count + " famous  computer scientists in the file.");
			outFile.println("There are " + count + " famous  computer scientists in the file.");

			
			inFile.close();
			outFile.close();
	}

}

//G.James is often called the inventor of Java
//D.Edsger was the supreme algorithmist - he researched and developed how to solve problems fast
//K.Allan developed the first OO programming language called Smalltalk
//P.Randy led the team of Carnegie Mellon graduate students that developed the Alice programming language
//T.Alan is often considered the father of modern computer science
//B.John developed the Fortran language with his team at IBM
//K.Donald wrote the ultimate Computer Science comprehensive text called The Art of Computer Programming
//M.John is famous for his contributions to and coined the term Artificial Intelligence
//H.Grace was a Navy Admiral who invented the first compiler
//v.John developed the von Neumann architecture used in virtually every non-parallel processing computer
//S. Wozniak famous for his contribution to Apple I  and Apple II before leaving in 1987
//There are 11 famous  computer scientists in the file.


