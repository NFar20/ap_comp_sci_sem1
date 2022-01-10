import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		int left = rand1.nextInt(10) + 1;
		int mid = rand2.nextInt(10) + 1;
		int right = rand3.nextInt(10) + 1;
		
		int cash = 100;
		
		System.out.println("Welcome to the casino. Would you like to begin? Yes, yes, Y, or y");
		String play = sc.nextLine();
		boolean yes = play.equals("yes");
		boolean Yes = play.equals("Yes");
		boolean Y = play.equals("Y");
		boolean y = play.equals("y");
		if(yes || Yes || Y || y){
			System.out.println("If you get two of the same number, you will double your wager. If you get 3 of the same number you will triple your wager. Please place a wager less than or equal to your balance ($100).");
			int bet = sc.nextInt();
			if(bet<0 || bet>cash){
				System.out.println("That was not a valid bet. Your bet must be positive and less than your balance. Try again.");
				bet=sc.nextInt();
				if(bet>cash || bet<0){
					System.out.println("That was incorrect again, so your bet has been set to a default of 10.");
					bet=10;
				}
			}
			System.out.println(left+"\t"+mid+"\t"+right);
			if(left==mid && mid==right){
				bet=3*bet;
			}
			else if(left==mid || left==right || mid==right){
				bet=2*bet;
			}
			else{
				bet=0-bet;
			}
			cash = cash+bet;
			System.out.println("Your new balance is $"+cash);
			while(true){	
				if(cash<=0){
					System.out.println("You have run out of money.");
					break;
				}	
				System.out.println("Would you like to play again? Yes, yes, Y, or y. Type anything else to end game.");
				String spacer = sc.nextLine();
				play=sc.nextLine();
				
				Yes=play.equals("Yes");
				yes=play.equals("yes");
				Y=play.equals("Y");
				y=play.equals("y");
				if(!Yes && !yes && !y && !Y){
					System.out.println("You have ended the game. Your balance is $"+cash+".");
					break;
				}
				else{
				System.out.println("Please enter a wager.");
				bet=sc.nextInt();
				if(bet>cash){
					System.out.println("You don't have enough money for that bet. Please try again.");
					bet=sc.nextInt();
					if(bet>cash){
						System.out.println("That was too large again. Rerun program.");
						break;
					}
				}	
				if(bet<0){
					System.out.println("You cannot bet negative amounts. Please try again.");
					bet = sc.nextInt();
					if(bet<0){
						System.out.println("That was negative again. Rerun program.");
						break;
					}
				}
				mid = rand2.nextInt(10)+1;
				left = rand1.nextInt(10)+1;
				right = rand3.nextInt(10)+1;
				if(left==mid && mid==right){
					bet=3*bet;
				}
				else if(left==mid || left==right || mid==right){
					bet=2*bet;
				}
				else{
					bet=0-bet;
				}
				cash = cash+bet;
				System.out.println(left+"\t"+mid+"\t"+right);
				System.out.println("\nYour new balance is $"+cash);
				}
			}
		}
		else
		System.out.println("I do not recognize that. If you would like to play rerun program and choose a valid option.");
		
		
	}
}
