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
			int x = randone + 1;
			System.out.println("I'm thinking of a number between 1 and 1000. Try to guess what  it is.");
			int guess = sc.nextInt();
			boolean correct = guess==x;
			boolean greater = guess>x;
			boolean wrongMore = guess>1000;
			boolean wrongSmall = guess<1;
			if(correct)
			{
				System.out.println("Wow! You got it. The chance of that happening was 1 in 1000.");
			}
			else if(wrongMore || wrongSmall)
			{
				System.out.println("Please input a number within the specified range. Rerun program to try again");
			}
			else if(greater)
			System.out.println("Unfortunately, your number is greater than mine. Rerun program to try again with a different number.");
			else
			System.out.println("I'm sorry, your number is less than mine. Rerun program to try again with a different number");
		}
	}
}
