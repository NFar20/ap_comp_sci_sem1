import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a number and I will count from that number to the number 4 greater than it.");
	int x = sc.nextInt();
	int y = x+4;
	while(true){
	{
		System.out.println(x);
	}
	if(x==y)
	break;
	x=x+1;
	}
	}
}
