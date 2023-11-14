import java.util.*;
public class Main
{
  public static void main (String[]args)
  {

    int[] arr1 = new int[]{ 1, 3, 7, 9, 13, 14 };
    int[] arr2 = new int[]{ 1, 2, 7, 13, 15 };

    for (int i = 0; i < arr1.length; i++)
      {
	for (int j = 0; j < arr2.length; j++)
	  {
	    if (arr1[i] == arr2[j])
	      System.out.print (arr1[i] + ",");
	  }
     }

  }
}
/*Output;
1,7,13,
*/
