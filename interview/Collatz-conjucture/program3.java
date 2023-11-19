/*
 * Get a input. Create a sequence of numbers from that input using the above alg.
Find the largest number in the sequence. 
 */

import java.util.*;
public class program3
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
	    int n = sc.nextInt();
	    int max=Integer.MIN_VALUE;
	
		while(n>1){
		    if (n%2==0) {
		        n=n/2;
		    }else{
		        n=3*n+1;
		    }
		    
		    if(n>max){
		        max=n;
		    }
		}
		System.out.println("max_Value :"+max);
	}
}
/*
Enter the number :
11
max_Value :52
 */
