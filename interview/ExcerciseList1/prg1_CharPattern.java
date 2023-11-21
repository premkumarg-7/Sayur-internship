/*
Code the given problem :
 * Generate the following output using for loop. Go until g.
a
aba
abacaba
abacabadabacaba
abacabadabacabaeabacabadabacaba
 */

public class prg1_CharPattern
{
  public static void main (String[]args)
  {
    int word = 97; //ASCII Value of a is 97
    String temp = ""; // store the printed string
    for (int i = 0; i < 7; i++) //program until g it is 7th alphabet
      {
        temp = (temp + ((char)word++) + temp); // store the values in temp=(temp + (char)word->a++) + temp)
	      System.out.println(temp); //print the temp
	
      }
  }
}


/*Output:
a
aba
abacaba
abacabadabacaba
abacabadabacabaeabacabadabacaba
abacabadabacabaeabacabadabacabafabacabadabacabaeabacabadabacaba
abacabadabacabaeabacabadabacabafabacabadabacabaeabacabadabacabagabacabadabacabaeabacabadabacabafabacabadabacabaeabacabadabacaba
 */
