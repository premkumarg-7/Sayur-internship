package Day3_Excercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class theword_file {
	
	public static void main(String[] args) {
		
		boolean flag=false; 
		int count=0;
	try {
		File fil=new File("F://file2.txt"); //get a file from the location
		Scanner reader=new Scanner(fil); //read the file using Scanner method
		
		while(reader.hasNext()) { //get the each word until end of the file
			String currword=reader.next();	 //assign the get word to currword
			if(currword.equalsIgnoreCase("the")) { //if the currword is equal to "the"
				if(flag==true) { //if flag already up 
					count++; //increase the count 
					flag=false; //and down the flag
				} 
				else {
					flag=true; //up the flag if currword == "the"
				}
				 
			}if(currword.equalsIgnoreCase("a")) { //if the currword finds "a" fron the file
				flag=false; //down the flag 
			}
			reader.close();
			 
		}
		
	}catch(FileNotFoundException e) {
		System.err.println("File not Exist" +e);
	}finally {
		System.out.println("Count is :"+count); //print the count
	}
	
	}
}
/*
 * Output:- Count is :2
*/