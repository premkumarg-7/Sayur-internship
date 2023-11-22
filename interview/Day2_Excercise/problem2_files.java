/*
 * Write a program that reads a passage or string and counts the occurrences of two consecutive words 
that are the same without any other specific word in between.
 For example, count the occurrences of "apple apple" but not "apple orange apple."

 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class problem2_files {
    public static void main(String asr[]){

        try{
            File fil=new File("F:\\file.txt"); //read a file input
            Scanner reader=new Scanner(fil); //Scan the file
            int count=0;
            String preword="";
			String currword=null;

            while(reader.hasNext()) //taking the word end of the word till end of the file 
            {
                currword=reader.next(); // initialize the taking word into currword
                if(currword.equalsIgnoreCase(preword)) // the currword and preword is equal enter into condition
                {
                    count++; // increse the count
                }
                preword = currword; //initialize currword as preword
            } 
            reader.close(); //close the reader
            System.out.println("Count is :"+count); //print the count

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

/*
 * File.txt
 * the apple apple is red, green color. the the apple is good for health.
 */
/*
 * Output:
 * Count is :2
 */