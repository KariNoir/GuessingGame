import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner number = new Scanner(System.in);
		System.out.println("Guess a number");

		int numberG = number.nextInt();

		int guessingAttempts = 1;
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(4-0); //the random numbers range. change back to 11-0 and finish.
		

		while (guessingAttempts < 3) {
			System.out.println(";You get three tries");
			if (guessingAttempts == -1) {
			System.out.println("You lose!!!");
			}

			// while(guessingAttempts !=7 || guessingAttempts !=0) {
			// System.out.println(";three tries");
			// guessingAttempts = number.nextInt();

			if (numberG == randomNumber) {
				System.out.println("You are a winner");
				break;
			} else if (numberG == -1) {
				System.exit(numberG);
				
			} else if (numberG == 0) {
				System.out.println("choose a number between 1-10");
				numberG = number.nextInt();
				guessingAttempts += 1;
			}
			else {
				System.out.println("You are wrong!  Please guess again");
				
			} if (randomNumber > numberG ) {
				System.out.println("the secret number is greater than your guess.  Guess again...");
				numberG = number.nextInt();
			} else {
				System.out.println("the secret number is less than your guess.  Guess again...");
				numberG = number.nextInt();	
			}
				guessingAttempts += 1;
		}
		number.close();
	}
}
