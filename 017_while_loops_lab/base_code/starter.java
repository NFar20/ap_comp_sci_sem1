import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("How many times do you want your name to be typed?");
		int times = sc.nextInt();
		while(true)
		{
			System.out.print(name);
			if(times==0)
			{
				break;
			}
			times=times-1;
		}
	}
		
	}
}
