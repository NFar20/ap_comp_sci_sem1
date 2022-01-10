import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Name your cat:");
		String user = sc.nextLine();
		Cat test = new Cat(user);
		Cat gar = new Cat();
		test.meow();
		gar.meow();
		


		
	}
}
