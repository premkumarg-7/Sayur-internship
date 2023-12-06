//program:1
//Collatz_Conjecture (Using Java)

import java.util.Scanner;

public class Collatz_conjecture {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value :");
		int n = sc.nextInt();
		System.out.print(n);
		while(n>=1){
			if(n%2==0) {
				n=n/2;
			}else {
				n=3*n+1;
			}
			System.out.print(", "+n);
			if(n==1) 
				break;
		 }
	}
}
/* Output :
Enter the value : 6
6, 3, 10, 5, 16, 8, 4, 2, 1

Enter the value :7
7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
*/