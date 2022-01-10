import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static boolean primeCheck(int a) {
		boolean notPrime = 0==1;
		boolean Prime = 0==0;
		int input = a;
		int count = input;
		
		if(input==1 || input==0){
			System.out.println("0 and 1 are neither prime nor composite.");
			return notPrime;
		}
		
		while(true) {
			count=count-1;
			if(count<2){
				return Prime;
			}
			int check = input%(count);
			
			boolean not = check!=0;
			boolean yes = check==0;
			if(yes){
				return notPrime;
			}
		}
	}
	
	public static void printPrimes(int a) {
		int input = a;
		int count = input;
		boolean og = primeCheck(input);
		if(og){
			System.out.println(input);
		}
		while(true){
			count=count-1;
			if(count<=2){
				break;
			}
			int check=input%(count-1);
			boolean checkPrint = primeCheck((count-1));
			
			if(checkPrint){
				System.out.println(count-1);
			}
		}
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number and I'll tell you if it is prime. You will see all of the prime numbers less than or equal to your number.");
		int x = sc.nextInt();
		printPrimes(x);
	}
}
