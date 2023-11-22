/**
 * read a txt file
 * make the file as String
 * create a string array and store the words in String array
 * declare two variables to store the string previous and current string to store
 * take each words from array using while loop 
 * and check the words contains "the" to "the"
 * and also check it doesn't contains a between words
 * use(id condition and string methods
 * if its found declare a variable and increase the count
 * 
 * then print the count
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class files {
	
	public static void main(String[] args) {
		
		try {
			File fil = new File("F:\\file.txt");
			Scanner reader = new Scanner(fil);
			int count=0;
			
			String preword="";
			String currword=null;
			
			while(reader.hasNext()) {
				currword=reader.next();
				
				if(currword.equalsIgnoreCase("the") && preword.equalsIgnoreCase("the") &&! preword.equalsIgnoreCase("a")) {
					count++;
				}
				
				preword=currword;
			}
			reader.close();
			System.out.println("Count is :"+count);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}