import java.util.*;
public class Main
{
  public static void main (String[]args)
  {

    int[] arr = new int[]{ 4, 3, 7, 2, 9, 1, 8 };
      Arrays.sort (arr);
	System.out.println("Sorted array is:"+Arrays.toString(arr));
    int max = Integer.MIN_VALUE;
    for (int i:arr)
      {
	if (i > max)
	  max = i;
      }
    System.out.println ("Max value in the array is :" + max);
  }
}

/*
Output:
Max value in the array is :9
*/
