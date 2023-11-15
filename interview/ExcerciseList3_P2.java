import java.util.*;
public class Main
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
