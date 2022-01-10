import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
		{
			Random rand1 = new Random();
			int rand_num1 = rand1.nextInt(10);
			System.out.println(rand_num1);
			
			Random rand2 = new Random();
			int rand_num2 = rand2.nextInt(100);
			System.out.println(rand_num2 + 1);
			
			Random rand3 = new Random();
			double rand_num3 = rand3.nextDouble();
			System.out.println(rand_num3 + 2.5);
			
			Random rand4 = new Random();
			int rand_num4 = rand4.nextInt(589);
			System.out.println(rand_num4 + rand_num3 + 14);
		}
	}
}
