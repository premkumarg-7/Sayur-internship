/**
create an array 6*6 its a borad
initialize the board with * 
two player game so declare 2points A,B
when one person have reached 5 points the game will be stop
we can use while()
the die will place randomly the dice has 6faces so 6numbers (2 dice) 
Random function call
int rollA;int rollB;
each person start a game when the place will be eqaul the player will get a point
if A rolls a die 
if(int rollA rollB==B)
A will get a point A++
it is same as B

print A point & B point
if(A>=5)
print A win
else print B win

**/

import java.util.Random;

public class dice {
	public static void main(String[] args) {
		 char[][] board = new char[6][6];
	        int pointsA = 0;
	        int pointsB = 0;
	        Random random = new Random();

	        
	        for (int i = 0; i <6; i++) {
	            for (int j = 0; j <6; j++) {
	                board[i][j] = '*';
	            }
	        }

	        while (pointsA < 5 && pointsB < 5) {
	            // Player A turn
	            int rollAr = random.nextInt(6);
	            int rollAc = random.nextInt(6);

	            if (board[rollAr][rollAc] == 'B') {
	                pointsA++;
	            }
	            board[rollAr][rollAc] = 'A';

	            // Player B turn
	            int rollBr = random.nextInt(6);
	            int rollBc= random.nextInt(6);

	            if (board[rollBr][rollBc] == 'A') {
	                pointsB++;
	            }
	            board[rollBr][rollBc] = 'B';

	            System.out.println("Player A Points: " + pointsA);
	            System.out.println("Player B Points: " + pointsB);
	            System.out.println();
	        }

	        if (pointsA >= 5) {
	            System.out.println("Player A win!");
	        } else {
	            System.out.println("Player B win!");
	        }
	    }

}
