import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		String give = "Give me your first and last name:";
		System.out.println(give);
		String name = sc.nextLine();
		String test = " ";
		int space = name.indexOf(test);
		while(space<=0){
			System.out.println("That was not a valid first and last name. Please try again.");
			name = sc.nextLine();
			space=name.indexOf(test);
		}
		if(space>0){
			System.out.println("Your last name is "+name.substring(space+1));
		}
		}
	}
