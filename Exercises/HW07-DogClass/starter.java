import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog one = new Dog("John",5);
		String name1 = new String(one.getName());
		Dog two = new Dog("Joseph","golden retriever");
		String name2 = new String(two.getName());
		boolean sleep = one.isSleeping();
		if(sleep){
			System.out.println(name1+" is sleeping");
		}
		else{
			one.bark();
		}
		if(two.isSleeping()){
			if(!sleep){
				two.bark();
			}
			else{
				System.out.println(name2+" is sleeping");
			}
		}
		else if(sleep){
		}
		else{
			two.bark();
		}
	}
}
