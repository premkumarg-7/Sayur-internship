/*
 * Its is a single player game where the user starts with 0 points. User keeps rolling the 
dice.If the rolled number is 0, game ends. If the rolled number is even, then 2 points are
 added. If the number is odd, then if the number is 1,3 then the user has to jump. 
 If the number is 5, then 3 points are added. The game ends when the user has 50 points.
 */
import java.util.Random;

public class problem3_game {
    public static void main(String args[])
    {
        Random random = new Random(); //Declare the random number generated method
        int points=0; //points start with 0
        System.out.println("Game Start with "+ points +" Points");
        while(points <=50) //Game stop when user has reach 50 points
        {
            int rolldice = random.nextInt(6); //random generate 0 to 5
            System.out.println("Roll the dice "+rolldice);
            if(rolldice==0){ //if rolldice is 0 exit the game
                break;
            }else if(rolldice%2==0) //if rolldice is even add 2 points
            {
                points+=2; 
            }
            else{
                if(rolldice==1 || rolldice==3) //if rolldice is odd and 1 or 3 jump (Again roll the dice)
                {
                    System.out.println("JUMP");
                    continue;
                }else if(rolldice ==5) //if rolldice is 5 add 3 points
                {
                    points+=3;
                }
            }
            
        }
        System.out.println("The player Score is :"+points); //display the player score
    }
}

/*
 * Output 1:
 * Game Start with 0 Points
Roll the dice 3
JUMP
Roll the dice 2
Roll the dice 1
JUMP
Roll the dice 3
JUMP
Roll the dice 2
Roll the dice 0
The player Score is :4
 */

 /*
  * Output 2:
  Game Start with 0 Points
Roll the dice 1
JUMP
Roll the dice 1
JUMP
Roll the dice 4
Roll the dice 5
Roll the dice 4
Roll the dice 0
The player Score is :7
  */