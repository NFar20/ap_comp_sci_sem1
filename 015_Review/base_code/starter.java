import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your character name.");
			String name = sc.nextLine();
		
			System.out.println("Enter your title.");
			String title = sc.nextLine();
		
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
			
			int total = 25;
			
			String stupid = new String("Since you are not competent enough to do this correctly, you get 0 points for this skill.");
			
			if(w || wa || r || W || Wa || R)
			{
				System.out.println("Excellent choice!");
				System.out.println("You will now choose the starter levels for all of your stats. You have 25 points to spend, and each ability has a maximum level of 10. Choose wisely. (Whole numbers only)");
			System.out.println("Input the number of points you would like to spend for each ability. You will know how many you have left after each skill.");
			
			System.out.println("Strength (buff and able to carry larger items): ");
			int strength = sc.nextInt();
			if(strength>10 || strength<0)
			{
				System.out.println("That was not a valid number. Please try again.");
				strength = sc.nextInt();
				if(strength>10 || strength<0)
					{
						System.out.println(stupid);
						strength = 0;
					}
			}
			total = total - strength;
					
			System.out.println("You have " + total + " points left");
			System.out.println("Dexterity (agile and faster movement): ");
			int dexterity = sc.nextInt();
			if(dexterity>10 || dexterity<0)
				{
					System.out.println("That was not a valid number. Please try again.");
					dexterity = sc.nextInt();
					if(dexterity>10 || dexterity<0)
					{
						System.out.println(stupid);
						dexterity = 0;
					}
				}
				total = total-dexterity;
				
				System.out.println("You have " + total + " points left.");
				System.out.println("Intelligence (better at magic spells): ");
				int intelligence = sc.nextInt();
				if(intelligence>10 || intelligence<0)
				{
					System.out.println("That was not a valid number. Please try again.");
					intelligence = sc.nextInt();
					if(intelligence>10 || intelligence<0)
					{
						System.out.println(stupid);
						intelligence = 0;
					}
				}
				total = total-intelligence;
								
				System.out.println("You have " + total + " points left.");
				System.out.println("Constitution (amount of health): ");
				int constitution = sc.nextInt();
				if(constitution>10 || constitution<0)
				{
					System.out.println("That was not a valid number. Please try again.");
					constitution = sc.nextInt();
					if(constitution>10 || constitution<0)
					{
						System.out.println(stupid);
						constitution = 0;
					}
				}
				total = total-constitution;
				System.out.println("You have " + total + " points left.");
				System.out.println("Charisma (how personable): ");
				int charisma = sc.nextInt();
				if(charisma>10 || charisma<0)
				{
					System.out.println("That was not a valid number. Please try again.");
					charisma = sc.nextInt();
					if(charisma>10 || charisma<10)
					{
						System.out.println(stupid);
						charisma = 0;
					}
				}
				total = total-charisma;
					
				if(total<0 || total>25)
				System.out.println("The sum of your total skill points must be 25 or less. Rerun program");
					
				else if(strength>10 || dexterity>10 || intelligence>10 || constitution>10 || charisma>10 || strength<0 || dexterity<0 || intelligence<0 || constitution<0 || charisma<0)
				System.out.println("Each skill can only have a maximum of 10 points. You cannot give negative points to skills either. Rerun program.");
				else
					{
						System.out.println("Great job! You finished constructing your character. Your character is " + name + " the " + title + ". You have " + strength + " strength, " + dexterity + " dexterity, " + intelligence + " intelligence, " + constitution + " constitution, and " + charisma + " charisma. You have " + total + " remaining skill points. Have fun on your adventures!");
					}
			}
			else
			{
			System.out.println(choice + " was not one of the options. Rerun program to try again.");
			}
	
										}
								}
							}