/*
 * Print the following pattern
1
212
32123
4321234
543212345
Get user input for how far to go (up to 0)

 */

import java.util.Scanner;

public class problem1_Pattern{
    public static void main (String args[])
    {
        	String temp ="";
		int num=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter thr number :");
		int n=sc.nextInt();
		
		for (int i=0;i<n;i++) 
		{
		    if (i==0){
		        System.out.println(num);
		        temp=Integer.toString(num);
		        continue;
		    }
		    temp=(Integer.toString(num+i) + temp + Integer.toString(num+i));
		    System.out.println(temp);
		}
    }
}

/*
 * Output :
 * Enter thr number :5
1
212
32123
4321234
543212345
 */