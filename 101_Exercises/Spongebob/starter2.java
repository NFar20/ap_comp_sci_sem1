import pkg.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


class starter {
	public static void main(String args[]) throws FileNotFoundException {
		
		//creating File instance to reference text file in Java
        File text = new File("./test.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner sc = new Scanner(text);
     
        //Reading each line of the file using Scanner class
        
        int c=0;
        
        int lineNumber = 1;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            System.out.print("line "+lineNumber+": ");
            for(c=0; c<line.length(); c++){
                String letter = line.substring(c,c+1);
                if(c%2==0){
                    letter = letter.toLowerCase();
                }
                else{
                    letter = letter.toUpperCase();
                }
                System.out.print(letter);
            }
            System.out.println();
            lineNumber++;
        }      

		
	}
}
