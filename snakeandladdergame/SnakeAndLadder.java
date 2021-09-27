package snakeandladdergame;

public class SnakeAndLadder {
	public static void main(String[] args) {
	int startPoint = 0; 
	System.out.println("start position "+ startPoint);
	int randomNumber = (int)((Math.random()*10) % 6)+1;
	System.out.println("random number is:" +randomNumber); 
}
}