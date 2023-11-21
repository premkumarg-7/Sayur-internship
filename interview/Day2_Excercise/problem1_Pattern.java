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
		    if (i==0){ // print the 1st statement 
		        temp=Integer.toString(num); //store the valued in temp = num
				System.out.println(temp); //print the temp
		        continue; //continue means no need to execute below code go and iterate the i and execute next condition
		    }
		    temp=(Integer.toString(num+i) + temp + Integer.toString(num+i)); //store the values in temp=(num + temp + num)
		    System.out.println(temp); //print the temp
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