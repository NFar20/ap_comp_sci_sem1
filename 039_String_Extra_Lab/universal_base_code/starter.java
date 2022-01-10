import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	Scanner sc = new Scanner(System.in);
	System.out.println("Give me a phrase:");
	String phrase = sc.nextLine();
	int[] spaces = new int[phrase.length()];
	int c2 = phrase.length();
	int c3;
	int c;
	for(c = phrase.length()-1; c>0; c--){
		boolean check = (phrase.substring(c,c+1)).equals(" ");
		if(check){
			c3=c2;
			c2=c+1;
			System.out.print(phrase.substring(c2,c3)+" ");
		}
	}
	System.out.print(phrase.substring(0,c2));
	System.out.println();
	}
}
