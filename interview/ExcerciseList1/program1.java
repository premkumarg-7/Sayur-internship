/*
Code the given problem :
 * Generate the following output using for loop. Go until g.
a
aba
abacaba
abacabadabacaba
abacabadabacabaeabacabadabacaba
 */

public class program1
{
  public static void main (String[]args)
  {
    int word = 97; //ASCII Value of a is 97
    String temp = ""; // store the printed string
    for (int i = 0; i < 7; i++) //program until g it is 7th alphabet
      {
	System.out.print (temp + ((char) (word + i)) + temp); //print the character
	System.out.println (); // print next line
	temp = (temp + ((char) (word + i)) + temp); // store the printed value
      }
  }
}


/*Output:
A
ABA
ABACABA
ABACABADABACABA
ABACABADABACABAEABACABADABACABA
ABACABADABACABAEABACABADABACABAFABACABADABACABAEABACABADABACABA
 */
