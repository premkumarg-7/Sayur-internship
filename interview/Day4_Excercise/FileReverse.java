/*
 * write a program that reads a passage and reverses the order of 
letters in each word while keeping the word order intact. Use function.
Eg- input - I am Sayur
Output I ma ruyaS
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReverse {
	public static void main(String[] args) {
	
		try {
			File file=new File("C:\\Users\\Prem\\Desktop\\sayur\\Sayur-internship\\interview\\Day3_Excercise\\the _file.txt"); //get the file using File method
			Scanner reader= new Scanner(file); //read the content in file using scanner method
			String s="";
			
			while(reader.hasNext()) { //file can read end of the file
				
				String str=reader.next(); //get the value or content and store to str variable
				String revword=""; //assign a variable to reverse
				for(int i=str.length()-1;i>=0;i--) { //reverse a word which is get from file 
					revword+=str.charAt(i); 
				}
				
				s+=revword+" "; //print the reverse word
			}
			System.out.print(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
 * Output: ehT gnik tnew ot eht tserof htiw eht efiw dna a .tnrevres ehT gnik tohs a .reed ehT gnik tnew ot eht tserof niaga eht txen .yad 
*/