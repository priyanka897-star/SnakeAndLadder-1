package snakeandladdergame;

public class SnakeAndLadder {
	public static void main(String[] args) {
	//int startPoint = 0; 
	//System.out.println("start position "+ startPoint);
	int dice = (int)((Math.random()*10) % 6);
	System.out.println("random number is:" +dice);   
    int position  = (int)(Math.random()*10) % 3;
    int presentPosition = 70;
    int ladder = 1;
    int snake = 2;
    switch(dice)
    {
    case 0: 
    	System.out.println("No Movement");
    	break;
    case 1: 
    position = ladder;
    presentPosition +=8;
    System.out.println("Ladder move forward "+ presentPosition);
    break;
    case 2:
    position = snake;
    presentPosition -=10;
    System.out.println("Snakes move backward "+ presentPosition);
    break;
    default :
    presentPosition +=dice;
    System.out.println("Movement to " +presentPosition );
    }
}
}