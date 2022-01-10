import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose your class. Would you like to be a Wizard, Warrior, or Rogue?");
			String choice = sc.nextLine();
			String Wiz = new String("Wizard");
			String wiz = new String("wizard");
			String War = new String("Warrior");
			String war = new String("warrior");
			String Rog = new String("Rogue");
			String rog = new String("rogue");
			boolean w = choice.equals(wiz);
			boolean W = choice.equals(Wiz);
			boolean wa = choice.equals(war);
			boolean Wa = choice.equals(War);
			boolean r = choice.equals(rog);
			boolean R = choice.equals(Rog);
			if(w || wa || r || W || Wa || R)
			System.out.println("Excellent choice! You have chosen the " + choice + " class. I wish you luck on your upcoming adventures.");
			else
			System.out.println(choice + " was not one of the options. Rerun program to try again.");
		}
	}
}
