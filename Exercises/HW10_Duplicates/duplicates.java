import pkg.*;
import java.util.Scanner;
import java.util.Random;


class duplicates {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[20];
		int c2 = 0;
		int c;
		
		System.out.println("Elements: ");
		for(c = 0; c<x.length; c++){		// array generator
			x[c] = rand.nextInt(10)+1;
			System.out.print(x[c]+" ");
		}
		
		int target = rand.nextInt(10)+1;
		System.out.println();
		System.out.println("Target: "+target);
		
		System.out.print("Indicies for targets in array: ");
		for(c=0; c<x.length; c++){				// target detector
			if(x[c]==target){
				System.out.print(c+" ");
				c2++;
			}
		}
		System.out.println();
		System.out.println("Number of duplicates: "+c2);
		
		System.out.print("Two in a rows: ");
		for(c=0; c<x.length-1; c++){			//2 in a row checker
			if(x[c]==x[c+1]){
				System.out.print("Indicies "+c+" and "+(c+1)+" are both "+x[c]+". ");
			}
		}
		System.out.println();
	}
	
}
