import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println(Math.max(13 - 6 * 11 , 30 % 7 * (-2)));
		System.out.println(Math.sqrt(3 * 8 + 31 % 7));
		System.out.println(Math.pow(37 / 3 , 35 % 21));
		System.out.println(Math.max(Math.pow(2 , 14 % 3) , Math.sqrt(2 * 6)));
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer value and press enter");
		int x = sc.nextInt();
		System.out.println("Now input another integer");
		int y = sc.nextInt();
		int max = Math.max(x,y);
		double root = Math.sqrt(y);
		double power = Math.pow(x,y);
		System.out.println("The larger number of the two is " + max + ", the sqaure root of your second number is " + root + ", and your first number raised to the power of your second number is " + power + ". Have a great day!");
	}
}
