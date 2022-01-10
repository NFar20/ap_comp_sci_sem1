import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static String div3(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number.");
		int x = sc.nextInt();
		System.out.println("Now input another one.");
		int y = sc.nextInt();
		int w = x * y;
		int mod = w % 3;
		boolean z = mod==0;
		String yes = new String("The product of your numbers is divisible by 3.");
		String no = new String("The product of your numbers is not divisible by 3.");
		if(z){
			return yes;
		}
		else{
			return no;
		}
		
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String hello = div3();
		System.out.println(hello);


		
	}
}
