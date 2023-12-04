/**
 * From the same file as above, read from the file, count the number of unique 4 letter words and it no of occurrences
	for each word. Write this information at the end of file under the heading "Summary of 4 letter words"
 */

package Day3_Excercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class filess {
	
	public static void main(String[] args) {
		
		try {
			HashMap<String, Integer> hm = new HashMap<>(); //create the hashmap 
			String filepath="C:\\Users\\Prem\\Desktop\\sayur\\Sayur-internship\\interview\\Day3_Excercise\\the _file.txt";
			File fil = new File(filepath); //using file method to access the file
			Scanner reader = new Scanner(fil); //using scanner method to read the content from the file.
			
			while(reader.hasNext()) {
				String currword=reader.next(); //assign the word to currword
				if(currword.length()==4) { // if the word length is 4  
					Integer num=hm.get(currword); //create Integer num variable and store the value of currword
					//if its not stored the num value is null
					if(num==null) //check the num value if it is null
						hm.put(currword, 1); //store the key-valu in hm key-currword, value-1
					else 
						hm.put(currword, num+1); //if num is not null store the key-valu in hm add num+1
				}	
			}
			reader.close(); //close the reader
	
			System.out.println(hm); //print the hashmap stored values
			//using Filewriter to write in the existing file.
			FileWriter writer = new FileWriter(filepath,true);//Parameters:fileName String The system-dependent filename.append boolean if true, then data will be writtento the end of the file rather than the beginning.
			writer.write("\n"+"This is the summary of the 4 letter words!");//write this String in end of the file
			writer.write("\n"+hm.toString());// store the values in the file
			writer.close();//close the writer
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//Output:-
//The king went to the forest with the wife and a servernt. The king shot a deer. The king went to the forest again the next day.
//
//This is the summary of the 4 letter words!
//{next=1, with=1, went=2, king=3, wife=1, day.=1, shot=1}
