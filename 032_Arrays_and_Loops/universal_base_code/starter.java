import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] arnold;
		arnold = new int[1000];
		int count1 = 0;
		int count2 = 0;
		while(count1<arnold.length) {
			arnold[count1]=rand.nextInt(1000)+1;
			count1++;
		}
		while(count2<arnold.length) {
			System.out.println(arnold[count2]);
			count2++;
		}


		
	}
}
