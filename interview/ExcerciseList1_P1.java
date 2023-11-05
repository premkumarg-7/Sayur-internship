public class Main
{
  public static void main (String[]args)
  {
    int word = 65;
    String temp = "";
    for (int i = 0; i < 6; i++)
      {
	System.out.print (temp + ((char) (word + i)) + temp);
	System.out.println ();
	temp = (temp + ((char) (word + i)) + temp);
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
