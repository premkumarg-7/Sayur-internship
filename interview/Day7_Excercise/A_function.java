/*
 * In the input, find the first A and last A, print all the letters between these two A.
 */
public class A_function {
	public static void main(String[] args) {
		String s="A blind man walking on the road. An ant is ready to bite a man. the site is the safest one ";
		String[] arr=s.split(" "); //split the input and store to String array
		String Aword="";//create the variable to store the words
		String res="";// for store the result
		int flag=0; //declare flag for identify the a word
		for(String str:arr) { //get the values from the array
			if(str.equalsIgnoreCase("a")) { //if the word is a 
				if(flag==1) { //check the flag is already up
					flag=0; //down the flag 
					res=Aword; //and assign the Awords to result it finds the another a
				}else { //if the flag is down
					flag=1; //up the flag we found the first a letter
					
				}
			}
			if(flag==1) { //if the flag is up 
				Aword+=str+" "; //store the values to aword when flag is up
			}
		}
		System.out.println(res); //print the result 
	}
}
/*
Output-
A blind man walking on the road. An ant is ready to bite 
*/