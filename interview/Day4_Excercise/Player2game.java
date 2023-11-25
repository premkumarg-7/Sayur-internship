import java.util.Random;

public class Player2game {

	public static void main(String[] args) {
		
		char[][] board =new char[6][6]; //create a board 6x6
		int playerA=0; //playerA points
		int playerB=0; //playerB points
		Random random =new Random(); //generate randio numbers 
		
		for(int i=0;i<board.length;i++) { 		//print the board as *
			for(int j=0;j<board.length;j++) {
				board[i][j]='*';
			}
		}
		
		while(playerA < 5 && playerB < 5) { //the game will run while the players reach 5 points
		
			boardprint(board); //print the board using method
			
		int rollAr= random.nextInt(1,6); //assign the random number (1-6) to variable its for row
		int rollAc =random.nextInt(1,6);	//assign the random number (1-6) to variable its for col
		
		if(board[rollAr][rollAc]=='B') { //check if already B put the sign or not
			playerA++;	//if its occur increase point 
		} 
			board[rollAr][rollAc]='A'; //assign the place as player sign 
		
			//As a same for Player B
			int rollBr=random.nextInt(1,6);
			int rollBc=random.nextInt(1,6);
			
			if(board[rollBr][rollBc]=='A') {
				playerB++;
			}
			board[rollBr][rollBc]='B';
			
			
			System.out.println("Player A points :"+playerA);
			System.out.println("Player B points :"+playerB);
			System.out.println();
		}
		
		if(playerA>=5) {
			System.out.println("player A is won!");
		}else {
			System.out.println("player B is won!");
		}
	}
	private static void boardprint(char board[][]) { //this method helps to print the board
		for(int i=0;i<6;i++) { //print the board 
			for(int j=0;j<6;j++) {
			System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

/*
 * * * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
Player A points :0
Player B points :0

* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* * * * * * 
* B * * A * 
Player A points :0
Player B points :0

* * * * * * 
* * * * * * 
* * * * * * 
* * * B * * 
* * * * * * 
* B * * A A 
Player A points :0
Player B points :1

* * * * * * 
* * * * * * 
* * * * * * 
* * A B * * 
* * * * * * 
* B * * B A 
Player A points :0
Player B points :1

* * * * * * 
* * * * * * 
* * * * * * 
* * A B * * 
* * * * B * 
* B A * B A 
Player A points :0
Player B points :2

* * * * * * 
* * * * * * 
* * * * * * 
* A A B * * 
* * * * B * 
* B B * B A 
Player A points :0
Player B points :2

* * * * * * 
* * * * * * 
* * * * A * 
* A A B * * 
* * * * B * 
* B B * B A 
Player A points :0
Player B points :2

* * * * * * 
* * * * * A 
* B * * A * 
* A A B * * 
* * * * B * 
* B B * B A 
Player A points :0
Player B points :2

* * * * * * 
* * * A * A 
* B B * A * 
* A A B * * 
* * * * B * 
* B B * B A 
Player A points :1
Player B points :2

* * * * * * 
* * B A * A 
* B B * A * 
* A A B * * 
* * * * B * 
* B B * A A 
Player A points :1
Player B points :3

* * * * * * 
* * B A * A 
* B B B A * 
* A A B * * 
* * * * B * 
* B B * A A 
Player A points :1
Player B points :3

* * * * * * 
* * B A * A 
* B B B A * 
* A A B A * 
* * * * B * 
* B B * A A 
Player A points :2
Player B points :4

* * * * * * 
* * B A * A 
* B B B B * 
* A A B A * 
* * * * A * 
* B B * A A 
Player A points :2
Player B points :4

* * * * * * 
* * B A * A 
* B B B B * 
* A A B A * 
* * * * A * 
* B B * A A 
Player A points :3
Player B points :4

* * * * * * 
* * A A * A 
* B B B B * 
* A A B A * 
* * * B A * 
* B B * A A 
Player A points :3
Player B points :5

player B is won!

 * 
 * */
