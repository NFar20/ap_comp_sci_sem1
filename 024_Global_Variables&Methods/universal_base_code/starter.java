import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your role (Wizard, Warrior, or Rogue): ");
		String input = sc.nextLine();
		myCharacter one = new myCharacter(input);
		one.myToString();


		
	}
}
