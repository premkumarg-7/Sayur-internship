/*
 * Write a program to find if two strings are same.
two string are considered same if both strings have same letters in same order, but from different starting point
eg abcd is same as bcda (a is moved to the right)
abcd is same as cdab 
abcd is  not same as cdba

123456 = 456123
123456 not = 412356
 */
public class program4
{
	public static void main(String[] args) {	
	String str1="abcd"; //initailize two strings 
	String str2="cdab";
	String s=twoString(str1,str2); // function with parameter and return type
	System.out.println(str1+" & "+str2+" are "+ s); // print the answer

	String num1="123456"; //Initialize two Strings 
	String num2 ="412536";
	String num=twoString(num1, num2); //Function with parameter and return type
	System.out.println(num1+" & "+num2+" are "+num); //print the answer
	}

    public static String twoString (String str1,String str2){
	int n=str1.length(); //store the length of the string1 variable
	int pos=0; //initialize the pos to find position
	
	if(str1.length()!=str2.length())
	    return "Not Same";	//if twoString lengths are not same retrun notsame
	   
	   char[] st1=new char[str1.length()]; //intialize the char array to store the str1
	   char[] st2=new char[str2.length()]; //intialize the char array to store the str2
	   
	   for (int i=0;i<n;i++){ //store the values into charArray
	       st1[i]+=str1.charAt(i);
	       st2[i]+=str2.charAt(i);
	   } 
	   
	   for (int i=0;i<st1.length;i++){
	       if(st1[0]==st2[i]){ //take str1 firstletter contains str2
	           pos=i;	//if its contains assign the index to pos
	           break; 
	       }
	   }
	   String res=""; // declare a string to store the result
	   
	   for(int i=pos;i<n;i++){ //start from pos store the values until end of the string
	       res+=st2[i]; //store the str2 characters into res
	   }
	   for(int i=0;i<pos;i++){ //start from first character store the values until end of the pos
	       res+=st2[i]; //store the str2 characters into res
	   }
	   if(str1.equals(res)){ //check the str1 and result is same or not
	       return "Same"; // if it is same return same
	   }
	   return "Not same"; //default retrun is not same
	}
}

/*
 * Output :
 * 	abcd & cdab are Same
	123456 & 412536 are Not same 
 */