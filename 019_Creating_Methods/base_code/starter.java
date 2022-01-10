import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a) {
		String one = a;
 		System.out.println(one);
 		return;
	}
	public static void toStringCombined(String a, String b) {
		String first = a;
		String second = b;
		System.out.println(first + " " + second);
		return;
	}
	
	public static void main(String args[]) {
		// Your code goes below here

	String one = new String("Goodbye");
	toString(one);
	String first = new String("apples");
	String second = new String("bananas");
	toStringCombined(first,second);
	}
	}
