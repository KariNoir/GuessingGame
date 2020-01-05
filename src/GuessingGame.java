import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner number = new Scanner(System.in);
		System.out.println("Guess a number");
		
		int numberG = number.nextInt();
		
		int guessingAttempts = 0;
		
		while(guessingAttempts <3) {
			//System.out.println(";three tries");
			guessingAttempts +=1;
		
		if(numberG == -1) {
			System.out.println("you lost");
			System.exit(numberG);
			}
		
				
		else if(numberG == 7) {
			System.out.println("You are a winner");
			break;
		}
			else if(numberG == 0) {
			  System.out.println("choose a number between 0-10");
		
			}
			else if(numberG < 7 ) {
				System.out.println("the secret number is greater than your guess.  Guess again...");
			}
			else if(numberG > 7 ) {
				System.out.println("the secret number is less than your guess.  Guess again");
			}
			
			else {
				System.out.println("You are wrong!  Please guess again");
			}
				
		}
		number.close();
	}
}
	

