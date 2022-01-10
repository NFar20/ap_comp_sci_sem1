import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Input an integer");
			int one = sc.nextInt();
			System.out.println("Now type a different integer");
			int two = sc.nextInt();
			boolean result = one!=two;
			boolean stupid = one==two;
			if(result)
			{
				System.out.println("Good job! You put in 2 different values");
			}
			if(stupid)
			{
				System.out.println("I guess you can't read. I said DIFFERENT, idiot.");
			}
		}
	}
}
