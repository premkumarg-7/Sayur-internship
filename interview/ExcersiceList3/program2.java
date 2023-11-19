/*
 * You have a message that you want to send to your friend. You don't want others to see the message. You code the message and send it.
The alg to code is - split each word in half and reverse it (eg cricket becomes ketccri), if the word ends with a vowel, split at the 
last letter and reverse (eg cinema becomes acinem), if the word has numbers, spell the number but add A as first and last letters
 (8 pm becomes AeightA pm ).
 Write an app that can code and decode the message.
 */
import java.util.*;
public class program2
{
  public static void main (String[]args)
  {
    String str = "Cinema";
    str=str.toLowerCase();
    char[] arr = new char[str.length()];
    int n=arr.length;
    String ans = "";
    for (int i = 0; i < str.length(); i++)
      {
	    arr[i] = str.charAt(i);
      }
    System.out.println (Arrays.toString(arr));
    if(arr[n-1]=='a' || arr[n-1]=='e' || arr[n-1]=='o' || arr[n-1]=='i' || arr[n-1]=='u'){
        ans+=arr[n-1];
        for(int i=0;i<n-1;i++)
            ans+=arr[i];
        System.out.println(ans);
    }else
    {
    int mid = arr.length / 2;
    for (int i = mid + 1; i < arr.length; i++)
      ans += arr[i];
    ans += arr[mid];
    for (int i = 0; i < mid; i++)
      ans += arr[i];
    System.out.println (ans);
    }
  }
}
/* Output 1:-
  [c, i, n, e, m, a, x]
maxecin

  Output 2:-
  [c, i, n, e, m, a]
acinem
*/
