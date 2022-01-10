import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("(ax+b)(cx+d)");
		System.out.println("a:");
		int a = sc.nextInt();
		System.out.println("b:");
		int b = sc.nextInt();
		System.out.println("c:");
		int c = sc.nextInt();
		System.out.println("d:");
		int d = sc.nextInt();
		int A = a*c;
		int B = a*d+b*c;
		int C = b*d;
		System.out.println(A+"x^2+"+B+"x+"+C);
		
		
	}
}
