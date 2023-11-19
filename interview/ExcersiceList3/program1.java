/*
 * Write a function to calculate compund interest. Help the user save money by displaying the interest they 
can earn by saving certain % of thier salary, for 3 different interest rates and for 3 different % of salary
 */
import java.util.*;
public class program1
{
	public static void main(String[] args) {

CompoundInterest();
  }
    public static void CompoundInterest(){
		double salary=0.0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary :");
		salary=sc.nextDouble();
		
		 for (int i = 1; i <= 3; i++) {
            System.out.printf("\nFor %d%% of your salary:\n", i * 10);
            for (int j = 1; j <= 3; j++) {
                System.out.printf("At %d%% interest rate: $%.2f\n", j * 5, (salary * i / 10) * Math.pow(1.0 + j * 0.05, 1));
            }
        }
		
	}
}
/*Output :
Enter the salary :
50000

For 10% of your salary:
At 5% interest rate: $5250.00
At 10% interest rate: $5500.00
At 15% interest rate: $5750.00

For 20% of your salary:
At 5% interest rate: $10500.00
At 10% interest rate: $11000.00
At 15% interest rate: $11500.00

For 30% of your salary:
At 5% interest rate: $15750.00
At 10% interest rate: $16500.00
At 15% interest rate: $17250.00
*/
