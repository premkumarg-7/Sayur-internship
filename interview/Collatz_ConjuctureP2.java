
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      ArrayList < Integer > li1 = new ArrayList <> ();
      ArrayList < Integer > li2 = new ArrayList <> ();
      System.out.println ("Enter no 1:");
    int n1 = sc.nextInt ();


    while (n1 > 1)
      {
	if (n1 % 2 == 0)
	  {
	    n1 = n1 / 2;
	  }
	else
	  {
	    n1 = 3 * n1 + 1;
	  }
	li1.add (n1);
      }
    System.out.print ("Enter no 2 :");
    int n2 = sc.nextInt ();
    while (n2 > 1)
      {
	if (n2 % 2 == 0)
	  {
	    n2 = n2 / 2;
	  }
	else
	  {
	    n2 = 3 * n2 + 1;
	  }
	li2.add (n2);
      }
    if (li1.size () < li2.size ())
      {
	System.out.print ("No1 has less steps to reach 1");
      }
    else
      {
	System.out.println ("No2 has less steps to reach 1");
      }
  }
}

/*
Output:
Enter no 1:8
Enter no 2 :11
No1 has less steps to reach 1
  */
