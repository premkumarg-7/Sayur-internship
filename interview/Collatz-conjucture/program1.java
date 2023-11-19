/*
 * Write a program for Collatz_conjecture.
Collatz_conjecture means -  start with the input number. 
For even number , divide by 2 (n/2)
For odd number - 3n + 1
apply the above for the result number until the answer is 1.

Eg, input is 8
8, 4,2, 1
input is 9
9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1
 */

import java.util.Scanner;
public class program1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		System.out.print(n+", ");
		
		
		while(n>1){
		    if (n%2==0) {
		        n=n/2;
		    }else{
		        n=3*n+1;
		    }
		    System.out.print(n+", ");
		}
	}
}

/*
Output:
9
9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1, 
*/
