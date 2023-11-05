import java.util.Scanner;
public class Main
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

Output:
9
9, 28, 14, 7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1, 
