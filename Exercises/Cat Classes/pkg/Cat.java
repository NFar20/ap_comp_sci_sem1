package pkg;
import java.util.Scanner;
import java.util.Random;


public class Cat{
	public String name;
	public Cat() {
		name = ("Garfield");
	}
	public Cat(String a){
		name = a;
	}
	public void meow(){
		System.out.println("Your cat's name is "+name+". "+name+" meows at Garfield.");
	}

}
