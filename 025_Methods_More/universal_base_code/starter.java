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
	
	System.out.println("Strength: ");
	int str = one.setStrength(sc.nextInt());
	
	System.out.println("Dexterity: ");
	int dex = one.setDexterity(sc.nextInt());
	
	System.out.println("Intelligence: ");
	int intl = one.setIntelligence(sc.nextInt());
	
	System.out.println("Constitution: ");
	int con = one.setConstitution(sc.nextInt());
	
	System.out.println("Charisma: ");
	int cha = one.setCharisma(sc.nextInt());
	
	one.setRole(input);
	one.myToString();
	System.out.println(one.setAll(input, str, dex, intl, con, cha));
	}
}
