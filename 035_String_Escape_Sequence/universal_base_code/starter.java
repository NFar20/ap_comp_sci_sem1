import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your biggest pet peeve?");
		String answer = sc.nextLine();
		System.out.print("Really? That's it?\nYou're really bothered by \""+answer+"\" when there are children starving to death all over the world?\nStop being so self-centered.\nGo educate yourself.\n");

	}
}
