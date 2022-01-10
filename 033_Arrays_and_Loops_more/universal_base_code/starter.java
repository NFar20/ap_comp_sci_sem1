import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int c=0;
		int min =1000;
		int max=0;
		int total=0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Number of elements (51-200): ");
		int x = sc.nextInt();
		while(x<51 || x>200){
			System.out.println("Invalid value. Must be between 51 and 200.");
			x=sc.nextInt();
		}
		int[] test = new int[x];
		
		System.out.print(x+" random numbers: ");
		while(c<test.length){	//element creator
			test[c]=1+rand.nextInt(100);
			System.out.print(test[c]+" ");
			c++;
		}
		
		System.out.println();
		c=0;
		
		while(c<test.length){	//max loop
			if(test[c]>max){
				max=test[c];
			}
			c++;
		}
		System.out.println("The maximum value is: "+max);
		
		c=0;
		
		while(c<test.length){	//min loop
			if(test[c]<min){
				min=test[c];
			}
			c++;
		}
		System.out.println("The minimum value is: "+min);
		
		c=0;
		
		while(c<test.length){	//average loop
			total=total+test[c];
			c++;
		}
		int avg =total/x;
		System.out.println("The average of your values (between 1 and 100) is: "+avg);
	}
}
