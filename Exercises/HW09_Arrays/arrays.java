import pkg.*;
import java.util.Scanner;
import java.util.Random;


class arrays {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	int[] base = new int[20];
	int count=0;
	
	System.out.print("20 random numbers: ");
	while(count<base.length){
		base[count]=rand.nextInt(50)+1;
		System.out.print(base[count]+" ");
		count++;
	}
	
	System.out.println();
	count--;
	
	int[] rev = new int[20];
	System.out.print("These are the same numbers in reverse: ");
	while(count>=0){
		rev[rev.length-count-1]=base[count];
		System.out.print(rev[rev.length-count-1]+" ");
		count--;
	}
	
	System.out.println();

	}
}
