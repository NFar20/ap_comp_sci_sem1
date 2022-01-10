import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int randone = rand.nextInt(1000);
		int y = 1000;
		int z = 1;
		System.out.println("I'm thinking of a number between 1 and 1000. Try to guess what  it is.");
		int guess = sc.nextInt();
		boolean x = guess==(randone + 1);
		boolean small = guess<z;
		boolean big = guess>y;
		if(small || big)
		{
			System.out.println("Your number was not in the correct range. Please rerun program to try again with a different number");
		}
		else
		{
			if(x)
				System.out.println("Congratulations! You are correct. The chance of that happening was 1 in 1000.");
			else
			{
				System.out.println("Sorry, you were wrong. Rerun program to try again with a different number.");
			}
		}	
	}	
	}
}
