import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Remember to hit enter after all answers!");
		
			System.out.println("What is your first name?");
			String name = sc.nextLine();
		
			System.out.println("How old are you?");
			int age = sc.nextInt();
		
			System.out.println("Which month were you born in (number)?");
			int month = sc.nextInt();
		
			System.out.println("What day of the month were you born on? (just the number)");
			int day = sc.nextInt();
		
			System.out.println("What year were you born in?");
			int year = sc.nextInt();
		
			System.out.println("How much is a buck fifty in dollars?");
			double dollarfifty = sc.nextDouble();
		
			System.out.println("Have a nice day!");
		}
	}
}
