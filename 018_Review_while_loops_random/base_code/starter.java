import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
{
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int rando = 1 + rand.nextInt(1000);
	System.out.println("I am thinking of a whole number between 1 and 1000.\nTry to guess what it is. You have unlimited tries.\nRemember to press enter after each guess. Good luck!");
	int guess = sc.nextInt();
	boolean right = guess==rando;
	boolean wrong = guess!=rando;
	int tries = 1;
	while(true)
	{
		if(guess!=rando)
		{
			System.out.println("Incorrect. Please try again.");
			guess = sc.nextInt();
		}	
		if(guess==rando)
		{
			break;
		}
		tries = tries + 1;
	}
	System.out.println("Great job! You guessed my number correctly on Try #" + tries + ". Rerun program to try again.");
	
}


		
	}
}
