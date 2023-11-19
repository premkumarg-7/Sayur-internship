/*
 *  Sort the numbers in an array (ascending or descending). Write a function that finds the largest number in an array
 */
import java.util.*;
public class program3
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

// public class program3
// {
//   public static void main (String[]args)
//   {
//     int[] arr = new int[]{ 4, 3, 7, 2, 9, 1, 8 };
//     Arrays.sort (arr);
//     System.out.println("Max value is :"+ arr[arr.length-1]);
//   }
// }

/*
Output:
Max value in the array is :9
*/
