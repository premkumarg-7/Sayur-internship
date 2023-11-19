/*
 * You have a list of student names and another list with their marks in CS. 
hard code the values. no need to get it as input
Pass mark is 50.
Print a new list with all the students with pass marks along with their mark in the format name:mark.
Also print the number of students who failed
 */

public class program2
{
	public static void main(String[] args) {
		String[] name=new String[]{"Prem","Kesavan","Jeroban","Dinesh"};// List of names
		int[] marks=new int[]{80,89,43,55}; //List of marks
		int n= marks.length; // find length;
		int count =0; // store the failed students count
		int passmark=50; // passmark is 50
		for (int i=0;i<n;i++){ // get ans check the all marks
		    if(marks[i]>=passmark){ //check the whose marks above oor equalto <= passmark
		        System.out.print(name[i]+":"+marks[i]+" | "); //if they passed print the name with mark
			    System.out.println("Passmark :"+passmark); 
		    }else{
		        count++; // if someone failed increase the count
		    }
		}
			System.out.println("Failed students:"+count); // print no of std failed
	}
}

/*
 * Output :
 *Prem:80 | Passmark :50
Kesavan:89 | Passmark :50
Dinesh:55 | Passmark :50
Failed students:1
 */